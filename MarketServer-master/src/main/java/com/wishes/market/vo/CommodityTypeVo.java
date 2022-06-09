package com.wishes.market.vo;

import lombok.Data;

/**
 * 商品类型Vo
 *
 * 
 * 
 */
@Data
public class CommodityTypeVo {
    /**
     * 商品类别自增id
     */
    private Long id;

    /**
     * 商品类别解释
     */
    private String name;

    /**
     * 图标地址
     */
    private String iconPath;
}
