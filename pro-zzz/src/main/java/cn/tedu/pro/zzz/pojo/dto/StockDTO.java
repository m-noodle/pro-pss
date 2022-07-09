package cn.tedu.pro.zzz.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "查询进货信息条件DTO")
public class StockDTO implements Serializable {
    @ApiModelProperty(value = "订单id",example = "1")
    private Integer id;
    @ApiModelProperty(value = "商品id",example = "1")
    private Integer proId;
    @ApiModelProperty(value = "商品名称",example = "苹果")
    private String pname;
    @ApiModelProperty(value = "进货日期",example = "2022-07-07")
    private Date indate;
    @ApiModelProperty(value = "页数",example = "1")
    private Integer page;
    @ApiModelProperty(value = "每页条数",example = "10")
    private Integer pageSize;
}
