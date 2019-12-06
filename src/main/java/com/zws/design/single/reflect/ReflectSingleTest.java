package com.zws.design.single.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author zhengws
 * @date 2019-07-19 19:56
 */
public class ReflectSingleTest {
    public static void main(String[] args) throws Exception {

        ReflectHungrySingleton beforeInstance = ReflectHungrySingleton.getInstance();
        System.out.println("攻击前通过getInstance() 获取的对象:" + beforeInstance);

        Class<?> c = Class.forName(ReflectHungrySingleton.class.getName());
        Constructor<?> constructor = c.getDeclaredConstructor();
        /**
         * Class com.zws.design.single.reflect.ReflectSingleTest can not access a member of
         * class com.zws.design.single.reflect.ReflectHungrySingleton with modifiers "private"
         * 将构造函数权限打开。
         */
        constructor.setAccessible(true);

        /**
         * 试图将instance设置为空，进行反射创建对象.
         * 如果ReflectHungrySingleton 的instance设置为final字段类型，无法对其值进行修改。会报以下错误
         * Can not set static final com.zws.design.single.reflect.ReflectHungrySingleton field
         */
        Field ins = c.getDeclaredField("instance");
        ins.setAccessible(true);
        ins.set(ReflectHungrySingleton.getInstance(), null);

        ReflectHungrySingleton newInstance = (ReflectHungrySingleton) constructor.newInstance();

        /**
         * 如果ReflectHungrySingleton 的instance未设置为final,则可将ReflectHungrySingleton的instance 引用指向反射创建的对象
         * 后续只要再次调用getInstance，则都为攻击者创建的实例对象。
         */
        ins.set(newInstance, newInstance);

        ReflectHungrySingleton endInstance = ReflectHungrySingleton.getInstance();

        System.out.println("攻击者通过反射创建的实例对象       :" + newInstance);
        System.out.println("攻击后通过getInstance() 获取的对象:" + endInstance);
        System.out.println(newInstance == endInstance);

        /**
         * 攻击前通过getInstance() 获取的对象:com.zws.design.single.reflect.ReflectHungrySingleton@61bbe9ba
         * 攻击者通过反射创建的实例对象       :com.zws.design.single.reflect.ReflectHungrySingleton@60e53b93
         * 攻击后通过getInstance() 获取的对象:com.zws.design.single.reflect.ReflectHungrySingleton@60e53b93
         * true
         */


//        ReflectLazySingleton instance = ReflectLazySingleton.getInstance();
//
//        Class clazz = ReflectLazySingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        Field flag = clazz.getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(ReflectLazySingleton.getInstance(), new AtomicBoolean(false));
//        ReflectLazySingleton newInstance = (ReflectLazySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(newInstance == instance);
//
//        /**
//         * 结果
//         * com.zws.design.single.reflect.ReflectLazySingleton@61bbe9ba
//         * com.zws.design.single.reflect.ReflectLazySingleton@610455d6
//         * false
//         */
    }
}
