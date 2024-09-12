package com.huajieyu.pattern.behavior.state;

public class Context {

    public static final OpenState OPENING_STATE = new OpenState();
    public static final CloseState CLOSING_STATE = new CloseState();
    public static final RunState RUNNING_STATE = new RunState();
    public static final StopState STOPPING_STATE = new StopState();

    private LiftState state;

    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void run() {
        state.run();
    }

    public void stop() {
        state.stop();
    }
}
