package cn.tedu.min.mapper;


import cn.tedu.min.common.entity.dto.AddStaffDTO;
import cn.tedu.min.common.entity.vo.StaffDetailVO;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffMapper {
    /**
     * 增加员工信息
     * @param staffDTO
     * @return
     */
    int  addStaff(AddStaffDTO staffDTO);

    /**
     * 查询员工详细信息
     * @param staffDTO
     * @return
     */
    StaffDetailVO getStaffDeil(AddStaffDTO staffDTO);


}
