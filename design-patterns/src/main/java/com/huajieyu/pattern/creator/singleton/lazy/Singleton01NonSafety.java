package com.huajieyu.pattern.creator.singleton.lazy;

/**
 * 懒汉式单例：线程不安全
 */
public class Singleton01NonSafety {

    private Singleton01NonSafety(){}

    private static Singleton01NonSafety instance;

    public static Singleton01NonSafety getInstance(){
        if(instance == null){
            // 第一个线程进来还未创建对象的时候，第二个线程也进来了，导致可能会创建多个对象导致单例模式失效
            instance = new Singleton01NonSafety();
        }
        return instance;
    }
}
