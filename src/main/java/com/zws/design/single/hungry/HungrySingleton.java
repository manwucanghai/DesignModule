package com.zws.design.single.hungry;

/**
 * @author zhengws
 * @date 2019-07-19 18:00
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    /**
     * 饿汉式单例模式
     * 优点：无需任何判断，直接返回实例对象
     * 缺点：类加载时，对象会随之被创建，可能造成资源浪费
     * @return
     */
    public static HungrySingleton getInstance(){
        return instance;
    }
}
