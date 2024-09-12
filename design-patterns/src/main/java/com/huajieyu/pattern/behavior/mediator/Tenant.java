package com.huajieyu.pattern.behavior.mediator;

public class Tenant extends Person{

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message){
        System.out.println("Tenant:" + message);
    }

    public void contact(String message){
        this.mediator.contact(message, this);
    }
}
