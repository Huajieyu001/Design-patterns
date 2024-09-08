package com.huajieyu.pattern.creator.singleton.hack;

import java.io.Serializable;

/**
 * 懒汉式单例，静态内部类，用于序列化破坏
 */
public class Singleton05StaticClass implements Serializable {

    private Singleton05StaticClass() {
    }

    private static class Singleton05StaticClassHolder {
        private static final Singleton05StaticClass INSTANCE = new Singleton05StaticClass();
    }

    public static Singleton05StaticClass getInstance() {
        return Singleton05StaticClassHolder.INSTANCE;
    }
}
