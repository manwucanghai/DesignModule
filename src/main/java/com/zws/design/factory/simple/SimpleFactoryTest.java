package com.zws.design.factory.simple;

import com.zws.design.factory.simple.entity.BlackCar;
import com.zws.design.factory.simple.entity.BlueCar;
import com.zws.design.factory.simple.entity.RedCar;

/**
 * @author zhengws
 * @date 2019-07-22 10:50
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        RedCar redCar = SimpleFactory.createCar(RedCar.class);
        redCar.run();

        BlackCar blackCar = SimpleFactory.createCar(BlackCar.class);
        blackCar.run();

        BlueCar blueCar = SimpleFactory.createCar(BlueCar.class);
        blueCar.run();

        /**
         * 测试结果
         * 红色车，开跑
         * 黑色车，开跑
         * 蓝色车，开跑
         */
    }
}
