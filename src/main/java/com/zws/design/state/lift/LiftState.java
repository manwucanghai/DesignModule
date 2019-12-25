package com.zws.design.state.lift;

import com.zws.design.state.Context;

/**
 * @author zhengws
 * @date 2019-12-25 22:23
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 打开电梯门
     */
    public void open() {
        throw new RuntimeException("此状态不支持开门");
    }

    /**
     * 关闭电梯
     */
    public void close() {
        throw new RuntimeException("此状态不支持关门");
    }

    /**
     * 运行电梯
     */
    public void run() {
        throw new RuntimeException("此状态不支持运行电梯");
    }

    /**
     * 停止运行
     */
    public void stop() {
        throw new RuntimeException("此状态不支持停止");
    }
}
