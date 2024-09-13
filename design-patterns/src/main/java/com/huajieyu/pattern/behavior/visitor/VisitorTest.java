package com.huajieyu.pattern.behavior.visitor;

import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    public void test(){
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());

        home.action(new Owner());
    }
}
