package com.xmu.service.impl;

import com.xmu.entity.Hospital;
import com.xmu.mapper.HospitalMapper;
import com.xmu.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalMapper hospitalMapper;

    @Override
    public Hospital findById(long id) {
        return hospitalMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Hospital> findAll() {
        return hospitalMapper.selectByExample(null);
    }

    @Override
    public int add(Hospital hospital) {
        return hospitalMapper.insertSelective(hospital);
    }

    @Override
    public int update(Hospital hospital) {
        return hospitalMapper.updateByPrimaryKeySelective(hospital);
    }

    @Override
    public int delete(long id) {
        return hospitalMapper.deleteByPrimaryKey(id);
    }
}