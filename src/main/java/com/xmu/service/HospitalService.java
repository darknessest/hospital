package com.xmu.service;

import com.xmu.entity.Hospital;

import java.util.List;

public interface HospitalService {
    Hospital login(String hAccount,String hPassword);
    Hospital findById(long id);
    List<Hospital> findAll();
    int add(Hospital hospital);
    int update(Hospital hospital);
    int delete(long id);
}
