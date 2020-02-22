package com.zws.design.observer;

import java.util.EventObject;

/**
 * @author zhengws
 * @date 2020-02-22 07:47
 */
public class EventPlay extends EventObject {

    /**
     * 0 为普通类型，1为重点
     */
    private int type;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventPlay(Object source) {
        super(source);
    }

    public EventPlay(Object source, int type) {
        super(source);
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
