package com.zws.design.single.clone;

/**
 * @author zhengws
 * @date 2019-07-22 09:35
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneSingleton instance = CloneSingleton.getInstance();

        CloneSingleton newInstance = (CloneSingleton)instance.clone();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);
        /**
         * 测试结果：
         * com.zws.design.single.clone.CloneSingleton@61bbe9ba
         * com.zws.design.single.clone.CloneSingleton@610455d6
         * false
         */
    }
}
