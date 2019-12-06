package com.zws.design.single.lazy.innerclass;

/**
 * 懒汉模式
 * @author zhengws
 * @date 2019-07-19 16:16
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if (InnerClass.instance != null){
            throw new RuntimeException("单例模式，禁止反射创建对象");
        }
    }

    /**
     * 解决多线程，单例线程安全
     * 方法三： 静态内部类 (基于类初始化延迟加载，解决指令重排序问题)
     * 原理：
     * 在类进行初始化期间，JVM会获取Class对象初始化锁
     *
     * 什么情况下JVM回进行Class对象初始化锁获取？
     * 1、A类的实例被创建
     * 2、A类中声名的静态方法被初次调用
     * 3、A类中声名的静态成员被初次赋值
     * 4、A类中声名的静态成员被初次使用，并且该成员不是常量成员
     * @return
     */
    private static class InnerClass {
        private static LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

}
