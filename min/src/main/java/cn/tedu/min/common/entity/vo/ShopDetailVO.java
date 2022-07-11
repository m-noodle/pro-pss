package cn.tedu.min.common.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ShopDetailVO {
    @ApiModelProperty(value="门店id")
    private Integer id;

    @ApiModelProperty(value="门店名称")
    private String name;


    @ApiModelProperty(value="门店地址")
    private String address;


    @ApiModelProperty(value="备注")
    private String marks;


    @ApiModelProperty(value="工作人员id")
    private Integer staffId;


    @ApiModelProperty(value="工作人员姓名")
    private String staffName;


    @ApiModelProperty(value="工号")
    private Integer staffNum;


    @ApiModelProperty(value="性别")
    private String gender;


    @ApiModelProperty(value="电话")
    private String tel;


    @ApiModelProperty(value="工作人员类型")
    private String staffType;


    @ApiModelProperty(value="卡号密码")
    private String pwd;


    @ApiModelProperty(value="所属门店")
    private String shopId;
}
