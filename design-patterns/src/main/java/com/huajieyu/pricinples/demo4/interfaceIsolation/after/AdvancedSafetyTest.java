package com.huajieyu.pricinples.demo4.interfaceIsolation.after;

import org.junit.jupiter.api.Test;

public class AdvancedSafetyTest {
    @Test
    public void test(){
        MySafetyDoor door = new MySafetyDoor();
        door.antiTheft();
        door.fireproof();
        door.waterproof();
    }
}
