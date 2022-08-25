package com.zd.Pojo;

import lombok.Data;

@Data
public class Student {
    private int sid;
    private String name;
    private Teacher teacher;
}
