package com.huajieyu.pattern.behavior.command;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommandTest {

    @Test
    public void test() {
        Order order = new Order();
        Order order2 = new Order();
        Chef chef = new Chef();

        order.setNum(11);
        order.addFood("炒白菜", 10);
        order.addFood("炒牛肉", 10);
        order2.setNum(2);
        order2.addFood("可乐鸡翅", 24);

        List<Command> list = new ArrayList<>();

        Command command = new OrderCommand(chef, order);
        Command command2 = new OrderCommand(chef, order2);
        list.add(command);
        list.add(command2);
        Waiter waiter = new Waiter(list);

        waiter.exec();
    }
}
