package com.wishes.market.dto;

import lombok.Data;

/**
 * 商品查询请求
 *
 * 
 * 
 */
@Data
public class CommodityQueryRequest extends BaseRequest {
    /**
     * 商品类型id
     */
    private Integer commodityType;

    /**
     * 商品id
     */
    private Long id;

    /**
     * 商品数量
     */
    private int number;
}
