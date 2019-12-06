package com.zws.design.factory.simple;

import com.zws.design.factory.simple.entity.Car;

/**
 * @author zhengws
 * @date 2019-07-22 10:42
 */
public class SimpleFactory {
//    private Car car = null;
    public static <T extends Car> T createCar(Class<T> clazz) {
        try {
            T car = clazz.newInstance();
            return car;
        } catch (Exception e) {
            return null;
        }
    }
}
