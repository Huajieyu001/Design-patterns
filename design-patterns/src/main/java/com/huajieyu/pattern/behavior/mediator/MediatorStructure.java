package com.huajieyu.pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorStructure implements Mediator{

    private HouseOwner owner;
    private Tenant tenant;

    public void contact(String message, Person person){
        if(person == tenant){
            owner.getMessage(message);
        }
        else{
            tenant.getMessage(message);
        }
    }

    public HouseOwner getOwner() {
        return owner;
    }

    public void setOwner(HouseOwner owner) {
        this.owner = owner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
