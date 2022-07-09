package cn.tedu.zhu.controller;

import cn.tedu.zhu.pojo.dto.StockDTO;
import cn.tedu.zhu.pojo.vo.StockVO;
import cn.tedu.zhu.restful.JsonPage;
import cn.tedu.zhu.restful.JsonResult;
import cn.tedu.zhu.service.IStockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
@Api(tags = "进货信息")
public class StockController {
    @Autowired
    private IStockService stockService;

    @GetMapping("/select")
    @ApiOperation("根据StockDTO查询进货信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "订单id",name = "id",required= true,dataType = "int"),
            @ApiImplicitParam(value = "商品id",name = "proid",required= true,dataType = "int"),
            @ApiImplicitParam(value = "商品名称",name = "pname",required= true,dataType = "string"),
            @ApiImplicitParam(value = "进货日期",name = "indate",required= true,dataType = "date"),
            @ApiImplicitParam(value = "页码",name = "page",required= true,dataType = "int"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize",required= true,dataType = "int"),
    })
    public JsonResult<JsonPage<StockVO>> selectStockInfo(StockDTO stockDTO){
        JsonPage<StockVO> list= stockService.selectStockInfo(stockDTO);
        return JsonResult.ok(list);
    }
}
