package com.huajieyu.pattern.creator.singleton.lazy;

/**
 * 懒汉式单例：线程安全
 */
public class Singleton02Safety {

    private Singleton02Safety(){}

    private static Singleton02Safety instance;

    /**
     * 加上synchronized修饰，确保线程安全
     * @return
     */
    public static synchronized Singleton02Safety getInstance(){
        if(instance == null){
            instance = new Singleton02Safety();
        }
        return instance;
    }
}
