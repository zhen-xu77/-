package com.wishes.market.service;

import com.wishes.market.dto.PrivilegeInfo;

/**
 * @Auther: zhongyu
 * 
 * @Description:
 */
public interface CurrentUserService {
    PrivilegeInfo getPvgInfo();

    void setPvginfo(PrivilegeInfo privilegeInfo);

    void clean();
}
