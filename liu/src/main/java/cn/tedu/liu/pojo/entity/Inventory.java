package cn.tedu.liu.pojo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

@Data
@ApiModel("门店库存实体类")
public class Inventory implements Serializable {

    @ApiModelProperty(value = "商品id",name="proid",example = "",position = 1)
    private Integer proid;


    @ApiModelProperty(value = "商品名称",name="pname",example = "",position = 2)
    private String pname;


    @ApiModelProperty(value = "库存数",name="num",example = "",position = 3)
    private Integer num;


    @ApiModelProperty(value = "备注",name="marks",example = "",position = 4)
    private String marks;
}