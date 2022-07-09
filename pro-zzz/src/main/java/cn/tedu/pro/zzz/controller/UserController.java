package cn.tedu.pro.zzz.controller;

import cn.tedu.pro.zzz.pojo.dto.StockDTO;
import cn.tedu.pro.zzz.restful.JsonPage;
import cn.tedu.pro.zzz.restful.JsonResult;
import cn.tedu.pro.zzz.service.IUserService;
import cn.tedu.pro.zzz.pojo.vo.StockVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
@Api(tags = "进货信息")
public class UserController {
    @Autowired
    private IUserService userService;

    public JsonResult<JsonPage<StockVO>> selectStockInfo(StockDTO stockDTO){
        JsonPage<StockVO> list= userService.selectStockInfo(stockDTO);
        return JsonResult.ok(list);
    }
}
