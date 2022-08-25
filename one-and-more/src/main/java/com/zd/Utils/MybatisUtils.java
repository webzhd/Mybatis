package com.zd.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtils {
    static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static SqlSession getSession() {
        return sqlSessionFactory.openSession(true);
    }
}
