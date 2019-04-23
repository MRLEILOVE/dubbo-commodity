package com.leigq.www.dubbo.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品类型实体
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-04-23 16:37 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Data
public class CommodityType implements Serializable {
    /**
	* 主键Id
	*/
    private Long id;

    /**
	* 类型名称
	*/
    private String name;

    /**
	* 创建时间
	*/
    private Date createTime;

    /**
	* 修改时间
	*/
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}