package com.huajieyu.pattern.structure.component;

public abstract class MenuComponent {

    protected String name;
    protected int level;

    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
