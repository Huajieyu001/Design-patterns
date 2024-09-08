package com.huajieyu.pattern.creator.singleton.hack;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 测试反射破坏单例模式
 */
public class ByReflectionHackTest {

    @Test
    public void test() throws Exception {
//        Class<? extends Class> clazz = .getClass();
        Method getInstance = Singleton05StaticClass2.class.getDeclaredMethod("getInstance");
        Object invoke = getInstance.invoke(Singleton05StaticClass2.class);
        Object invoke2 = getInstance.invoke(Singleton05StaticClass2.class);
        System.out.println(invoke);
        System.out.println(invoke2);
        System.out.println(invoke == invoke2);
    }

    @Test
    /**
     * 通过Constructor获取多个对象，破坏了单例模式
     */
    public void testCreateObjectByConstructor() throws Exception {
        Class clazz = Singleton05StaticClass2.class;

        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object object = constructor.newInstance();
        Object object2 = constructor.newInstance();
        System.out.println(object);
        System.out.println(object2);
        System.out.println(object == object2);
    }
}
