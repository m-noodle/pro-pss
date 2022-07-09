package cn.tedu.liu.mapper;


import cn.tedu.liu.pojo.entity.Product;
import cn.tedu.liu.pojo.vo.ProductDetailVO;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {


    /**
     * 新增商品
     * @param product
     * @return
     */
    int addNew(Product product);

    /**
     * 根据id查询商品详情
     * @param proid
     * @return
     */
    ProductDetailVO getById(Integer proid);

}
