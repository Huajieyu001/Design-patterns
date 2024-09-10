package com.huajieyu.pattern.structure.component;

public class Item extends MenuComponent{

    public Item(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("---");
        }
        System.out.println(level + ":::" + name);
    }
}
