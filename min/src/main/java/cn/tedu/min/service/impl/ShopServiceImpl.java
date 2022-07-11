package cn.tedu.min.service.impl;

import cn.tedu.min.common.entity.dto.AddShopDTO;
import cn.tedu.min.common.entity.dto.ShopDTO;
import cn.tedu.min.common.entity.dto.UpdateShopDateilDTO;
import cn.tedu.min.common.entity.vo.ShopDetailVO;
import cn.tedu.min.mapper.ShopMapper;
import cn.tedu.min.mapper.StaffMapper;
import cn.tedu.min.service.IShopService;
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
    public void addShop(AddShopDTO addShopDTO) {
        log.info("判断门店名称是否存在同名");
        String  shopName= addShopDTO.getName();


    }

    @Override
    public ShopDetailVO selectByIdShopDetail( ShopDTO shopDTO) {
        ShopDetailVO shopDetailVO = shopMapper.getShopDetail(shopDTO);

        return shopDetailVO;
    }

    @Override
    public void updateShopDetail(UpdateShopDateilDTO updateShopDateilDTO) {

    }
}
