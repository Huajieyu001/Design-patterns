package com.huajieyu.pattern.structure.component;

import org.junit.jupiter.api.Test;

public class ComponentTest {

    @Test
    public void test(){
        Menu menu = new Menu("root", 1);
        menu.add(new Item("AAA", 2));
        menu.add(new Menu("BBB Folder", 2));
        menu.getChild(1).add(new Menu("BBB asdgfc Folder", 3));
        menu.getChild(1).add(new Menu("BBB asdgfsdasdrf Folder", 3));
        menu.getChild(1).add(new Menu("BBB dfgsaffsd Folder", 3));
        menu.getChild(1).add(new Item("BBB dfgsaffsd File", 3));
        menu.getChild(1).add(new Item("BBB seedrfweserfsf File", 3));
        menu.print();
    }
}
