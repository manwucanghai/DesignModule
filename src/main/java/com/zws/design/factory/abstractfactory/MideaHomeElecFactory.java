package com.zws.design.factory.abstractfactory;

/**
 * @author zhengws
 * @date 2019-07-23 13:39
 */
public class MideaHomeElecFactory extends HomeElecFactory {
    IceBox createIceBox() {
        return new MideaIceBox();
    }

    WashingMac createWashingMac() {
        return new MideaWashingMac();
    }
}
