package com.zws.design.single.lazy.doublecheck;

/**
 * @author zhengws
 * @date 2019-07-19 16:23
 */
public class LazyDoubleCheckThread implements Runnable {

    public void run() {
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(instance);
    }

}
