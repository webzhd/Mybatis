package com.zd;

import com.zd.Dao.StudentMapper;
import com.zd.Pojo.Student;
import com.zd.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

public class Test {

    @org.junit.Test
    public void getStudent() {
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        ArrayList<Student> studentArrayList = mapper.getStudent();
        for (Student student : studentArrayList) {
            System.out.println(student);
        }

        session.close();
    }


    @org.junit.Test
    public void getStudent2() {
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        ArrayList<Student> studentArrayList = mapper.getStudent2();
        for (Student student : studentArrayList) {
            System.out.println(student);
        }

        session.close();
    }
}
