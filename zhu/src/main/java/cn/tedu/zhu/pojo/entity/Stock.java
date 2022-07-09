package cn.tedu.zhu.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Stock implements Serializable {
    private Integer id;
    private Integer proid;
    private String pname;
    private Integer num;
    @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
    private Date indate;
    private String marks;

}
