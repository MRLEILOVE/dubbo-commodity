package com.leigq.www.dubbo.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品实体
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
public class Commodity implements Serializable {
    /**
	* 主键Id
	*/
    private Long id;

    /**
	* 商品名称
	*/
    private String name;

    /**
	* 单价
	*/
    private BigDecimal price;

    /**
	* 类型Id
	*/
    private Long ctId;

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