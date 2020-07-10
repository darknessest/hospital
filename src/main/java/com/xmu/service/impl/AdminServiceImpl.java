package com.xmu.service.impl;

import com.xmu.entity.Admin;
import com.xmu.mapper.AdminMapper;
import com.xmu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin fingById(long id) {
        return adminMapper.selectByPrimaryKey(id);
    }
}
