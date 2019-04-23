package com.leigq.www.dubbo.api.service;

import com.leigq.www.dubbo.api.entity.Commodity;

import java.util.List;

/**
 * 商品服务接口
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-04-23 16:37 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
public interface CommodityService {

    List<Commodity> listCommodities();

}
