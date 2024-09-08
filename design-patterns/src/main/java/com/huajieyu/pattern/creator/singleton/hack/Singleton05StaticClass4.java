package com.huajieyu.pattern.creator.singleton.hack;

import java.io.Serializable;

/**
 * 懒汉式单例，静态内部类，用于解决反射破坏
 */
public class Singleton05StaticClass4 implements Serializable {

    private static boolean flag = false;

    private Singleton05StaticClass4() {
        synchronized (Singleton05StaticClass4.class){
            if(flag){
                throw new RuntimeException("单例模式无法创建多个对象");
            }
            flag = true;
        }
    }

    private static class Singleton05StaticClassHolder {
        private static final Singleton05StaticClass4 INSTANCE = new Singleton05StaticClass4();

    }

    public static Singleton05StaticClass4 getInstance() {
        return Singleton05StaticClassHolder.INSTANCE;
    }
}
