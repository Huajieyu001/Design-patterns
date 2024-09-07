package com.huajieyu.pricinples.demo4.interfaceIsolation.before;

import org.junit.jupiter.api.Test;

public class SafetyDoorTest {

    @Test
    public void test(){
        MySafetyDoor door = new MySafetyDoor();
        door.antiTheft();
        door.fireproof();
        door.waterproof();
    }
}
