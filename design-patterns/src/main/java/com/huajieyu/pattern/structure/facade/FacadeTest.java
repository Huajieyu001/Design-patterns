package com.huajieyu.pattern.structure.facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    public void test(){
        FacadeApp app = new FacadeApp();

        app.control("on");
    }
}
