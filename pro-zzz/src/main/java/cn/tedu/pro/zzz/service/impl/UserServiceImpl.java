package cn.tedu.pro.zzz.service.impl;

import cn.tedu.pro.zzz.pojo.dto.StockDTO;
import cn.tedu.pro.zzz.mapper.UserMapper;
import cn.tedu.pro.zzz.restful.JsonPage;
import cn.tedu.pro.zzz.service.IUserService;
import cn.tedu.pro.zzz.pojo.vo.StockVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public JsonPage<StockVO> selectStockInfo(StockDTO stockDTO) {
        if (stockDTO.getId()==null && stockDTO.getProId()==null
                && stockDTO.getPname()==null && stockDTO.getIndate()==null){
            log.info("输入的值为空时,查询全部");
            PageHelper.startPage(stockDTO.getPage(),stockDTO.getPageSize());
            List<StockVO> stockVOList=userMapper.getAllStockInfo(stockDTO);
            return JsonPage.restPage(new PageInfo<>(stockVOList));
        }else {
            List<StockVO> stockVOList=userMapper.getStockInfo(stockDTO);
            return JsonPage.restPage(new PageInfo<>(stockVOList));
        }
    }
}
