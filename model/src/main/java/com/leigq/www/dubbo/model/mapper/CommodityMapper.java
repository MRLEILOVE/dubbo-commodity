package com.leigq.www.dubbo.model.mapper;

import com.leigq.www.dubbo.api.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* Created by Mybatis Generator 2019/04/23
*/
@Mapper
public interface CommodityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);

    /**
     * 查询所有商品信息
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-04-23 16:17
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     */
    List<Commodity> listCommodities();
}