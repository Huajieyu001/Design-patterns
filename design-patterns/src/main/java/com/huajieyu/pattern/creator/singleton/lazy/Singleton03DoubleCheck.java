package com.huajieyu.pattern.creator.singleton.lazy;

/**
 * 懒汉式单例：线程安全，双重检查锁提高效率
 */
public class Singleton03DoubleCheck {

    private Singleton03DoubleCheck(){}

    private static Singleton03DoubleCheck instance;

    /**
     * 双重检查锁，确保线程安全，同时比线程安全方法效率更高
     * @return
     */
    public static Singleton03DoubleCheck getInstance(){
        if(instance == null){
            synchronized (Singleton03DoubleCheck.class){
                if(instance == null){
                    instance = new Singleton03DoubleCheck();
                }
            }
        }
        return instance;
    }
}
