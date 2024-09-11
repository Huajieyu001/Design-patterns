package com.huajieyu.pattern.behavior.command;

public class OrderCommand implements Command{

    private Chef chef;

    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    public void execute(){
        order.getFoods().forEach((name, n) -> {
            chef.makeFood(n, name);
        });
    }
}
