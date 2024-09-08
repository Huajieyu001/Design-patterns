package com.huajieyu.pattern.creator.singleton.lazy;

/**
 * 懒汉式单例，静态内部类
 */
public class Singleton05StaticClass {

    private Singleton05StaticClass() {
    }

    private static class Singleton05StaticClassHolder {
        private static final Singleton05StaticClass INSTANCE = new Singleton05StaticClass();
    }

    public static Singleton05StaticClass getInstance() {
        return Singleton05StaticClassHolder.INSTANCE;
    }
}
