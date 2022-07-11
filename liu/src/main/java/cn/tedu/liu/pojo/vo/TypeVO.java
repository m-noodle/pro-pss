package cn.tedu.liu.pojo.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("商品类别")
public class TypeVO {

    @ApiModelProperty(value = "商品类别",name="proType",example = "",position = 1)
    private Integer proType;

    @ApiModelProperty(value = "类别名称",name="typeName",example = "",position = 2)
    private String typeName;
}