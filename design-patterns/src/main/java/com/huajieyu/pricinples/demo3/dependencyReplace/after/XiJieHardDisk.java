package com.huajieyu.pricinples.demo3.dependencyReplace.after;

public class XiJieHardDisk implements HardDisk{

    public void save(String data){
        System.out.println("Data:[" + data + "]");
    }

    public String get(){
        return "get data";
    }
}
