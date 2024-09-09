package com.huajieyu.pattern.structure.proxy.jdk_proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {

//    @Test
//    public void test(){
//        ProxyFactory factory = new ProxyFactory();
//        SellTicket proxyObject = factory.getProxyObject();
//        proxyObject.sell();
//
//        System.out.println(proxyObject.getClass());
//
//        while(true){
//
//        }
//    }

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTicket proxyObject = factory.getProxyObject();
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while(true){

        }
    }
}
