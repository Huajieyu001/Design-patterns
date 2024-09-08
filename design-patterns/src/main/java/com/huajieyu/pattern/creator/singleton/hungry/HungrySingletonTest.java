package com.huajieyu.pattern.creator.singleton.hungry;

import org.junit.jupiter.api.Test;

public class HungrySingletonTest {

    @Test
    public void testSingletonByField(){
        SingletonByField instance = SingletonByField.getInstance();
        SingletonByField instance2 = SingletonByField.getInstance();
        System.out.println("testSingletonByField");
        System.out.println(instance == instance2);
    }

    @Test
    public void testSingletonByCodeBlocks(){
        SingletonByCodeBlocks instance = SingletonByCodeBlocks.getInstance();
        SingletonByCodeBlocks instance2 = SingletonByCodeBlocks.getInstance();
        System.out.println("testSingletonByCodeBlocks");
        System.out.println(instance == instance2);
    }
}
