package com.huajieyu.pattern.creator.singleton.lazy;

import org.junit.jupiter.api.Test;

public class LazySingletonTest {

    @Test
    public void testSingleton01NonSafety(){
        Singleton01NonSafety instance = Singleton01NonSafety.getInstance();
        Singleton01NonSafety instance2 = Singleton01NonSafety.getInstance();
        System.out.println("testSingleton01NonSafety");
        System.out.println(instance == instance2);
    }

    @Test
    public void testSingleton02Safety(){
        Singleton02Safety instance = Singleton02Safety.getInstance();
        Singleton02Safety instance2 = Singleton02Safety.getInstance();
        System.out.println("testSingleton02Safety");
        System.out.println(instance == instance2);
    }

    @Test
    public void testSingleton03DoubleCheck(){
        Singleton03DoubleCheck instance = Singleton03DoubleCheck.getInstance();
        Singleton03DoubleCheck instance2 = Singleton03DoubleCheck.getInstance();
        System.out.println("testSingleton03DoubleCheck");
        System.out.println(instance == instance2);
    }

    @Test
    public void testSingleton04DoubleCheckAvoidNullPoint(){
        Singleton04DoubleCheckAvoidNullPoint instance = Singleton04DoubleCheckAvoidNullPoint.getInstance();
        Singleton04DoubleCheckAvoidNullPoint instance2 = Singleton04DoubleCheckAvoidNullPoint.getInstance();
        System.out.println("testSingleton04DoubleCheckAvoidNullPoint");
        System.out.println(instance == instance2);
    }

    @Test
    public void testSingleton05StaticClass(){
        Singleton05StaticClass instance = Singleton05StaticClass.getInstance();
        Singleton05StaticClass instance2 = Singleton05StaticClass.getInstance();
        System.out.println("testSingleton05StaticClass");
        System.out.println(instance == instance2);
    }

    @Test
    public void testSingleton06Enum(){
        Singleton06Enum instance = Singleton06Enum.INSTANCE;
        Singleton06Enum instance2 = Singleton06Enum.INSTANCE;
        System.out.println("testSingleton06Enum");
        System.out.println(instance == instance2);
    }
}
