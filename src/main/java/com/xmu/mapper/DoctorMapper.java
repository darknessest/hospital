package com.xmu.mapper;

import com.xmu.entity.Doctor;
import com.xmu.entity.DoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int countByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int deleteByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int deleteByPrimaryKey(Long dId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int insert(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int insertSelective(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    List<Doctor> selectByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    Doctor selectByPrimaryKey(Long dId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int updateByPrimaryKeySelective(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    int updateByPrimaryKey(Doctor record);
}