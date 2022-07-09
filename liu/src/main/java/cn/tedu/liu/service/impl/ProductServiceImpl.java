package cn.tedu.liu.service.impl;

import cn.tedu.liu.exception.ServiceException;
import cn.tedu.liu.mapper.ProductMapper;
import cn.tedu.liu.pojo.dto.ProductAddDTO;
import cn.tedu.liu.pojo.dto.ProductUpdateDTO;
import cn.tedu.liu.pojo.entity.Product;
import cn.tedu.liu.pojo.vo.ProductDetailVO;
import cn.tedu.liu.service.IProductService;
import cn.tedu.liu.web.JsonPage;
import cn.tedu.liu.web.State;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper mapper;

    @Override
    public void addNew(ProductAddDTO addDTO) {
        log.info("新增商品业务");
        String supname = addDTO.getSupname();
        String name = addDTO.getPname();
        String[] pnames = mapper.listPnameBySupname(supname);
        for (String pname:pnames) {
            if (pname.equals(name)){
                throw new ServiceException(
                        State.ERR_PRODUCT_DUPLICATE,"商品已存在!");
            }
        }
        Product product = new Product();
        BeanUtils.copyProperties(addDTO,product);
        int row = mapper.addNew(product);
        if (row == 0){
            throw new ServiceException
                    (State.ERR_UNKNOW,"服务繁忙,请稍后再试!");
        }
    }

    @Override
    public void deleteById(Integer proid) {
        log.info("根据id删除商品");
        int row = mapper.deleteById(proid);
        if (row==0){
            throw new ServiceException
                    (State.ERR_UNKNOW,"服务繁忙,请稍后再试!");
        }
    }

    @Override
    public void updateById(ProductUpdateDTO updateDTO) {
        log.info("动态修改商品信息");
        Product product = new Product();
        BeanUtils.copyProperties(updateDTO,product);
        int row = mapper.updateById(product);
        if (row==0){
            throw new ServiceException
                    (State.ERR_UNKNOW,"服务繁忙,请稍后再试!");
        }
    }


    @Override
    public ProductDetailVO getById(Integer proid) {
        log.info("根据id查询商品");
        ProductDetailVO productDetailVO = mapper.getById(proid);
        if(productDetailVO == null){
            throw new ServiceException
                    (State.ERR_PRODUCT_NOT_FIND,"商品不存在!");
        }
        return productDetailVO;
    }

    @Override
    public JsonPage<ProductDetailVO> getByProtype(Integer page, Integer pageSize,String protype) {
        log.info("根据商品类型查询商品");
        PageHelper.startPage(page,pageSize);
        List<ProductDetailVO> list = mapper.getByProtype(protype);
        return JsonPage.restPage(new PageInfo<>(list));
    }

    @Override
    public JsonPage<ProductDetailVO> getByPname(Integer page, Integer pageSize,String pname) {
        log.info("根据商品类型查询商品");
        PageHelper.startPage(page,pageSize);
        List<ProductDetailVO> list = mapper.getByPname(pname);
        return JsonPage.restPage(new PageInfo<>(list));
    }

    @Override
    public JsonPage<ProductDetailVO> getBySupname(Integer page, Integer pageSize,String supname) {
        log.info("根据供应商查询商品");
        PageHelper.startPage(page,pageSize);
        List<ProductDetailVO> list = mapper.getBySupname(supname);
        return JsonPage.restPage(new PageInfo<>(list));
    }

    @Override
    public JsonPage<ProductDetailVO> listAll(Integer page, Integer pageSize){
        log.info("分页查询商品列表");
        PageHelper.startPage(page,pageSize);
        List<ProductDetailVO> list = mapper.listAll();
        return JsonPage.restPage(new PageInfo<>(list));
    }
}
