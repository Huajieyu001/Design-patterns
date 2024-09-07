package com.huajieyu.pricinples.demo5.demeter;

import org.junit.jupiter.api.Test;

public class AgentTest {

    @Test
    public void test(){
        Agent agent = new Agent();
        Star star = new Star();
        star.setName("Tom");
        Company company = new Company();
        company.setName("ABC Company");
        Fans fans = new Fans();
        fans.setName("God");

        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);

        agent.meeting();
        agent.business();
    }
}
