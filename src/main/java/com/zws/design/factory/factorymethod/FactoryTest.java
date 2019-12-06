package com.zws.design.factory.factorymethod;

import com.zws.design.factory.factorymethod.entity.IceBox;
import com.zws.design.factory.factorymethod.fac.HaierIceBoxFactory;
import com.zws.design.factory.factorymethod.fac.IceBoxFactory;
import com.zws.design.factory.factorymethod.fac.MediaIceBoxFactory;

/**
 * @author zhengws
 * @date 2019-07-23 09:27
 */
public class FactoryTest {
    public static void main(String[] args) {
//        IceBoxFactory factory = new HaierIceBoxFactory();
        IceBoxFactory factory = new MediaIceBoxFactory();
        IceBox iceBox = factory.createIceBox();
        iceBox.showModel();
    }
}
