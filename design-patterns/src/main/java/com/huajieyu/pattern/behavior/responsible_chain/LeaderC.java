package com.huajieyu.pattern.behavior.responsible_chain;

public class LeaderC extends Handler{

    public LeaderC(int numStart) {
        super(numStart);
    }

    public LeaderC(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    public void handleLeave(LeaveRequest leaveRequest) {
        System.out.println("CCC审批了");
    }
}
