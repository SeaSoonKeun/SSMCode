package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Auther: xucg
 * @Date: 2022/9/6 - 09 - 06 - 22:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class UserDaoTest {

    @Test
    public void selectUser(){
        // 第一步，获得SQLSession对象
        SqlSession session = MybatisUtils.getSession();

        // 执行sql
        // 方式一：getMapper
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        session.close();
    }
}
