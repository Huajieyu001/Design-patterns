package com.huajieyu.pricinples.demo1.openAclose;

import org.junit.jupiter.api.Test;

public class SomeInputTest {

    @Test
    public void testOpenAndClose(){
        SomeInput input = new SomeInput();

        DefaultSkin defaultSkin = new DefaultSkin();
        MySkin mySkin = new MySkin();

        input.setSkin(defaultSkin);
        input.display();

        input.setSkin(mySkin);
        input.display();


    }
}
