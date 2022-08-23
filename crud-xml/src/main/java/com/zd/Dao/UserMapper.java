package com.zd.Dao;

import com.zd.Pojo.User;

public interface UserMapper {
    User getUser(int id);

    int setUser(User user);

    int updateUser(User user);

    int delUser(int id);
}
