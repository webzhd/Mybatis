package com.zd.Dao;

import com.zd.Pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacher(int tid);
}
