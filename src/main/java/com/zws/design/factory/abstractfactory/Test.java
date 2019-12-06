package com.zws.design.factory.abstractfactory;

/**
 * @author zhengws
 * @date 2019-07-23 13:39
 */
public class Test {
    public static void main(String[] args) {
        HomeElecFactory homeElecFactory = new MideaHomeElecFactory();
        IceBox iceBox = homeElecFactory.createIceBox();
        iceBox.showModel();
        WashingMac washingMac = homeElecFactory.createWashingMac();
        washingMac.showModel();
    }
}
