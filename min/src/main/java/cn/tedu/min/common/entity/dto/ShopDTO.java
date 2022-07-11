package cn.tedu.min.common.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ShopDTO {
    @ApiModelProperty(value="店面id")
    private Long  id;
    @ApiModelProperty(value="门店地址")
    private String staffName;
    @ApiModelProperty(value="页数")
    private Integer page;
    @ApiModelProperty(value="条数")
    private Integer pageSize;

}
