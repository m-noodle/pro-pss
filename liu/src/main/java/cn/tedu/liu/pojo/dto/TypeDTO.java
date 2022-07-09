package cn.tedu.liu.pojo.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("商品类别")
public class TypeDTO {

    @NotNull(message = "系统繁忙,请稍后再试")
    @ApiModelProperty(value = "商品类别",name="proType",example = "",position = 1)
    private Integer proType;

    @NotEmpty(message = "请输入商品名称")
    @ApiModelProperty(value = "类别名称",name="typeName",example = "",position = 2)
    private String typeName;
}