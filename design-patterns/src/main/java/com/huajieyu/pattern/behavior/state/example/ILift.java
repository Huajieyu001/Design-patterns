package com.huajieyu.pattern.behavior.state.example;

public interface ILift {

    static final int OPENING_STATE = 1;
    static final int CLOSING_STATE = 2;
    static final int RUNNING_STATE = 3;
    static final int STOPPING_STATE =4;

    void setState(int state);

    void open();
    void close();
    void run();
    void stop();
}
