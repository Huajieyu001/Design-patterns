package com.huajieyu.pattern.behavior.state;

import org.junit.jupiter.api.Test;

public class StateAfterTest {

    @Test
    public void test(){
        Context context = new Context();
        context.setState(new OpenState());

        context.close();
        context.stop();
        context.open();
        context.run();
        context.close();
        context.run();
    }
}
