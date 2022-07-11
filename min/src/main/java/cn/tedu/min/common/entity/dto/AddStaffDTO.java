package cn.tedu.min.common.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AddStaffDTO {

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
