package com.huajieyu.pattern.creator.singleton.hungry;

/**
 * 饿汉式单例模式：通过静态成员变量
 */
public class SingletonByField {

    private SingletonByField(){}

    private static SingletonByField instance = new SingletonByField();

    public static SingletonByField getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("饿汉式单例模式");
    }
}
