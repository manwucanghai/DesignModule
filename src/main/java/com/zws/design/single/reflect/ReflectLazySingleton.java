package com.zws.design.single.reflect;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 懒汉模式
 *
 * @author zhengws
 * @date 2019-07-19 16:16
 */
public class ReflectLazySingleton {
    private static ReflectLazySingleton instance = null;
    private static AtomicBoolean flag = new AtomicBoolean(false);

    private ReflectLazySingleton() {
        /**
         * 如果flag值从flase 更换为true,则为true, 常用于系统是否已经启动判断
         * 当前进行取反，则为false
         */
        if (!flag.compareAndSet(false, true)) {
            throw new RuntimeException("单例模式，禁止反射生成对象");
        }
    }

    public synchronized static ReflectLazySingleton getInstance() {
        if (instance == null) {
            instance = new ReflectLazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        AtomicBoolean f1 = new AtomicBoolean(false);
        System.out.println(f1.compareAndSet(false,true));
        System.out.println(f1.get());
        System.out.println(f1.compareAndSet(false,false));
        System.out.println(f1.get());

    }
}
