package com.zws.design.factory.factorymethod.fac;

import com.zws.design.factory.factorymethod.entity.IceBox;
import com.zws.design.factory.factorymethod.entity.MideaIceBox;

/**
 * @author zhengws
 * @date 2019-07-23 09:27
 */
public class MediaIceBoxFactory extends IceBoxFactory {
    public IceBox createIceBox() {
        return new MideaIceBox();
    }
}
