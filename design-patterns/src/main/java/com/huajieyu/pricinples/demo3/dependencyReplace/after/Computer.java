package com.huajieyu.pricinples.demo3.dependencyReplace.after;

public class Computer {

    private Cpu cpu;
    private Memory memory;
    private HardDisk disk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getDisk() {
        return disk;
    }

    public void setDisk(HardDisk disk) {
        this.disk = disk;
    }

    public void run(){
        cpu.run();
        System.out.println(disk.get());
        disk.save("123456");
        memory.save();
    }


}
