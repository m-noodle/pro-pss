package cn.tedu.liu.controller;


import cn.tedu.liu.pojo.dto.TypeAddDTO;
import cn.tedu.liu.pojo.dto.TypeDTO;
import cn.tedu.liu.pojo.vo.TypeVO;
import cn.tedu.liu.service.ITypeService;
import cn.tedu.liu.web.JsonPage;
import cn.tedu.liu.web.JsonResult;
import com.sun.istack.internal.NotNull;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;


@Api(tags = "商品类型管理模块")
@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private ITypeService service;


    @ApiOperation("新增类别")
    @PostMapping("/add-new")
    public JsonResult<Void> addNew(@Valid TypeAddDTO typeaddDTO){
        service.addNew(typeaddDTO);
        return JsonResult.ok();
    }

    @ApiOperation("根据id删除类别")
    @GetMapping("/{proType}/delete")
    @ApiImplicitParam(value = "商品id",name = "proType",example = "1",required = true)
    public JsonResult<Void> deleteById(@PathVariable Integer proType) {
        service.deleteById(proType);
        return JsonResult.ok();
    }

    @ApiOperation("根据名称删除类别")
    @GetMapping("/deleteByName")
    @ApiImplicitParam(value = "商品名称",name = "typeName",example = "薯条",required = true)
    public JsonResult<Void> deleteByName(@RequestParam(required = true) String typeName) {
        service.deleteByName(typeName);
        return JsonResult.ok();
    }

    @ApiOperation("根据名称修改类别")
    @PostMapping("/update")
    public JsonResult<Void> updateById(@Valid TypeDTO type) {
        service.updateById(type);
        return JsonResult.ok();
    }

    @ApiOperation("根据id查询类别")
    @GetMapping("/{proType}/get")
    @ApiImplicitParam(value = "商品id",name = "proType",example = "1",required = true)
    public JsonResult<TypeVO> getById(@PathVariable Integer proType) {
        TypeVO typeVO = service.getById(proType);
        return JsonResult.ok(typeVO);
    }


    @ApiOperation("根据名称模糊分页查询")
    @GetMapping("/like")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "page",example = "1",required = false),
            @ApiImplicitParam(value = "每页数量",name = "pageSize",example = "10",required = false),
            @ApiImplicitParam(value = "类别名称",name = "typeName",example = "零食",required = true),
    })
    public JsonResult<JsonPage<TypeVO>> getLikeName(
            @RequestParam(name = "typeName",required = true) String typeName,
            @RequestParam(name = "page",defaultValue = "1",required = false) Integer page,
            @RequestParam(name = "pageSize",defaultValue = "10",required = false) Integer pageSize
    ){
        JsonPage<TypeVO> jsonPage = service.getLikeName(typeName, page, pageSize);
        return JsonResult.ok(jsonPage);
    }


    @ApiOperation("分页查询所有")
    @GetMapping("/listAll")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码",name = "page",example = "1",required = false),
            @ApiImplicitParam(value = "每页数量",name = "pageSize",example = "10",required = false),
    })
    public JsonResult<JsonPage<TypeVO>> listAll(
            @RequestParam(name = "page",defaultValue = "1",required = false) Integer page,
            @RequestParam(name = "pageSize",defaultValue = "10",required = false) Integer pageSize
    ){
        JsonPage<TypeVO> jsonPage = service.listAll(page, pageSize);
        return JsonResult.ok(jsonPage);
    }



}
