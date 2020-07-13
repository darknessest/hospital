package com.xmu.service;

import com.xmu.entity.Doctor;

import java.util.List;

/**
 * @author lsy
 */
public interface DoctorService {
    public List<Doctor> findAll();
    public Doctor findByDoctorId(Long doctorId);
    public void save(Doctor doctor);
    public void update(Doctor doctor);
    public void delete(Long doctorId);
    public List<Doctor> findByHospitalId(Long hId);
    public List<Doctor> findByRoomId(Long rId);
}
