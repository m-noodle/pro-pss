package cn.tedu.zhu.service.impl;

import cn.tedu.zhu.mapper.StockMapper;
import cn.tedu.zhu.pojo.dto.StockDTO;
import cn.tedu.zhu.pojo.vo.StockVO;
import cn.tedu.zhu.restful.JsonPage;
import cn.tedu.zhu.service.IStockService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StockServiceImpl implements IStockService {
    @Autowired
    private StockMapper stockMapper;

    @Override
    public JsonPage<StockVO> selectStockInfo(StockDTO stockDTO) {
        if (stockDTO.getId()==null && stockDTO.getProid()==null
                && stockDTO.getPname()==null && stockDTO.getIndate()==null){
            log.info("输入的值为空时,查询全部");
            PageHelper.startPage(stockDTO.getPage(),stockDTO.getPageSize());
            List<StockVO> stockVOList=stockMapper.getAllStockInfo(stockDTO);
            return JsonPage.restPage(new PageInfo<>(stockVOList));
        }else {
            List<StockVO> stockVOList=stockMapper.getStockInfo(stockDTO);
            return JsonPage.restPage(new PageInfo<>(stockVOList));
        }
    }
}
