package com.huajieyu.pattern.behavior.command;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Integer num;

    private Map<String, Integer> foods = new HashMap<>();

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Map<String, Integer> getFoods() {
        return foods;
    }

    public void addFood(String name, Integer num) {
        this.foods.put(name, num);
    }
}
