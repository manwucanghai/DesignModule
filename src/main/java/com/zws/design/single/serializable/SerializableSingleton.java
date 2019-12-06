package com.zws.design.single.serializable;

import java.io.Serializable;

/**
 * @author zhengws
 * @date 2019-07-19 18:00
 */
public class SerializableSingleton implements Serializable {
    private static final SerializableSingleton instance = new SerializableSingleton();

    private SerializableSingleton() {
    }


    public static SerializableSingleton getInstance(){
        return instance;
    }

    /**
     * 防止反序列化时，新建并返回新的对象。
     * 根据ObjectStreamClass 的isInstantiable，判断反序列化对象是否可反序列化对象，判断为是时，进行反序列化成新的对象(实际上已经反序列化生成新的对象了)
     * 根据ObjectStreamClass 的hasReadResolveMethod，判断该实例对象是否有 readResolve方法
     * 如果有readResolve方法，则通过ObjectStreamClass 的invokeReadResolve 方法，进行反射掉实例对象的readResolve方法.
     * @return
     */
    public Object readResolve(){
        return instance;
    }
}
