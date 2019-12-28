package com.zws.design.chain.handle;

import com.zws.design.chain.IWomen;

/**
 * @author zhengws
 * @date 2019-12-28 19:42
 */
public class FatherHandle extends Handle {

    public FatherHandle() {
        super(1);
    }

    protected void response(IWomen women) {
        System.out.println(women.request());
        System.out.println("父亲回应: 同意");
    }
}
