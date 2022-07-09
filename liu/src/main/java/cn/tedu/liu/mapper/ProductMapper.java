package cn.tedu.liu.mapper;


import cn.tedu.liu.pojo.entity.Product;
import cn.tedu.liu.pojo.vo.ProductDetailVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {


    /**
     * 新增商品
     * @param product
     * @return
     */
    int addNew(Product product);

    /**
     * 根据商品id删除商品
     * @param proid
     * @return
     */
    int deleteById(Integer proid);

    /**
     * 修改商品信息
     * @param product
     * @return
     */
    int updateById(Product product);

    /**
     * 根据id查询商品详情
     * @param proid
     * @return
     */
    ProductDetailVO getById(Integer proid);

    /**
     * 查询对应供应商的商品名称
     * @param supname
     * @return
     */
    String[] listPnameBySupname(String supname);

    /**
     *根据商品类别查询商品列表
     * @param protype
     * @return
     */
    List<ProductDetailVO> getByProtype(String protype);


    /**
     * 根据商品名称查询商品列表
     * @param pname
     * @return
     */
    List<ProductDetailVO> getByPname(String pname);

    /**
     * 根据供货商名称查询商品列表
     * @param supname
     * @return
     */
    List<ProductDetailVO> getBySupname(String supname);


    /**
     * 分页查询所有商品信息
     * @return
     */
    List<ProductDetailVO> listAll();

}
