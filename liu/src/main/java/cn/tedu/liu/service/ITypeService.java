package cn.tedu.liu.service;

import cn.tedu.liu.pojo.dto.TypeAddDTO;
import cn.tedu.liu.pojo.dto.TypeDTO;
import cn.tedu.liu.pojo.entity.Type;
import cn.tedu.liu.pojo.vo.TypeVO;
import cn.tedu.liu.web.JsonPage;

import java.util.List;

public interface ITypeService {

    /**
     * 新增商品类型
     * @param type
     * @return
     */
    void addNew(TypeAddDTO type);

    /**
     * 根据id删除商品类型
     * @param proType
     * @return
     */
    void deleteById(Integer proType);

    /**
     * 根据类型名称删除商品类型
     * @param typeName
     * @return
     */
    void deleteByName(String typeName);

    /**
     * 根据类别id修改商品名称
     * @param type
     * @return
     */
    void updateById(TypeDTO type);


    /**
     * 根据id查询商品类型
     * @param proType
     * @return
     */
    TypeVO getById(Integer proType);

    /**
     * 根据名称模糊查询
     * @param typeName
     * @return
     */
    JsonPage<TypeVO> getLikeName(String typeName,Integer page,Integer pageSize);


    /**
     * 查询所有
     * @return
     */
    JsonPage<TypeVO> listAll(Integer page, Integer pageSize);
}
