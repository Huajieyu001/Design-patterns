package com.huajieyu.pattern.structure.proxy.static_proxy;

public class ProxyPoint implements SellTicket{

    private TrainStation station = new TrainStation();
    @Override
    public void sell() {
        System.out.println("ProxyPoint");
        station.sell();
    }
}
