package com.huajieyu.pattern.structure.bridge;

public class WinOS extends OS {
    public WinOS(Video video) {
        super(video);
    }

    @Override
    public void play(String name) {
        System.out.print("WinOS : ");
        video.decode(name);
    }
}
