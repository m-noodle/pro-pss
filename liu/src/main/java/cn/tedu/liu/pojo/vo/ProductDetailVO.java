package cn.tedu.liu.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@ApiModel("商品VO")
public class ProductDetailVO implements Serializable {

    @ApiModelProperty(value = "商品id",name="proid",example = "",position = 1)
    private Integer proid;


    @ApiModelProperty(value = "商品名称",name="pname",example = "",position = 2)
    private String pname;


    @ApiModelProperty(value = "商品售价",name="price",example = "",position = 3)
    private BigDecimal price;


    @ApiModelProperty(value = "商品进价",name="inprice",example = "",position = 4)
    private BigDecimal inprice;


    @ApiModelProperty(value = "生产日期",name="prodate",example = "",position = 5)
    private LocalDateTime prodate;


    @ApiModelProperty(value = "过期日期",name="reledate",example = "",position = 6)
    private LocalDateTime reledate;


    @ApiModelProperty(value = "供应商名称",name="supname",example = "",position = 7)
    private String supname;


    @ApiModelProperty(value = "商品类型",name="protype",example = "",position = 8)
    private String protype;


    @ApiModelProperty(value = "几件单元",name="unit",example = "",position = 9)
    private String unit;


    @ApiModelProperty(value = "备注",name="marks",example = "",position = 10)
    private String marks;

}