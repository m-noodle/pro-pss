package cn.tedu.liu.service;

import cn.tedu.liu.pojo.dto.ProductAddDTO;
import cn.tedu.liu.pojo.dto.ProductUpdateDTO;
import cn.tedu.liu.pojo.entity.Product;
import cn.tedu.liu.pojo.vo.ProductDetailVO;
import cn.tedu.liu.web.JsonPage;
import cn.tedu.liu.web.JsonResult;

import java.util.List;

public interface IProductService {


    /**
     * 新增商品
     * @param addDTO
     * @return
     */
    void addNew(ProductAddDTO addDTO);

    /**
     * 根据商品id删除商品
     * @param proid
     * @return
     */
    void deleteById(Integer proid);

    /**
     * 修改商品信息
     * @param updateDTO
     * @return
     */
    void updateById(ProductUpdateDTO updateDTO);

    /**
     * 根据id查询商品详情
     * @param proid
     * @return
     */
    ProductDetailVO getById(Integer proid);

    /**
     *根据商品类别查询商品列表
     * @param protype
     * @return
     */
    JsonPage<ProductDetailVO> getByProtype(Integer page, Integer pageSize,String protype);


    /**
     * 根据商品名称查询商品列表
     * @param pname
     * @return
     */
    JsonPage<ProductDetailVO> getByPname(Integer page, Integer pageSize,String pname);

    /**
     * 根据供货商名称查询商品列表
     * @param supname
     * @return
     */
    JsonPage<ProductDetailVO> getBySupname(Integer page, Integer pageSize,String supname);

    /**
     * 分页查询所有
     * @param page
     * @param pageSize
     * @return
     */
    JsonPage<ProductDetailVO> listAll(Integer page, Integer pageSize);
}
