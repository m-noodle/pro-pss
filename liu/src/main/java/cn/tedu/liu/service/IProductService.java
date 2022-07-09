package cn.tedu.liu.service;

import cn.tedu.liu.pojo.dto.ProductAddDTO;
import cn.tedu.liu.pojo.entity.Product;
import cn.tedu.liu.pojo.vo.ProductDetailVO;
import cn.tedu.liu.web.JsonResult;

public interface IProductService {


    /**
     * 新增商品
     * @param addDTO
     * @return
     */
    void addNew(ProductAddDTO addDTO);

    /**
     * 根据id查询商品详情
     * @param proid
     * @return
     */
    ProductDetailVO getById(Integer proid);
}
