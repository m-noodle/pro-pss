package cn.tedu.pro.zzz.mapper;

import cn.tedu.pro.zzz.pojo.dto.StockDTO;
import cn.tedu.pro.zzz.pojo.vo.StockVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<StockVO> getAllStockInfo(StockDTO stockDTO);

    List<StockVO> getStockInfo(StockDTO stockDTO);
}
