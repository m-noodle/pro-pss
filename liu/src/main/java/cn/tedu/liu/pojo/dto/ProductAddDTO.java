package cn.tedu.liu.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@ApiModel("商品新增DTO")
public class ProductAddDTO implements Serializable {

    @ApiModelProperty(value = "商品id",name="proid",required = false,position = 1)
    private Integer proid;

    @NotEmpty(message = "商品名称-不能为空")
    @ApiModelProperty(value = "商品名称",name="pname",required = true,example = "乐事薯片",position = 2)
    private String pname;


    @NotNull(message = "商品价格-不能为空")
    @ApiModelProperty(value = "商品价格",name="price",required = true,example = "13.8",position = 3)
    private BigDecimal price;


    @NotNull(message = "商品进价-不能为空")
    @ApiModelProperty(value = "商品进价",name="inprice",required = true,example = "12.5",position = 4)
    private BigDecimal inprice;

    @NotNull(message = "生产日期-不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "生产日期",name="prodate",required = true,example = "2022-07-09 12:00:00",position = 5)
    private LocalDateTime prodate;

    @NotNull(message = "过期日期-不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "过期日期",name="reledate",required = true,example = "2022-12-09 12:00:00",position = 6)
    private LocalDateTime reledate;

    @NotEmpty(message = "供应商名称-不能为空")
    @ApiModelProperty(value = "供应商名称",name="supname",required = true,example = "武汉金星",position = 7)
    private String supname;

    @NotEmpty(message = "商品类型-不能为空")
    @ApiModelProperty(value = "商品类型",name="protype",required = true,example = "袋装膨化",position = 8)
    private String protype;

    @NotEmpty(message = "计价单元-不能为空")
    @ApiModelProperty(value = "计价单元",name="unit",required = true,example = "袋",position = 9)
    private String unit;


    @ApiModelProperty(value = "备注",name="marks",required = false,example = "",position = 10)
    private String marks;

}