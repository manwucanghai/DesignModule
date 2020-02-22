package com.zws.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 用户观察者
 *
 * @author zhengws
 * @date 2020-02-22 07:41
 */
public class UserObserver implements Observer {

    /**
     * 当触发某个事件时，被观察者会自动调用update方法，通知观察者，触发特定动作。
     *
     * @param source 事件源
     * @param event  具体的事件信息
     */
    public void update(Observable source, Object event) {
        if (event instanceof EventPlay) {
            EventPlay eventPlay = (EventPlay) event;
            if (eventPlay.getType() == 1) {
                System.out.println("注意：进入重点了，先去上厕所");
            } else if (eventPlay.getType() == 0) {
                System.out.println("快进播放");
            }
        }
    }
}
