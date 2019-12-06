package com.zws.design.single.lazy;

import com.zws.design.single.lazy.doublecheck.LazyDoubleCheckThread;
import com.zws.design.single.lazy.innerclass.LazyInnerClassThread;
import com.zws.design.single.lazy.staticmethodsync.LazyThread;

/**
 * @author zhengws
 * @date 2019-07-19 16:22
 */
public class LazyTest {
    public static void main(String[] args) {
        /**
         * 静态方法synchronized
         */
//        new Thread(new LazyThread()).start();
//        new Thread(new LazyThread()).start();

        /**
         * double check.
         */
//        new Thread(new LazyDoubleCheckThread()).start();
//        new Thread(new LazyDoubleCheckThread()).start();

        /**
         * 内部静态类验证
         */
        new Thread(new LazyInnerClassThread()).start();
        new Thread(new LazyInnerClassThread()).start();
    }
}
