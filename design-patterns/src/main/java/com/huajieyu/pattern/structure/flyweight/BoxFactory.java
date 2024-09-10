package com.huajieyu.pattern.structure.flyweight;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class BoxFactory {

    public static boolean flag = false;

    private Map<String, AbstractBox> map = new HashMap<>();

    private static BoxFactory factory = new BoxFactory();

    private BoxFactory() {
        synchronized (BoxFactory.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            map.put("I", new IBox());
            map.put("L", new LBox());
            map.put("O", new OBox());
            flag = true;
        }
    }

    public static BoxFactory getInstance() {
        return factory;
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }

}
