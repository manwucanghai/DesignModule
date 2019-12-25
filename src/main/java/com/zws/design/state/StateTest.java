package com.zws.design.state;

import com.zws.design.state.lift.OpeningState;

/**
 * @author zhengws
 * @date 2019-12-25 22:58
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context(new OpeningState());
        context.close();
        context.run();
        context.stop();
        context.open();
        context.stop();
        /**
         * 电梯门关闭
         * 电梯开始运行
         * 电梯停止运行
         * 电梯门打开
         * Exception in thread "main" java.lang.RuntimeException: 此状态不支持停止
         * 	at com.zws.design.state.lift.LiftState.stop(LiftState.java:41)
         * 	at com.zws.design.state.Context.stop(Context.java:39)
         * 	at com.zws.design.state.StateTest.main(StateTest.java:16)
         */
    }
}
