package com.huajieyu.pattern.creator.factory.demo05simple_config;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 简单工厂模式 + 配置文件
 */
public class ConfigCoffeeFactory {

    private static Map<String, Coffee> coffeeMap;

    static {
        coffeeMap = new HashMap<>();
        InputStream resource = ConfigCoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        Properties properties = new Properties();
        try {
            properties.load(resource);
            Set<Object> objectSet = properties.keySet();
            objectSet.forEach(e -> {
                String key = e.toString();
                String name = (String) properties.get(key);
                try {
                    Class clazz = Class.forName(name);
                    Coffee object = (Coffee) clazz.getConstructor().newInstance();
                    coffeeMap.put(key, object);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee createCoffee(String name){
        return coffeeMap.get(name);
    }
}
