package com.zws.design.adapter;

/**
 * @author zhengws
 * @date 2019-10-08 13:41
 */
public class AcAdaptee implements IAdaptee {
    public int voltage220V() {
        System.out.println("源电压220v");
        return 220;
    }
}
