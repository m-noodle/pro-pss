package cn.tedu.zhu.mapper;

import cn.tedu.zhu.pojo.dto.StockDTO;
import cn.tedu.zhu.pojo.vo.StockVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockMapper {
    List<StockVO> getAllStockInfo(StockDTO stockDTO);

    List<StockVO> getStockInfo(StockDTO stockDTO);
}
