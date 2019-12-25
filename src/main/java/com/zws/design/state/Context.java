package com.zws.design.state;

import com.zws.design.state.lift.LiftState;

/**
 * @author zhengws
 * @date 2019-12-25 22:24
 */
public class Context extends LiftState {
    private LiftState state;

    public Context(LiftState state) {
        this.state = state;
        state.setContext(this);
    }

    public void setState(LiftState state) {
        this.state = state;
        state.setContext(this);
    }

    @Override
    public void open() {
        state.open();
    }

    @Override
    public void close() {
        state.close();
    }

    @Override
    public void run() {
        state.run();
    }

    @Override
    public void stop() {
        state.stop();
    }
}
