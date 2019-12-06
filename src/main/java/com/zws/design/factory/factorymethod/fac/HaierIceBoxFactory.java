package com.zws.design.factory.factorymethod.fac;

import com.zws.design.factory.factorymethod.entity.HaierIceBox;
import com.zws.design.factory.factorymethod.entity.IceBox;

/**
 * @author zhengws
 * @date 2019-07-23 09:26
 */
public class HaierIceBoxFactory extends IceBoxFactory {
    public IceBox createIceBox() {
        return new HaierIceBox();
    }
}
