package cn.tedu.liu.service.impl;

import cn.tedu.liu.exception.ServiceException;
import cn.tedu.liu.mapper.ProductMapper;
import cn.tedu.liu.pojo.dto.ProductAddDTO;
import cn.tedu.liu.pojo.entity.Product;
import cn.tedu.liu.pojo.vo.ProductDetailVO;
import cn.tedu.liu.service.IProductService;
import cn.tedu.liu.web.State;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper mapper;

    @Override
    public void addNew(ProductAddDTO addDTO) {
        log.info("新增商品业务");
        Product product = new Product();
        BeanUtils.copyProperties(addDTO,product);
        int row = mapper.addNew(product);
        if (row == 0){
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
}
