package com.huajieyu.pattern.behavior.mediator;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void test(){
        MediatorStructure mediator = new MediatorStructure();

        Tenant tenant = new Tenant("租户", mediator);
        HouseOwner owner = new HouseOwner("房主", mediator);

        mediator.setTenant(tenant);
        mediator.setOwner(owner);
        tenant.contact("112346");
        owner.contact("645561");
    }
}
