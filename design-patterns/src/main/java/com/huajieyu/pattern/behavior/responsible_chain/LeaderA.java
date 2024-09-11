package com.huajieyu.pattern.behavior.responsible_chain;

public class LeaderA extends Handler{

    public LeaderA(int numStart) {
        super(numStart);
    }

    public LeaderA(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    public void handleLeave(LeaveRequest leaveRequest) {
        System.out.println("AAA审批了");
    }
}
