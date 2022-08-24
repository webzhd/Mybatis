package com.zd.Pojo;

public class Student {
    private int sid;
    private String name;
    private Teacher teacher;
    private int tid;

    public Student(int sid, String name, Teacher teacher) {
        this.sid = sid;
        this.name = name;
        this.teacher = teacher;
    }

    public Student(int sid, String name, int tid) {
        this.sid = sid;
        this.name = name;
        this.tid = tid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
