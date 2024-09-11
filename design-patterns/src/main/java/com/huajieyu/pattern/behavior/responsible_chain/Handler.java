package com.huajieyu.pattern.behavior.responsible_chain;

public abstract class Handler {

    public static final int NUM_ONE = 1;
    public static final int NUM_THREE = 3;
    public static final int NUM_SEVEN = 7;

    private int numStart;

    private int numEnd;
    private Handler nextLeader;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextLeader(Handler nextLeader) {
        this.nextLeader = nextLeader;
    }

    public Handler getNextLeader(){
        return this.nextLeader;
    }

    public final void submit(LeaveRequest leaveRequest){
        if(leaveRequest.getNum() <= this.numEnd){
            System.out.println("请假成功");
            this.handleLeave(leaveRequest);
            return;
        }
        if(nextLeader != null){
            System.out.println("审批权限不够，需要向上级领导申请,我只能审批" + this.numEnd + "天的假");
            nextLeader.submit(leaveRequest);
        }
        else{
            System.out.println("请假失败，你请得太多了");
        }
    }

    public abstract void handleLeave(LeaveRequest leaveRequest);
}
