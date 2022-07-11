package cn.tedu.min.mapper;

import cn.tedu.min.common.entity.Shop;
import cn.tedu.min.common.entity.Staff;
import cn.tedu.min.common.entity.dto.AddShopDTO;
import cn.tedu.min.common.entity.dto.ShopDTO;
import cn.tedu.min.common.entity.vo.ShopDetailVO;
import javafx.scene.paint.Stop;
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
     * 修改店铺信息
     * @param shop
     * @return
     */
    int  updateShopMessage(Shop shop);

    /**
     *
     * @param shopDTO
     * @return 门店的详细信息
     */
    ShopDetailVO getShopDetail(ShopDTO shopDTO);


    /**
     *
     * @param name
     * @return 门店的详细信息
     */
    Shop shopNamegetShopDetail(String name);

    /**
     * 根据id查询shop信息
     * @param id
     * @return
     */
    Shop getByIdShop(Integer id);

}
