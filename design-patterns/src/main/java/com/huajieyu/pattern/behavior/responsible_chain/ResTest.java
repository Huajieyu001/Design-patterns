package com.huajieyu.pattern.behavior.responsible_chain;

import org.junit.jupiter.api.Test;

public class ResTest {

    @Test
    public void test(){
        LeaveRequest leaveRequest = new LeaveRequest("Tom", 7, "Game");
        Handler handlerA = new LeaderA(0, 1);
        Handler handlerB = new LeaderB(0, 3);
        Handler handlerC = new LeaderC(0, 7);

        handlerA.setNextLeader(handlerB);
        handlerB.setNextLeader(handlerC);

        System.out.println(handlerA.getNextLeader());
        handlerA.submit(leaveRequest);

    }
}
