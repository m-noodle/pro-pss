package cn.tedu.liu.controller;


import cn.tedu.liu.pojo.dto.ProductAddDTO;
import cn.tedu.liu.pojo.dto.ProductUpdateDTO;
import cn.tedu.liu.pojo.vo.ProductDetailVO;
import cn.tedu.liu.service.IProductService;
import cn.tedu.liu.web.JsonPage;
import cn.tedu.liu.web.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Api(tags = "商品信息管理模块")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService service;


    @PostMapping("/add-new")
    @ApiOperation("新增商品")
    public JsonResult<Void> addNew(@Valid ProductAddDTO addDTO){
        service.addNew(addDTO);
        return JsonResult.ok();
    }

    @PostMapping("/update")
    @ApiOperation("修改商品信息")
    public JsonResult<Void> updateProduct(@Valid ProductUpdateDTO updateDTO){
        service.updateById(updateDTO);
        return JsonResult.ok();
    }


    @ApiOperation("根据id查询商品信息")
    @ApiImplicitParam(name = "id",value = "商品id",example = "1")
    @GetMapping("{id}")
    public JsonResult<ProductDetailVO> getById(@NotNull @PathVariable(name = "id") Integer proid){
        ProductDetailVO productDetailVO = service.getById(proid);
        return JsonResult.ok(productDetailVO);
    }

    @ApiOperation("分页查询商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "page"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize")
    })
    @GetMapping("/list/all")
    public JsonResult<JsonPage<ProductDetailVO>> listAll(
            @RequestParam(name = "page",required = false,defaultValue = "1") Integer page,
            @RequestParam(name = "pageSize",required = false,defaultValue = "10") Integer pageSize){
        JsonPage<ProductDetailVO> jsonPage = service.listAll(page, pageSize);
        return JsonResult.ok(jsonPage);
    }

    @ApiOperation("根据商品类型查询商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "page"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize"),
            @ApiImplicitParam(value = "商品类型",name = "protype",example = "膨化")
    })
    @GetMapping("/list/protype")
    public JsonResult<JsonPage<ProductDetailVO>> getByProtype(
            @RequestParam(name = "page",required = false,defaultValue = "1") Integer page,
            @RequestParam(name = "pageSize",required = false,defaultValue = "10") Integer pageSize,
            @RequestParam(name = "protype",required = true) String protype){
        JsonPage<ProductDetailVO> jsonPage = service.getByProtype(page, pageSize,protype);
        return JsonResult.ok(jsonPage);
    }

    @ApiOperation("根据商品名称查询商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "page"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize"),
            @ApiImplicitParam(value = "商品名称",name = "pname",example = "薯片")
    })
    @GetMapping("/list/pname")
    public JsonResult<JsonPage<ProductDetailVO>> getByPname(
            @RequestParam(name = "page",required = false,defaultValue = "1") Integer page,
            @RequestParam(name = "pageSize",required = false,defaultValue = "10") Integer pageSize,
            @RequestParam(name = "pname",required = true) String pname){
        JsonPage<ProductDetailVO> jsonPage = service.getByPname(page, pageSize,pname);
        return JsonResult.ok(jsonPage);
    }

    @ApiOperation("根据供应商查询商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "page"),
            @ApiImplicitParam(value = "每页条数",name = "pageSize"),
            @ApiImplicitParam(value = "供应商名称",name = "supname",example = "金星")
    })
    @GetMapping("/list/supname")
    public JsonResult<JsonPage<ProductDetailVO>> getBySupname(
            @RequestParam(name = "page",required = false,defaultValue = "1") Integer page,
            @RequestParam(name = "pageSize",required = false,defaultValue = "10") Integer pageSize,
            @RequestParam(name = "supname",required = true) String supname){
        JsonPage<ProductDetailVO> jsonPage = service.getBySupname(page, pageSize,supname);
        return JsonResult.ok(jsonPage);
    }


}
