package com.zws.design.factory.abstractfactory;

/**
 * @author zhengws
 * @date 2019-07-23 13:38
 */
public class HaierHomeElecFactory extends HomeElecFactory {
    IceBox createIceBox() {
        return new HaierIceBox();
    }

    WashingMac createWashingMac() {
        return new HaierWashingMac();
    }
}
