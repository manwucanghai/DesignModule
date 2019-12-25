package com.zws.design.state.lift;

/**
 * @author zhengws
 * @date 2019-12-25 22:28
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        System.out.println("打开电梯门");
        context.setState(StateEnum.OPENINGSTATE.state);
    }

    @Override
    public void run() {
        System.out.println("电梯开始运行");
        context.setState(StateEnum.RUNNINGSTATE.state);
    }

    @Override
    public void stop() {
        System.out.println("电梯停止运行");
        context.setState(StateEnum.STOPINGSTATE.state);
    }
}
