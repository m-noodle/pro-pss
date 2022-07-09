package cn.tedu.pro.zzz.service;

import cn.tedu.pro.zzz.pojo.dto.StockDTO;
import cn.tedu.pro.zzz.restful.JsonPage;
import cn.tedu.pro.zzz.pojo.vo.StockVO;

public interface IUserService {
    JsonPage<StockVO> selectStockInfo(StockDTO stockDTO);
}
