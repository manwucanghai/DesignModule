package com.zws.design.chain;

import com.zws.design.chain.handle.FatherHandle;
import com.zws.design.chain.handle.Handle;
import com.zws.design.chain.handle.HusBandHandle;
import com.zws.design.chain.handle.SunHandle;

/**
 * @author zhengws
 * @date 2019-12-28 19:45
 */
public class Client {
    public static void main(String[] args) {
        IWomen women = null;
        Handle fatherHandle = new FatherHandle();
        Handle husBandHandle = new HusBandHandle();
        Handle sunHandle = new SunHandle();

        fatherHandle.setNextHandle(husBandHandle);
        husBandHandle.setNextHandle(sunHandle);

        for (int i = 1; i < 4; i++) {
            women = new Women(i);
            fatherHandle.handleMessage(women);
            System.out.println("###############");
        }
    }

    /**
     * 输出：
     * 来自女儿的请求
     * 父亲回应: 同意
     * ###############
     * 来自妻子的请求
     * 丈夫回应: 同意
     * ###############
     * 来自母亲的请求
     * 儿子回应: 同意
     * ###############
     */
}
