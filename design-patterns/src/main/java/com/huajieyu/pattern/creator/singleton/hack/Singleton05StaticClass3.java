package com.huajieyu.pattern.creator.singleton.hack;

import java.io.Serial;
import java.io.Serializable;

/**
 * 懒汉式单例，静态内部类，用于解决序列化破坏
 */
public class Singleton05StaticClass3 implements Serializable {

    private Singleton05StaticClass3() {
    }

    private static class Singleton05StaticClassHolder {
        private static final Singleton05StaticClass3 INSTANCE = new Singleton05StaticClass3();
    }

    public static Singleton05StaticClass3 getInstance() {
        return Singleton05StaticClassHolder.INSTANCE;
    }

//    @Serial
    public Object readResolve(){
        return Singleton05StaticClassHolder.INSTANCE;
    }
}
