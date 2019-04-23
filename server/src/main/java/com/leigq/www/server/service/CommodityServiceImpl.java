package com.leigq.www.server.service;

import com.leigq.www.dubbo.api.entity.Commodity;
import com.leigq.www.dubbo.api.service.CommodityService;
import com.leigq.www.dubbo.model.mapper.CommodityMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品服务实现
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-04-23 16:40 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Service(protocol = {"dubbo","rest"}, version = "1.0", timeout = 3000, validation = "true")
@org.springframework.stereotype.Service
@Transactional
@Slf4j
public class CommodityServiceImpl implements CommodityService {

    private final CommodityMapper commodityMapper;

    @Autowired
    public CommodityServiceImpl(CommodityMapper commodityMapper) {
        this.commodityMapper = commodityMapper;
    }

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
    @Override
    public List<Commodity> listCommodities() {
        return commodityMapper.listCommodities();
    }
}
