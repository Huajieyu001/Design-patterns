package com.huajieyu.pricinples.demo3.dependencyReplace.before;

public class Computer {

    private IntelCpu cpu;
    private KingstonMemory memory;
    private XiJieHardDisk disk;

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public XiJieHardDisk getDisk() {
        return disk;
    }

    public void setDisk(XiJieHardDisk disk) {
        this.disk = disk;
    }

    public void run(){
        cpu.run();
        System.out.println(disk.get());
        disk.save("123456");
        memory.save();
    }


}
