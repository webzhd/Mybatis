package com.zd;

import com.zd.Dao.UserMapper;
import com.zd.Pojo.User;
import com.zd.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestUser {
    @Test
    public void getUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user);
        session.close();
    }

    @Test
    public void updateUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateUser(4, "jaja", "987");
        session.close();
    }

    @Test
    public void postUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.postUser(5, "77", "77");
        session.close();
    }

    @Test
    public void delUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.delUser(5);
        session.close();
    }
}
