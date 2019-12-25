package com.zws.design.state.lift;

/**
 * @author zhengws
 * @date 2019-12-25 22:36
 */
public class StopingState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门打开");
        context.setState(StateEnum.OPENINGSTATE.state);
    }


    @Override
    public void run() {
        System.out.println("电梯开始运行");
        context.setState(StateEnum.RUNNINGSTATE.state);
    }
}
