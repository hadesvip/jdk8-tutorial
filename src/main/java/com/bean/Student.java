package com.bean;

/**
 * Created by wangyong on 2016/7/31.
 */
public class Student {

    private int stuId;

    private String username;

    private String desc;

    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public Student() {
    }

    public Student(String username, String desc, int age) {
        this.username = username;
        this.desc = desc;
        this.age = age;
    }

    public Student(int stuId) {
        this.stuId = stuId;
    }
}
