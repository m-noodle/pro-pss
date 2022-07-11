package cn.tedu.min;

import cn.tedu.min.common.entity.Shop;
import cn.tedu.min.common.entity.dto.ShopDTO;
import cn.tedu.min.common.entity.vo.ShopDetailVO;
import cn.tedu.min.mapper.ShopMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ShopMapperTest {

    @Autowired
    ShopMapper  shopMapper;


    @Test
    void selectShopDetail(){
     /*   ShopDetailVO shopDetail = shopMapper.shopDetail();
        System.out.println("ShopMapperTest.selectShopDetail:"+shopDetail*/

//        ShopDTO shopDTO =  new ShopDTO();
//        shopDTO.setPage(1);
//        shopDTO.setPageSize(1);
//        shopDTO.setId(1L);
//        List<ShopDetailVO> shopDetailVOS = shopMapper.shopDetail(shopDTO);
//        for (ShopDetailVO s:
//             shopDetailVOS) {
//            System.out.println(s);
//        }

    /*    Shop shop = new Shop();
        shop.setId(null);
        shop.setAddress("武汉分店");
        shopMapper.addShop(shop);*/


    }

}
