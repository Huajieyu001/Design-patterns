package com.huajieyu.pricinples.demo3.dependencyReplace.after;

public class AMDCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("AMDCpu run");
    }
}
