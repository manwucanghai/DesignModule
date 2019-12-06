package com.zws.design.adapter;

/**
 * @author zhengws
 * @date 2019-10-08 13:43
 */
public class ClassAdapter extends AcAdaptee implements IAdapter {
    public int voltage5V() {
        int voltage = super.voltage220V() / 44;
        System.out.println("Adapter适配器，将220v转换为5v...");
        return voltage;
    }
}
