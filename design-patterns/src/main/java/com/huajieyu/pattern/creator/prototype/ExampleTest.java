package com.huajieyu.pattern.creator.prototype;

import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Example example = new Example();
        Example clone = example.clone();

        System.out.println(clone);
        System.out.println(example);
        System.out.println(example == clone);
    }

    @Test
    public void testAward() throws CloneNotSupportedException {
        Award award = new Award("Tom", 1, "bili bili");

        Award clone = award.clone();

        System.out.println(award);
        System.out.println(clone);

        award.setName("Rosy");
        System.out.println("-------------------------");

        System.out.println(award);
        System.out.println(clone);
    }

    @Test
    public void testAward2() throws CloneNotSupportedException {
        Award2 award = new Award2(new Student("Tom"), 1, "bili bili");

        Award2 clone = award.clone();

        System.out.println(award);
        System.out.println(clone);

        award.getStudent().setName("Rosy");
        System.out.println("-------------------------");

        // 此处说明clone是浅克隆
        System.out.println(award);
        System.out.println(clone);
    }
}
