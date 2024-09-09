package com.huajieyu.pattern.structure.proxy.cglib_proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {
    @Test
    public void test(){
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
