package com.jacob.service;

/**
 * @Author jacob
 * @Date 2022/7/4 13:55
 * @Version 1.0
 */
public class UserB {
    public UserB() {
        System.out.println("userB create=================");
    }

    private UserA userA;

    public UserA getUserA() {
        return userA;
    }

    public void setUserA(UserA userA) {
        this.userA = userA;
    }
}
