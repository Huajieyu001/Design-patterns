package com.huajieyu.pattern.behavior.state;

public class OpenState extends LiftState{

    @Override
    public void open() {
        System.out.println("已经是打开状态");
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        System.out.println("门开着，不能运行");
    }

    @Override
    public void stop() {
        System.out.println("门开着，不能停止");
    }
}
