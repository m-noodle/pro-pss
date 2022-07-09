package cn.tedu.zhu.service;

import cn.tedu.zhu.pojo.dto.StockDTO;
import cn.tedu.zhu.pojo.vo.StockVO;
import cn.tedu.zhu.restful.JsonPage;

public interface IStockService {
    JsonPage<StockVO> selectStockInfo(StockDTO stockDTO);
}
