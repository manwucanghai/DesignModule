package com.zws.design.single.lazy.staticmethodsync;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhengws
 * @date 2019-07-19 16:23
 */
public class LazyThread implements Runnable {
    private static final AtomicInteger count = new AtomicInteger(0);

    /**
     * 为验证静态方法synchronized，锁范围
     */
    public void run() {
        int num = count.getAndIncrement();
        if ( num % 2 == 0){
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }else {
            LazySingleton.printTest();
        }
    }

}
