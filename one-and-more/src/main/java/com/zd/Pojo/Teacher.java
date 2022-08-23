package com.zd.Pojo;

public class Teacher {
    private int tid;
    private String name;
    private int sid;

    public Teacher(int tid, String name, int sid) {
        this.tid = tid;
        this.name = name;
        this.sid = sid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", sid=" + sid +
                '}';
    }
}
