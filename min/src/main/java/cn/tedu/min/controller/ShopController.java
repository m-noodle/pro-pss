package cn.tedu.min.controller;

import cn.tedu.min.common.entity.dto.ShopDTO;
import cn.tedu.min.common.entity.vo.ShopDetailVO;
import cn.tedu.min.service.impl.ShopServiceImpl;
import cn.tedu.min.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@Api(tags = "订单模块")
public class ShopController {

    @Autowired
    private ShopServiceImpl  service;

    @PostMapping("/Detail")
    @ApiOperation("根据门店id或门店名称查询商店详情")
    public JsonResult<ShopDetailVO> selectShopDetail(ShopDTO shopDTO){
        ShopDetailVO shopDetailVO = service.selectByIdShopDetail(shopDTO);
        return JsonResult.ok(shopDetailVO);
    }
}
