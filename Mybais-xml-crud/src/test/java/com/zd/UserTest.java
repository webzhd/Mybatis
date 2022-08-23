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
}