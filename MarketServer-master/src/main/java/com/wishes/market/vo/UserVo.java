package com.wishes.market.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 用户数据展示Vo
 *
 * 
 */
@Data
public class UserVo {
    /**
     * 用户id
     */

    private Long id;

    /**
     * 用户账号
     */
    private String account;


    /**
     * 用户昵称
     */
    private String uname;

}