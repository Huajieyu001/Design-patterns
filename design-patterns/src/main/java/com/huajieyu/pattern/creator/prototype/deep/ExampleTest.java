package com.huajieyu.pattern.creator.prototype.deep;

import com.huajieyu.pattern.creator.prototype.Student;
import org.junit.jupiter.api.Test;

import java.io.*;

public class ExampleTest {


    @Test
    /**
     * 使用对象流，序列化后再多次反序列化创建对象
     */
    public void testAward2() {
        Award2 award = new Award2(new Student("Tom"), 1, "bili bili");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("prototype-deep.txt")))){
            oos.writeObject(award);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Award2 copiedAwardA = null;
        Award2 copiedAwardB = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("prototype-deep.txt")))){
            copiedAwardA = (Award2) ois.readObject();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("prototype-deep.txt")))){
            copiedAwardB = (Award2) ois.readObject();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        System.out.println(award);
        System.out.println(copiedAwardA);
        System.out.println(copiedAwardB);

        copiedAwardA.getStudent().setName("XXX");
        copiedAwardB.getStudent().setName("YYY");
        System.out.println("-------------------------");

        // 成功实现深克隆
        System.out.println(award);
        System.out.println(copiedAwardA);
        System.out.println(copiedAwardB);
    }
}
