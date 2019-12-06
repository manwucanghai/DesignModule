package com.zws.design.adapter;

/**
 * @author zhengws
 * @date 2019-10-08 13:48
 */
public class ObjectAdapter implements IAdapter{
    private IAdaptee adaptee;

    public ObjectAdapter(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public int voltage5V() {
        int voltage = this.adaptee.voltage220V() / 44;
        System.out.println("Adapter适配器，将220v转换为5v...");
        return voltage;
    }
}
