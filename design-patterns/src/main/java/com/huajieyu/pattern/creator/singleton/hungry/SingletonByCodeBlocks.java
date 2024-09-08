package com.huajieyu.pattern.creator.singleton.hungry;

/**
 * 饿汉式单例模式：通过静态代码块
 */
public class SingletonByCodeBlocks {

    private SingletonByCodeBlocks(){}

    private static SingletonByCodeBlocks instance;

    static {
        instance = new SingletonByCodeBlocks();
    }

    public static SingletonByCodeBlocks getInstance(){
        return instance;
    }
}
