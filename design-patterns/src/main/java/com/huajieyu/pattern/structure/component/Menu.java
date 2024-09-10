package com.huajieyu.pattern.structure.component;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> componentList = new ArrayList<MenuComponent>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent component) {
        componentList.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        componentList.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return this.componentList.get(i);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("---");
        }
        System.out.println(level + ":::" + name);
        componentList.forEach(MenuComponent::print);
    }
}
