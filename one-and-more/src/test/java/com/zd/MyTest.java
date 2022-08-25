package com.zd;

import com.zd.Dao.StudentMapper;
import com.zd.Dao.TeacherMapper;
import com.zd.Pojo.Student;
import com.zd.Pojo.Teacher;
import com.zd.Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    @Test
    public void getTeacher() {
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeacher(1);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        session.close();
    }
}
