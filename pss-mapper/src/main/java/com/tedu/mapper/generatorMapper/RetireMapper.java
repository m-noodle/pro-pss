package com.tedu.mapper.generatorMapper;

import com.tedu.common.Retire;
import com.tedu.common.RetireExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RetireMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int countByExample(RetireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int deleteByExample(RetireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int insert(Retire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int insertSelective(Retire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    List<Retire> selectByExample(RetireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    Retire selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") Retire record, @Param("example") RetireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int updateByExample(@Param("record") Retire record, @Param("example") RetireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int updateByPrimaryKeySelective(Retire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retire
     *
     * @mbggenerated Mon Jun 27 09:02:48 CST 2022
     */
    int updateByPrimaryKey(Retire record);
}