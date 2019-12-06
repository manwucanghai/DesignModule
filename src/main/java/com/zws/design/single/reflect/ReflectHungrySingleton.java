package com.zws.design.single.reflect;

/**
 * @author zhengws
 * @date 2019-07-19 18:00
 */
public class ReflectHungrySingleton {
    /**
     * 注意，此instance必须设置为final,不然也可以通过发射进行将该值修改为null，后续通过getInstance()获取到的都为null，
     * 且可进行任意的反射调用创建对象。
     * 甚至，通过发射攻击生成对象，将其值赋值给instance,后续只要有人调用getInstance()，获取的对象都为攻击者创建的对象实例.
     */
    private static final ReflectHungrySingleton instance = new ReflectHungrySingleton();

    private ReflectHungrySingleton() {
        if (instance != null){
            throw new RuntimeException("单例模式，禁止反射创建对象");
        }
    }

    public static ReflectHungrySingleton getInstance(){
        return instance;
    }
}
