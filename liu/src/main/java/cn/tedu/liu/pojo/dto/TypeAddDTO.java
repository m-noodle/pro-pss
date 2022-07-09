package cn.tedu.liu.pojo.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("商品类别")
public class TypeAddDTO {

    @NotEmpty(message = "请输入商品名称")
    @ApiModelProperty(value = "类别名称",name="typeName",example = "",position = 2)
    private String typeName;
}