package com.huajieyu.pattern.behavior.observer;

public class User implements Observer{

    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("用户" + name + " 的订阅更新了：" + msg);
    }
}
