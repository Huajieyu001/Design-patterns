package com.huajieyu.pattern.behavior.state;

public class RunState extends LiftState{

    @Override
    public void open() {
    }

    @Override
    public void close() {
    }

    @Override
    public void run() {
        System.out.println("已经是运行状态");
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
