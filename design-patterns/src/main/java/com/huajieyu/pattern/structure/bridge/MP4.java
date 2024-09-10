package com.huajieyu.pattern.structure.bridge;

public class MP4 implements Video{

    @Override
    public void decode(String name) {
        System.out.println("MP4:" + name);
    }
}
