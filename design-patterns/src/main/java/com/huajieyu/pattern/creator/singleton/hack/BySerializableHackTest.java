package com.huajieyu.pattern.creator.singleton.hack;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * 测试序列化破坏单例模式
 */
public class BySerializableHackTest{
    @Test
    /**
     * 序列化
     */
    public void writeObj2File(){
        Singleton05StaticClass instance = Singleton05StaticClass.getInstance();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("singleton.txt")));){
            oos.writeObject(instance);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    /**
     * 反序列化创建多个对象，单例模式失效
     */
    public void readObjFromFile(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton.txt")));
            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(new File("singleton.txt")));){
            // 反序列化，创建多个单例模式的对象，破解单例
            Object object = ois.readObject();
            Object object2 = ois2.readObject();
            System.out.println(object);
            System.out.println(object2);
            System.out.println(object == object2);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
