package com.zws.design.single.lazy.innerclass;

/**
 * @author zhengws
 * @date 2019-07-19 16:23
 */
public class LazyInnerClassThread implements Runnable {

    public void run() {
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        System.out.println(instance);
    }

}
