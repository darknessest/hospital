package com.xmu.service.impl;

import com.xmu.entity.Orders;
import com.xmu.mapper.OrderRelationMapper;
import com.xmu.mapper.OrdersMapper;
import com.xmu.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrdersServiceImpl implements OrdersService {

    private OrdersMapper ordersMapper;
    private OrderRelationMapper orderRelationMapper;

    public OrdersMapper getOrdersMapper(){ return ordersMapper;}
    @Autowired
    public void setOrdersMapper(OrdersMapper ordersMapper){ this.ordersMapper = ordersMapper;}

    public OrderRelationMapper getOrderRelationMapper() {
        return orderRelationMapper;
    }
    @Autowired
    public void setOrderRelationMapper(OrderRelationMapper orderRelationMapper) { this.orderRelationMapper = orderRelationMapper;}

    @Override
    public Orders findById(long id) {
        return ordersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map<String, Object>> findByHospitalId(long hId) {
        return orderRelationMapper.selectByUId(hId);
    }

    @Override
    public List<Map<String, Object>> findByUserId(long uId) {
        return orderRelationMapper.selectByUId(uId);
    }

    @Override
    public List<Map<String, Object>> findAll() {
        return orderRelationMapper.selectOrder();
    }

    @Override
    public int add(Orders orders) {
        return ordersMapper.insertSelective(orders);
    }

    @Override
    public int update(Orders orders) {
        return ordersMapper.updateByPrimaryKeySelective(orders);
    }

    @Override
    public int delete(long id) {
        return ordersMapper.deleteByPrimaryKey(id);
    }
}
