package cn.tedu.min.service;

import cn.tedu.min.common.entity.dto.AddShopDTO;
import cn.tedu.min.common.entity.dto.ShopDTO;
import cn.tedu.min.common.entity.vo.ShopDetailVO;

public interface IShopService {

    void   addShop(AddShopDTO addShopDTO);

    ShopDetailVO  selectByIdShopDetail(ShopDTO shopDTO);
}