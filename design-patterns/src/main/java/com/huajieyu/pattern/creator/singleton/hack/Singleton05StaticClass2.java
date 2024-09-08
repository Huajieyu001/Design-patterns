package com.huajieyu.pattern.creator.singleton.hack;

import java.io.Serializable;

/**
 * 懒汉式单例，静态内部类，用于反射破坏
 */
public class Singleton05StaticClass2 implements Serializable {

    private Singleton05StaticClass2() {
    }

    private static class Singleton05StaticClassHolder {
        private static final Singleton05StaticClass2 INSTANCE = new Singleton05StaticClass2();
    }

    public static Singleton05StaticClass2 getInstance() {
        return Singleton05StaticClassHolder.INSTANCE;
    }
}
