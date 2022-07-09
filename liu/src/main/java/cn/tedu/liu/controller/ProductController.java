package cn.tedu.liu.controller;


import cn.tedu.liu.pojo.dto.ProductAddDTO;
import cn.tedu.liu.pojo.vo.ProductDetailVO;
import cn.tedu.liu.service.IProductService;
import cn.tedu.liu.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.tree.VoidDescriptor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Api(tags = "商品信息管理模块")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService service;


    @ApiOperation("根据id查询商品信息")
    @ApiImplicitParam(name = "id",value = "商品id",example = "1")
    @GetMapping("{id}")
    public JsonResult<ProductDetailVO> getById(@NotNull @PathVariable(name = "id") Integer proid){
        System.out.println(proid);
        ProductDetailVO productDetailVO = service.getById(proid);
        return JsonResult.ok(productDetailVO);
    }

    @PostMapping("/add-new")
    @ApiOperation("新增商品")
    public JsonResult<Void> addNew(@Valid ProductAddDTO addDTO){
        service.addNew(addDTO);
        return JsonResult.ok();
    }
}
