package cn.tedu.min.service.impl;

import cn.tedu.min.common.entity.Shop;
import cn.tedu.min.common.entity.Staff;
import cn.tedu.min.common.entity.dto.AddShopDTO;
import cn.tedu.min.common.entity.dto.ShopDTO;
import cn.tedu.min.common.entity.dto.UpdateShopDateilDTO;
import cn.tedu.min.common.entity.vo.ShopDetailVO;
import cn.tedu.min.common.entity.vo.StaffDetailVO;
import cn.tedu.min.exception.ServiceException;
import cn.tedu.min.mapper.ShopMapper;
import cn.tedu.min.mapper.StaffMapper;
import cn.tedu.min.service.IShopService;
import cn.tedu.min.web.State;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShopServiceImpl implements IShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public  void addShop(AddShopDTO addShopDTO) {
        log.info("判断门店名称是否存在同名");

        String  shopName= addShopDTO.getName();
        Shop shop = shopMapper.shopNamegetShopDetail(shopName);

        System.out.println("===================="+shop);
        System.out.println(addShopDTO);
        if (shop!=null){

            log.info("门店名字已存在,添加失败");

            throw new ServiceException(State.ERR_INSERT,"门店名称重复");

        }
        log.info("查询员工信息 ");
        StaffDetailVO staffDetailVO = staffMapper.staffNumIdGetStaffDetail(addShopDTO.getStaffNum());
        if(staffDetailVO==null){
            throw  new ServiceException(State.ERR_CATEGORY_NOT_FOUND,"没有此员工信息");
        }
        Shop shop1 = new Shop();
        shop1.setId(null);
        shop1.setName(addShopDTO.getName());
        shop1.setAddress(addShopDTO.getAddress());
        shop1.setMarks(addShopDTO.getMarks());
        log.info("把店铺名称写入到数据库");
        int shopRows = shopMapper.addShop(shop1);
        if (shopRows!=1){
            log.info("返回值不为1,插入失败");
            throw new ServiceException(State.ERR_CATEGORY_ISHIDE,"服务器繁忙,请稍后再试");
           }


    }

    @Override
    public ShopDetailVO selectByIdShopDetail( ShopDTO shopDTO) {
        ShopDetailVO shopDetailVO = shopMapper.getShopDetail(shopDTO);

        return shopDetailVO;
    }

    @Override
    public void updateShopDetail(UpdateShopDateilDTO updateShopDateilDTO) {
        Integer shopId = updateShopDateilDTO.getId();
        //判断有没有此店
        Shop byIdShop = shopMapper.getByIdShop(shopId);
        log.info("判断店铺是否存在");
        if (byIdShop==null){
            log.info("不存在,抛出异常");
            throw  new ServiceException(State.ERR_INSERT,"服务器繁忙，请稍后再试");
        }
        //判断有没有此员工
        log.info("判断是否有此员工");
        Integer staffNum = updateShopDateilDTO.getStaffNum();
        StaffDetailVO staffDetailVO = staffMapper.staffNumIdGetStaffDetail(staffNum);
        if (staffDetailVO==null){
            log.info("没有员工,抛出异常");
            throw new ServiceException(State.ERR_BAD_REQUEST,"没有员工信息");
        }
        log.info("员工存在,开始修改数据");
        //修改员工表的shopid
        Staff staff = new Staff();
        staff.setStaffNum(updateShopDateilDTO.getStaffNum());
        String staffShopId = Integer.toString(shopId);
        staff.setShopId(staffShopId);
        staff.setTel(updateShopDateilDTO.getTel());
        int rows = staffMapper.updateStaffMessage(staff);
        if (rows!=1){
            throw new ServiceException(State.ERR_BRAND_DUPLICATE,"服务器繁忙,请稍后再试");
        }
        log.info("员工信息修改完成");

        log.info("修改店铺信息");

        Shop shop = new Shop();
        shop.setId(updateShopDateilDTO.getId());
        shop.setName(updateShopDateilDTO.getName());
        shop.setAddress(updateShopDateilDTO.getAddress());
        shop.setMarks(updateShopDateilDTO.getMarks());
        int i = shopMapper.updateShopMessage(shop);
        if (i!=1){
            throw new ServiceException(State.ERR_BAD_REQUEST,"服务器繁忙,请撒后后再试");
        }

        log.info("修改完成");

        //修改店铺名称
    }
}
