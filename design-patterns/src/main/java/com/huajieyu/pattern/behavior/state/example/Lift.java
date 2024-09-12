package com.huajieyu.pattern.behavior.state.example;

public class Lift implements ILift{

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE -> {
                break;
            }
            case CLOSING_STATE -> {
                System.out.println("打开了");
                this.state = OPENING_STATE;
                break;
            }
            case RUNNING_STATE -> {
                System.out.println("不能打开");
                break;
            }
            case STOPPING_STATE -> {
                this.state = OPENING_STATE;
                System.out.println("打开了");
                break;
            }
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE -> {
                System.out.println("关闭了");
                this.state = CLOSING_STATE;
                break;
            }
            case CLOSING_STATE -> {
                break;
            }
            case RUNNING_STATE -> {
                break;
            }
            case STOPPING_STATE -> {
                break;
            }
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE -> {
                System.out.println("门开着不能运行");
                break;
            }
            case CLOSING_STATE -> {
                System.out.println("运行了");
                this.state = RUNNING_STATE;
                break;
            }
            case RUNNING_STATE -> {
                break;
            }
            case STOPPING_STATE -> {
                System.out.println("运行了");
                this.state = RUNNING_STATE;
                break;
            }
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE -> {
                System.out.println("门开着不能停止");
                break;
            }
            case CLOSING_STATE -> {
                System.out.println("关闭了");
                this.state = CLOSING_STATE;
                break;
            }
            case RUNNING_STATE -> {
                System.out.println("不能突然停止运行");
                break;
            }
            case STOPPING_STATE -> {
                break;
            }
        }
    }
}
