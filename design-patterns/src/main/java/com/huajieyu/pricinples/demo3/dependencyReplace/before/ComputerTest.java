package com.huajieyu.pricinples.demo3.dependencyReplace.before;

import org.junit.jupiter.api.Test;

public class ComputerTest {

    @Test
    public void test(){
        Computer computer = new Computer();
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();

        computer.setCpu(intelCpu);
        computer.setDisk(xiJieHardDisk);
        computer.setMemory(kingstonMemory);

        computer.run();
    }
}
