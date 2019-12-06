package com.zws.design.single.clone;

import java.io.Serializable;

/**
 * @author zhengws
 * @date 2019-07-19 18:00
 */
public class CloneSingleton implements Serializable ,Cloneable{
    private static final CloneSingleton instance = new CloneSingleton();

    private CloneSingleton() {
    }


    public static CloneSingleton getInstance(){
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
