package com.huajieyu.pattern.structure.flyweight;

import org.junit.jupiter.api.Test;

public class FlyWeightTest {

    @Test
    public void test() {
        BoxFactory instance = BoxFactory.getInstance();

        AbstractBox l = instance.getBox("L");
        AbstractBox o = instance.getBox("O");
        AbstractBox i = instance.getBox("I");
        AbstractBox o2 = instance.getBox("O");
        l.display("Red");
        i.display("Yellow");
        o.display("pink");
        o2.display("green");

        System.out.println(o == o2);
    }
}
