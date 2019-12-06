package com.zws.design.single.enums;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * @author zhengws
 * @date 2019-07-21 09:49
 */
public class EmumTest {
    public static void main(String[] args) throws Exception {
        EmumSingleton instance = EmumSingleton.INSTANCE;
        instance.setData(new String("hahahhaa"));
        System.out.println(instance.getData());
//        /**
//         * 反序列化测试
//         */
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emum-instance"));
//        oos.writeObject(instance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("emum-instance")));
//        EmumSingleton newInstance = (EmumSingleton) ois.readObject();
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(newInstance.getData() == instance.getData());
//
//        //核心代码测试
//        EmumSingleton instance1 = Enum.valueOf(EmumSingleton.class, "INSTANCE");
//        System.out.println(instance1.getData());
//        /**
//         * 测试结果：
//         * java.lang.Object@2f4d3709
//         * java.lang.Object@2f4d3709
//         * true
//         * java.lang.Object@2f4d3709
//         */

//        /**
//         * 反射攻击测试1
//         */
//
//        Class<?> clazz = Class.forName(EmumSingleton.class.getName());
//        Constructor<?> constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        EmumSingleton newInstance = (EmumSingleton) constructor.newInstance();
//        System.out.println(newInstance);
//        /**
//         * 报错
//         * java.lang.NoSuchMethodException: com.zws.design.single.enums.EmumSingleton.<init>
//         */

//        /**
//         * 反射攻击测试2
//         */
//        Class<?> clazz = Class.forName(EmumSingleton.class.getName());
//        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//        EmumSingleton newInstance = (EmumSingleton) constructor.newInstance("INSTANCE", 0);
//        System.out.println(newInstance);
//        /**
//         * 报错
//         * java.lang.IllegalArgumentException: Cannot reflectively create enum objects
//         */



    }
}
