package com.mapper;

import com.entity.Admin;

public interface AdminMapper {
    //登陆验证
    Admin logincheck(Admin admin);
    //管理员数量
    int countAdmin();
}
