package com.xmu.service;

import com.xmu.entity.Doctor;

import java.util.List;

/**
 * @author lsy
 */
public interface DoctorService {
    public List<Doctor> findAll();
    public Doctor findByDoctorId(Long doctorId);
    public boolean save(Doctor doctor);
    public boolean update(Doctor doctor);
    public boolean delete(Long doctorId);
}
