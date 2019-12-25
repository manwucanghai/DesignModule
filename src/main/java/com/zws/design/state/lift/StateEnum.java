package com.zws.design.state.lift;


/**
 * @author zhengws
 * @date 2019-12-25 22:37
 */
public enum StateEnum {
    RUNNINGSTATE(new RuningState()),
    OPENINGSTATE(new OpeningState()),
    STOPINGSTATE(new StopingState()),
    CLOSINGSTATE(new ClosingState());

    public LiftState state;

    StateEnum(LiftState state) {
        this.state = state;
    }

}
