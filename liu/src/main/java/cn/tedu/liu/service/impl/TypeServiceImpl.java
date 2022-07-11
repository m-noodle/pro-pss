package cn.tedu.liu.service.impl;

import cn.tedu.liu.exception.ServiceException;
import cn.tedu.liu.mapper.TypeMapper;
import cn.tedu.liu.pojo.dto.TypeAddDTO;
import cn.tedu.liu.pojo.dto.TypeDTO;
import cn.tedu.liu.pojo.vo.TypeVO;
import cn.tedu.liu.service.ITypeService;
import cn.tedu.liu.web.JsonPage;
import cn.tedu.liu.web.State;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TypeServiceImpl implements ITypeService {

    @Autowired
    private TypeMapper mapper;

    @Override
    public void addNew(TypeAddDTO type) {
        log.info("新增商品类别");
        String typeName = type.getTypeName();
        TypeVO byName = mapper.getByName(typeName);
        if (byName!=null){
            throw new ServiceException(
                    State.ERR_TYPE_DUPLICATE,"类型已存在!"
            );
        }
        int row = mapper.addNew(type);
        if (row==0){
            throw new ServiceException(
                    State.ERR_UNKNOW,"服务器繁忙,请稍后再试!");
        }
    }

    @Override
    public void deleteById(Integer proType) {
        log.info("根据id删除商品类别");
        int row = mapper.deleteById(proType);
        if (row==0){
            throw new ServiceException(
                    State.ERR_UNKNOW,"服务器繁忙,请稍后再试!");
        }
    }

    @Override
    public void deleteByName(String typeName) {
        log.info("根据名称删除商品类别");
        int row = mapper.deleteByName(typeName);
        if (row==0){
            throw new ServiceException(
                    State.ERR_UNKNOW,"服务器繁忙,请稍后再试!");
        }
    }

    @Override
    public void updateById(TypeDTO type) {
        log.info("修改商品类别");
        int row = mapper.updateById(type);
        if (row==0){
            throw new ServiceException(
                    State.ERR_UNKNOW,"服务器繁忙,请稍后再试!");
        }
    }

    @Override
    public TypeVO getById(Integer proType) {
        log.info("根据id查询类别");
        TypeVO type = mapper.getById(proType);
        if (type==null){
            throw new ServiceException(
                    State.ERR_TYPE_NOT_FIND,"类型不存在!");
        }
        return type;
    }

    @Override
    public JsonPage<TypeVO> getLikeName(
            String typeName,Integer page,Integer pageSize) {
        log.info("根据名称模糊查询分页");
        PageHelper.startPage(page,pageSize);
        List<TypeVO> list = mapper.getLikeName(typeName);
        return JsonPage.restPage(new PageInfo<>(list));
    }

    @Override
    public JsonPage<TypeVO> listAll(Integer page,Integer pageSize) {
        log.info("分页查询所有信息");
        PageHelper.startPage(page,pageSize);
        List<TypeVO> list = mapper.listAll();
        return JsonPage.restPage(new PageInfo<>(list));
    }
}
