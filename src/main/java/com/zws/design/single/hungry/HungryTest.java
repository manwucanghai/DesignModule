package com.zws.design.single.hungry;

/**
 * @author zhengws
 * @date 2019-07-19 18:03
 */
public class HungryTest {
    public static void main(String[] args) {
        /**
         * 饿汉式测试
         */
        new Thread(new HungryThread()).start();
        new Thread(new HungryThread()).start();
    }
}
