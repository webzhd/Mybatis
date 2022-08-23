package com.zd;

import com.zd.Dao.UserMapper;
import com.zd.Pojo.User;
import com.zd.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {

    @Test
    public void getUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user);
        session.close();
    }

    @Test
    public void setUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int zz = mapper.setUser(new User(5, "zz", "123"));
        session.commit();
        session.close();
    }

    @Test
    public void updateUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateUser(new User(5, "zzdd", "12333"));
        session.commit();
        session.close();
    }

    @Test
    public void delUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.delUser(5);
        session.commit();
        session.close();
    }
}