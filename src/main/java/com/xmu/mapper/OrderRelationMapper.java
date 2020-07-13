package com.xmu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface OrderRelationMapper {

    //查询订单，关联多表
    List<Map<String, Object>> selectOrder();

    List<Map<String, Object>> selectByUId(long uId);

    List<Map<String, Object>> selectByHId(long hId);
}