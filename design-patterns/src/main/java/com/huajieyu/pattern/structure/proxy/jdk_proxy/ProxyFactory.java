package com.huajieyu.pattern.structure.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTicket getProxyObject() {
        SellTicket object = (SellTicket) Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("invoke start");
            Object result = method.invoke(station, args);
            System.out.println("invoke end");
            return result;
        });
        return object;
    }
}
