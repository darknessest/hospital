package com.xmu.service.impl;

import com.xmu.entity.Admin;
import com.xmu.entity.AdminExample;
import com.xmu.mapper.AdminMapper;
import com.xmu.service.AdminService;
import com.xmu.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(String aAccount,String aPassword) {
        AdminExample ae=new AdminExample();
        ae.createCriteria().andAAccountEqualTo(aAccount).andAPasswordEqualTo(aPassword);
        List<Admin> list=adminMapper.selectByExample(ae);
        if (list.size()==0){
            return null;
        }else{
            return list.get(0);
        }

    }


}
