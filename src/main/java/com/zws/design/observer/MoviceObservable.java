package com.zws.design.observer;

import java.util.Observable;

/**
 * 被观察者
 *
 * @author zhengws
 * @date 2020-02-22 07:44
 */
public class MoviceObservable extends Observable {

    public void player(int type) {
        if (type == 1) {
            System.out.println("被观察者(电影): 开始播放重点");
            setChanged();
            notifyObservers(new EventPlay(this, type));
        } else if (type == 0) {
            System.out.println("被观察者(电影): 开始播放普通情节");
            setChanged();
            notifyObservers(new EventPlay(this, type));
        } else {
            System.out.println("被观察者(电影): 其他情况，不进行通知");
            notifyObservers(new EventPlay(this, type));
        }

    }
}
