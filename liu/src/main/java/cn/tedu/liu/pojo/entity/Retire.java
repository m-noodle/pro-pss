package cn.tedu.liu.pojo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel("门店退货实体类")
public class Retire implements Serializable {

    @ApiModelProperty(value = "退货id",name="id",example = "",position = 1)
    private Integer id;

    @ApiModelProperty(value = "商品id",name="proid",example = "",position = 2)
    private Integer proid;

    @ApiModelProperty(value = "商品名称",name="pname",example = "",position = 3)
    private String pname;

    @ApiModelProperty(value = "退货数量",name="num",example = "",position = 4)
    private Integer num;

    @ApiModelProperty(value = "进货日期",name="indate",example = "",position = 5)
    private Date indate;

    @ApiModelProperty(value = "退货日期",name="retdate",example = "",position = 6)
    private Date retdate;

    @ApiModelProperty(value = "退货原因",name="reason",example = "",position = 7)
    private String reason;

    @ApiModelProperty(value = "备注",name="marks",example = "",position = 8)
    private String marks;
}