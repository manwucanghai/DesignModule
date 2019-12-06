package com.zws.design.single.hungry;

/**
 * @author zhengws
 * @date 2019-07-19 18:03
 */
public class HungryThread implements Runnable {
    public void run() {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
    }
}
