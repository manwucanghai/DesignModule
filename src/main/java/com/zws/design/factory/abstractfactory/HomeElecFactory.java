package com.zws.design.factory.abstractfactory;

/**
 * 家用电器工厂
 *
 * @author zhengws
 * @date 2019-07-23 13:36
 */
public abstract class HomeElecFactory {
    /**
     * 创建冰箱
     *
     * @return
     */
    abstract IceBox createIceBox();

    /**
     * 创建洗衣机
     *
     * @return
     */
    abstract WashingMac createWashingMac();
}
