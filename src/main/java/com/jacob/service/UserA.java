package com.jacob.service;

/**
 * @Author jacob
 * @Date 2022/7/4 13:55
 * @Version 1.0
 */
public class UserA {
    public UserA() {
        System.out.println("userA create=====================");
    }

    private  UserB userB;

    public UserB getUserB() {
        return userB;
    }

    public void setUserB(UserB userB) {
        this.userB = userB;
    }
}
