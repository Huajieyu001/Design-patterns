package com.huajieyu.pattern.structure.facade;

public class FacadeApp {

    private Light light;

    private TV tv;

    private AirCondition airCondition;

    public FacadeApp() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }

    public void control(String command){
        if("on".equalsIgnoreCase(command)){
            this.on();
        }else if("off".equalsIgnoreCase(command)){

        }
        else{
            throw new RuntimeException();
        }
    }
}
