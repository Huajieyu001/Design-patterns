package com.huajieyu.pattern.behavior.strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void test(){
        Strategy strategy = new StrategyA();

        Execute execute = new Execute(strategy);
        execute.exec();
    }
}
