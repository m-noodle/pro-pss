package cn.tedu.min.mapper;

import cn.tedu.min.common.entity.Shop;
import cn.tedu.min.common.entity.Staff;
import cn.tedu.min.common.entity.dto.AddShopDTO;
import cn.tedu.min.common.entity.dto.ShopDTO;
import cn.tedu.min.common.entity.vo.ShopDetailVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopMapper {




    /**
     * 添加门店信息
     * @param shop
     * @return
     */
     int  addShop(Shop shop);







    /**
     *
     * @param shopDTO
     * @return 门店的详细信息
     */
    ShopDetailVO getShopDetail(ShopDTO shopDTO);




}
