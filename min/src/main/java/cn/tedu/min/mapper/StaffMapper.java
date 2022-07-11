package cn.tedu.min.mapper;


import cn.tedu.min.common.entity.Staff;
import cn.tedu.min.common.entity.dto.AddStaffDTO;
import cn.tedu.min.common.entity.vo.ShopDetailVO;
import cn.tedu.min.common.entity.vo.StaffDetailVO;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffMapper {
    /**
     * 增加员工信息
     * @param addstaffDTO
     * @return
     */
    int  addStaff(AddStaffDTO addstaffDTO);


    /**
     * 修改负责人负责门店信息
     * @param staff
     * @return
     */
    int  updateStaffMessage(Staff staff);
    /**
     *根据员工id查询员工详细信息
     * @param staffNum
     * @return 门店的详细信息
     */
    StaffDetailVO staffNumIdGetStaffDetail(Integer staffNum);



}
