package com.zws.design.single.enums;

/**
 * @author zhengws
 * @date 2019-07-21 09:47
 */
public enum  EmumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
