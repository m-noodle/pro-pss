package cn.tedu.min.common.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Shop {


    @ApiModelProperty(value="门店id")
    private Integer id;


    @ApiModelProperty(value="门店名称")
    private String name;


    @ApiModelProperty(value="门店地址")
    private String address;


    @ApiModelProperty(value="备注")
    private String marks;

}
