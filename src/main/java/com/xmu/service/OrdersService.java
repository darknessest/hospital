package com.xmu.service;

import com.xmu.entity.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersService {

    public Orders findById(long id);
    public List<Map<String, Object>> findByHospitalId(long hId);
    public List<Map<String, Object>> findByUserId(long uId);
    public List<Map<String, Object>> findAll();
    public int add(Orders orders);
    public int update(Orders orders);
    public int delete(long id);
}
