package cn.tedu.liu.mapper;


import cn.tedu.liu.pojo.dto.TypeAddDTO;
import cn.tedu.liu.pojo.dto.TypeDTO;
import cn.tedu.liu.pojo.entity.Type;
import cn.tedu.liu.pojo.vo.TypeVO;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {
    /**
     * 新增商品类型
     * @param type
     * @return
     */
    int addNew(TypeAddDTO type);

    /**
     * 根据id删除商品类型
     * @param proType
     * @return
     */
    int deleteById(Integer proType);

    /**
     * 根据类型名称删除商品类型
     * @param typeName
     * @return
     */
    int deleteByName(String typeName);

    /**
     * 根据类别id修改商品名称
     * @param type
     * @return
     */
    int updateById(TypeDTO type);


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
    List<TypeVO> getLikeName(String typeName);

    /**
     * 根据名称精准查询
     * @param typeName
     * @return
     */
    TypeVO getByName(String typeName);


    /**
     * 查询所有
     * @return
     */
    List<TypeVO> listAll();
}
