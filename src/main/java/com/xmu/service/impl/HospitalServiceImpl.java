package com.xmu.service.impl;

import com.xmu.entity.Hospital;
import com.xmu.entity.HospitalExample;
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
    public Hospital login(String hAccount, String hPassword) {
        HospitalExample he = new HospitalExample();
        he.createCriteria().andHAccountEqualTo(hAccount).andHPasswordEqualTo(hPassword);
        List<Hospital> list = hospitalMapper.selectByExample(he);
        if (list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }

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
