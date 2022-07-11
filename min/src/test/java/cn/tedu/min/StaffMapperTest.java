package cn.tedu.min;

import cn.tedu.min.common.entity.dto.AddStaffDTO;
import cn.tedu.min.mapper.StaffMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StaffMapperTest {
    @Autowired
    StaffMapper staffMapper;

    @Test
    void  add(){
        AddStaffDTO addStaffDTO  = new AddStaffDTO();
        addStaffDTO.setStaffName("闵锐");
        addStaffDTO.setStaffNum(321);

       // staffMapper.getStaffDeil(addStaffDTO);
        staffMapper.addStaff(addStaffDTO);
    }
}
