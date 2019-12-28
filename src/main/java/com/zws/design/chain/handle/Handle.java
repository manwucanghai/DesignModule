package com.zws.design.chain.handle;

import com.zws.design.chain.IWomen;

/**
 * @author zhengws
 * @date 2019-12-28 19:33
 */
public abstract class Handle {
    private int level;

    private Handle nextHandle;

    public Handle(int level) {
        this.level = level;
    }

    public void setNextHandle(Handle nextHandle) {
        this.nextHandle = nextHandle;
    }

    public final void handleMessage(IWomen women) {
        //如果是符合当前类型，则调用当前的response响应。
        if (women.getType() == this.level) {
            response(women);
        } else {
            //如果不符合，则如果有下一个处理handle，则进行下一个handle处理，没有的话则进行抛错处理。
            if (nextHandle != null) {
                nextHandle.handleMessage(women);
            } else {
                throw new RuntimeException("没人进行处理");
            }
        }
    }

    /**
     * 采用模板模式，将实现交给子类进行处理
     * @param women
     */
    protected abstract void response(IWomen women);
}
