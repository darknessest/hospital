package com.xmu.service.impl;

import com.xmu.entity.Doctor;
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
    public boolean save(Doctor doctor) {
        int i = doctorMapper.insertSelective(doctor);
        return i==1?true:false;
    }

    @Override
    public boolean update(Doctor doctor) {
        int i = doctorMapper.updateByPrimaryKeySelective(doctor);
        return i==1?true:false;
    }

    @Override
    public boolean delete(Long doctorId) {
        int i = doctorMapper.deleteByPrimaryKey(doctorId);
        return i==1?true:false;
    }
}
