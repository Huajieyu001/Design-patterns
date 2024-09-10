package com.huajieyu.pattern.structure.bridge;

import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    public void test(){
        MP4 mp4 = new MP4();
        WinOS winOS = new WinOS(mp4);
        winOS.play("123.mp4");
    }
}
