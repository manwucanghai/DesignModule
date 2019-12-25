package com.zws.design.state.lift;

/**
 * @author zhengws
 * @date 2019-12-25 22:29
 */
public class RuningState extends LiftState {

    @Override
    public void stop() {
        System.out.println("电梯停止运行");
        context.setState(StateEnum.STOPINGSTATE.state);
    }
}
