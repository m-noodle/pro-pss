package com.tedu.mapper.generatorMapper;

import entity.Cusretire;
import entity.CusretireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusretireMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int countByExample(CusretireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int deleteByExample(CusretireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int deleteByPrimaryKey(Integer saleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int insert(Cusretire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int insertSelective(Cusretire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    List<Cusretire> selectByExample(CusretireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    Cusretire selectByPrimaryKey(Integer saleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") Cusretire record, @Param("example") CusretireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int updateByExample(@Param("record") Cusretire record, @Param("example") CusretireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int updateByPrimaryKeySelective(Cusretire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cusretire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int updateByPrimaryKey(Cusretire record);
}