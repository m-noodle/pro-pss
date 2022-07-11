package cn.tedu.liu.web;


import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class JsonPage<T> implements Serializable {
    /* 分页 */
    @ApiModelProperty(value = "分页数据",name = "list")
    private List<T> list;
    //页码
    @ApiModelProperty(value = "当前页码",name = "pageNum")
    private Integer pageNum;
    //条数
    @ApiModelProperty(value = "每页条数",name = "pageSize")
    private Integer pageSize;
    /* 实际条数 */
    @ApiModelProperty(value = "实际页数",name = "size")
    private Integer size;
    /* 总条数 */
    @ApiModelProperty(value = "总条数",name = "totalSize")
    private Long totalCount;
    /* 总页数 */
    @ApiModelProperty(value = "总页数",name = "totalPages")
    private Integer totalPages;

    public static<T> JsonPage<T> restPage(PageInfo<T> pageInfo){
        JsonPage<T> page = new JsonPage<>();
        page.pageNum = pageInfo.getPageNum();
        page.pageSize = pageInfo.getPageSize();
        page.size = pageInfo.getSize();
        page.totalPages = pageInfo.getPages();
        page.totalCount = pageInfo.getTotal();
        page.list = pageInfo.getList();
        return page;
    }
}
