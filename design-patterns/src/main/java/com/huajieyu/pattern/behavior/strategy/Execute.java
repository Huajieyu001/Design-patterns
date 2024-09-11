package com.huajieyu.pattern.behavior.strategy;

public class Execute {

    private Strategy strategy;

    public Execute(Strategy strategy) {
        this.strategy = strategy;
    }

    public void exec() {
        strategy.show();
    }
}
