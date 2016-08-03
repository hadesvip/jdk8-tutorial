package com.bean;

/**
 * Created by wy33082 on 16-8-2.
 */
public class User {

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 用户描述
     */
    private String userDesc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    /**
     * 默认构造
     */
    public User() {
    }

    /**
     * 初始化用户
     *  @param userId   用户编号
     * @param userName 用户名
     * @param userPwd  　用户密码
     * @param userDesc 　用户描述
     */
    public User(String userId, String userName, String userPwd, String userDesc) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userDesc = userDesc;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userDesc='" + userDesc + '\'' +
                '}';
    }
}
