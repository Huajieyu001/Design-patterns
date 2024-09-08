package com.huajieyu.pattern.creator.singleton.lazy;

/**
 * 懒汉式单例：线程安全，双重检查锁提高效率，使用volatile避免空指针异常
 */
public class Singleton04DoubleCheckAvoidNullPoint {

    private Singleton04DoubleCheckAvoidNullPoint(){}

    /**
     * 使用volatile，避免空指针异常，volatile关键字可以保证可见性和有序性
     */
    private static volatile Singleton04DoubleCheckAvoidNullPoint instance;

    /**
     * 双重检查锁，确保线程安全，同时比线程安全方法效率更高
     * @return
     */
    public static Singleton04DoubleCheckAvoidNullPoint getInstance(){
        if(instance == null){
            synchronized (Singleton04DoubleCheckAvoidNullPoint.class){
                if(instance == null){
                    instance = new Singleton04DoubleCheckAvoidNullPoint();
                }
            }
        }
        return instance;
    }
}
