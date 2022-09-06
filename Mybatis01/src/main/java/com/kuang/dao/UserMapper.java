package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @Auther: xucg
 * @Date: 2022/9/6 - 09 - 06 - 22:30
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */

public interface UserMapper {

    // 获取所有用户
    List<User> getUserList();

}
