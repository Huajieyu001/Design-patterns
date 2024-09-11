package com.huajieyu.pattern.behavior.responsible_chain;

public class LeaderB extends Handler{

    public LeaderB(int numStart) {
        super(numStart);
    }

    public LeaderB(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    public void handleLeave(LeaveRequest leaveRequest) {
        System.out.println("BBB审批了");

    }
}
