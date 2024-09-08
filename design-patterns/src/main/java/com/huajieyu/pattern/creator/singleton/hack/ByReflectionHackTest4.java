package com.huajieyu.pattern.creator.singleton.hack;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 测试反射破坏单例模式
 */
public class ByReflectionHackTest4 {

    @Test
    /**
     * 通过Constructor获取多个对象，破坏了单例模式，在构造器里加判断，成功避免了破解
     */
    public void testCreateObjectByConstructor() throws Exception {
        Class clazz = Singleton05StaticClass4.class;

        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object object = constructor.newInstance();
        Object object2 = constructor.newInstance();
        System.out.println(object);
        System.out.println(object2);
        System.out.println(object == object2);
    }

    @Test
    public void testRuntime() throws Exception {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ipconfig");
        InputStream inputStream = process.getInputStream();
        byte [] bs = new byte [1024 * 1024 * 1000];
        int len = inputStream.read(bs);
        String str = new String(bs, 0, len, "GBK");
        System.out.println(len);
        System.out.println(str);
    }

    @Test
    public void testRuntime2() throws Exception {
        Class clazz = Runtime.class;

        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object object = constructor.newInstance();
        Object object2 = constructor.newInstance();
        System.out.println(object);
        System.out.println(object2);
        System.out.println(object == object2);
    }
}
