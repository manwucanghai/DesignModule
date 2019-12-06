package com.zws.design.single.lazy.doublecheck;

/**
 * 懒汉模式
 * @author zhengws
 * @date 2019-07-19 16:16
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){

    }

    /**
     * 解决多线程，单例线程安全
     * 方法二： DoubleCheck + volatile
     * 优点: 兼顾了懒加载和性能问题
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (instance == null){
                    instance = new LazyDoubleCheckSingleton();
                    /**
                     * 多线程可能存在指令重排序问题(2,3可能对换)
                     * 1.分配内存给这个对象
                     * 2.初始化对象
                     * 3.设置instance 指向内存地址
                     * 4.初次访问对象
                     *
                     * 指令重排序情景:
                     * 当出现指令重排序时，线程一给对象分配内存地址，并进行指向，此时线程二判断实例不为空，直接返回实例进行访问(但是实例并未进行初始化操作)，因此会报错。
                     *
                     * 如何解决？
                     * 1. 不允许重排序，添加关键字段(volatile),确保共享内存数据一致性
                     * 2. 允许重排序，基于类初始化的延迟加载 (采用静态内部类实现.)
                     */
                }
            }
        }
        return instance;
    }

}
