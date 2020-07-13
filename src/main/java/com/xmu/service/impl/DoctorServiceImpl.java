package com.xmu.service.impl;

import com.xmu.entity.Doctor;
import com.xmu.entity.DoctorExample;
import com.xmu.mapper.DoctorMapper;
import com.xmu.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<Doctor> findAll() {
        return doctorMapper.selectByExample(null);
    }

    @Override
    public Doctor findByDoctorId(Long doctorId) {
        return doctorMapper.selectByPrimaryKey(doctorId);
    }

    @Override
    public void save(Doctor doctor) {
        doctorMapper.insertSelective(doctor);
    }

    @Override
    public void update(Doctor doctor) {
        doctorMapper.updateByPrimaryKeySelective(doctor);
    }

    @Override
    public void delete(Long doctorId) {
        doctorMapper.deleteByPrimaryKey(doctorId);
    }

    @Override
    public List<Doctor> findByHospitalId(Long hId) {
        DoctorExample example = new DoctorExample();
        example.createCriteria().andDHidEqualTo(hId);
        return doctorMapper.selectByExample(example);
    }
}