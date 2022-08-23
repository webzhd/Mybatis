package com.zd.Pojo;

public class User {
    private int id;
    private String NAME;
    private String password;

    public User(int id, String NAME, String password) {
        this.id = id;
        this.NAME = NAME;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", NAME='" + NAME + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
