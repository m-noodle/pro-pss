package cn.tedu.min.common.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AddShopDTO {
    @ApiModelProperty(value="门店id")
    private Integer id;

    @ApiModelProperty(value="门店名称")
    private String name;

    @ApiModelProperty(value="门店地址")
    private String address;

    @ApiModelProperty(value="员工编号")
    private Integer staffNum;

    @ApiModelProperty(value="电话")
    private String tel;

    @ApiModelProperty(value="备注")
    private String marks;

}
