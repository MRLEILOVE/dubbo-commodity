package com.leigq.www.dubbo.model.mapper;

import com.leigq.www.dubbo.api.entity.CommodityType;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/04/23
*/
@Mapper
public interface CommodityTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityType record);

    int insertSelective(CommodityType record);

    CommodityType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityType record);

    int updateByPrimaryKey(CommodityType record);
}