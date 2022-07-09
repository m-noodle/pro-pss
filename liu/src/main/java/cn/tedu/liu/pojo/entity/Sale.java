package cn.tedu.liu.pojo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
@ApiModel("门店销售实体类")
public class Sale implements Serializable {

    @ApiModelProperty(value = "销售单号",name="saleid",example = "",position = 1)
    private Integer saleid;

    @ApiModelProperty(value = "商品id",name="proid",example = "",position = 2)
    private Integer proid;

    @ApiModelProperty(value = "出售价格",name="price",example = "",position = 3)
    private BigDecimal price;

    @ApiModelProperty(value = "商品类别",name="num",example = "",position = 4)
    private Integer num;

    @ApiModelProperty(value = "总价",name="total",example = "",position = 5)
    private BigDecimal total;

    @ApiModelProperty(value = "出售日期",name="saleDate",example = "",position = 6)
    private Date saleDate;

    @ApiModelProperty(value = "客户id",name="cusid",example = "",position = 7)
    private Date cusid;

    @ApiModelProperty(value = "备注",name="marks",example = "",position = 8)
    private String marks;

    @ApiModelProperty(value = "订单状态",name="status",example = "",position = 9)
    private String status;

}