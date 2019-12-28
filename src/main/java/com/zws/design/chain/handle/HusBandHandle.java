package com.zws.design.chain.handle;

import com.zws.design.chain.IWomen;

/**
 * @author zhengws
 * @date 2019-12-28 19:44
 */
public class HusBandHandle extends Handle {

    public HusBandHandle() {
        super(2);
    }

    protected void response(IWomen women) {
        System.out.println(women.request());
        System.out.println("丈夫回应: 同意");
    }
}
