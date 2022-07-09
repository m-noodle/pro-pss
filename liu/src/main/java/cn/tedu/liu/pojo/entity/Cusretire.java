package cn.tedu.liu.pojo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel("客户退单实体类")
@Data
public class Cusretire implements Serializable {

    @ApiModelProperty(value = "订单id",name="saleid",example = "",position = 1)
    private Integer saleid;


    @ApiModelProperty(value = "商品id",name="proid",example = "",position = 2)
    private Integer proid;


    @ApiModelProperty(value = "商品名称",name="pname",example = "",position = 3)
    private String pname;


    @ApiModelProperty(value = "价格",name="price",example = "",position = 4)
    private BigDecimal price;


    @ApiModelProperty(value = "数量",name="num",example = "",position = 5)
    private Integer num;


    @ApiModelProperty(value = "总价",name="total",example = "",position = 6)
    private BigDecimal total;


    @ApiModelProperty(value = "售出日期",name="saleDate",example = "",position = 7)
    private Date saleDate;


    @ApiModelProperty(value = "退货日期",name="retdate",example = "",position = 8)
    private Date retdate;


    @ApiModelProperty(value = "退货原因",name="reason",example = "",position = 9)
    private String reason;


    @ApiModelProperty(value = "备注",name="marks",example = "",position = 10)
    private String marks;

}
