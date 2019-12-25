package com.zws.design.state.lift;

/**
 * @author zhengws
 * @date 2019-12-25 22:28
 */
public class OpeningState extends LiftState {
    @Override
    public void close() {
        System.out.println("电梯门关闭");
        context.setState(StateEnum.CLOSINGSTATE.state);
    }
}
