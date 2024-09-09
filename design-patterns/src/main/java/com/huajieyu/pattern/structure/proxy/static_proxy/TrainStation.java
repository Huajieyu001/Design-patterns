package com.huajieyu.pattern.structure.proxy.static_proxy;

public class TrainStation implements SellTicket{

    @Override
    public void sell() {
        System.out.println("TrainStation");
    }
}
