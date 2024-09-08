package com.huajieyu.pattern.creator.builder.demo01;

import org.junit.jupiter.api.Test;

public class DirectorTest {

    @Test
    public void testDirector(){
        Director director = new Director(new MobikeBuilder());

        Bike construct = director.construct();
        System.out.println(construct);
    }
}
