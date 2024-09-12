package com.huajieyu.pattern.behavior.state.example;

import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void test(){
        Lift lift = new Lift();
        lift.setState(ILift.OPENING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
