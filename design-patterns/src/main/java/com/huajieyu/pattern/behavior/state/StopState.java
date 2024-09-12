package com.huajieyu.pattern.behavior.state;

public class StopState extends LiftState{

    @Override
    public void open() {
        super.context.setState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        super.context.setState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("已经是停止状态");
    }
}
