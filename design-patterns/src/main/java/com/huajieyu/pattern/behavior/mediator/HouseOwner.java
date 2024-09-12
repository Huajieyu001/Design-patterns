package com.huajieyu.pattern.behavior.mediator;

public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message){
        System.out.println("HouseOwner " + message);
    }

    public void contact(String message){
        this.mediator.contact(message, this);
    }
}
