package com.zd.Dao;

import com.zd.Pojo.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    @Select("select * from users where id=#{uid}")
    User getUser(@Param("uid") int id);

    @Update("update users set NAME=#{name}, password=#{password} where id=#{uid}")
    int updateUser(@Param("uid") int id, @Param("name") String name, @Param("password") String password);

    @Insert("insert into users (id, NAME, password) values (#{uid}, #{name}, #{password})")
    int postUser(@Param("uid") int id, @Param("name") String name, @Param("password") String password);

    @Delete("delete from users where id=#{uid}")
    int delUser(@Param("uid") int id);
}
