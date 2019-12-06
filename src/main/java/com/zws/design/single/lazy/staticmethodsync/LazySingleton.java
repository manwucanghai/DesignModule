package com.zws.design.single.lazy.staticmethodsync;

/**
 * 懒汉模式
 * @author zhengws
 * @date 2019-07-19 16:16
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    /**
     * 解决多线程，单例线程安全
     * 方法一：
     * 在静态方法上加synchronized
     * 缺点：
     * 静态方法上的synchronized, 加锁，解锁增加的开销，
     * 锁是针对类全局的，也就是只要进了getInstance方法，其他线程无法访问该类的所有加synchronized的方法。(锁范围太大)
     * @return
     */
    public synchronized static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    //为验证静态方法synchronized，锁范围
    public synchronized static void printTest(){
        System.out.println("printTest");
    }
}
