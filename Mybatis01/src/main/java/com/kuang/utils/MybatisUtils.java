package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: xucg
 * @Date: 2022/9/6 - 09 - 06 - 22:24
 * @Description: sqlSessionFactory --> sqlSession
 * @version: 1.0
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    // 从xml构建sqlSessionFactory的实例对象
    static {
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 从sqlSessionFactory中获取session
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
