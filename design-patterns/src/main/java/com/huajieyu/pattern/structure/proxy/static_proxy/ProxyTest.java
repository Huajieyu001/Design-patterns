package com.huajieyu.pattern.structure.proxy.static_proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void test(){
        ProxyPoint point = new ProxyPoint();
        point.sell();
    }
}
