package com.huajieyu.pattern.structure.bridge;

public class MacOS extends OS{
    public MacOS(Video video) {
        super(video);
    }

    @Override
    public void play(String name) {
        System.out.print("MacOS : ");
        video.decode(name);
    }
}
