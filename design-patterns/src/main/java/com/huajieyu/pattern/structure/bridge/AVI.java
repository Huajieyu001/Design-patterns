package com.huajieyu.pattern.structure.bridge;

public class AVI implements Video{

    @Override
    public void decode(String name) {
        System.out.println("AVI" + name);
    }
}
