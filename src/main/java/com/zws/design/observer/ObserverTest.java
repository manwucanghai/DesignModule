package com.zws.design.observer;

/**
 * @author zhengws
 * @date 2020-02-22 07:54
 */
public class ObserverTest {
    public static void main(String[] args) {
        MoviceObservable moviceObservable = new MoviceObservable();
        moviceObservable.addObserver(new UserObserver());
        moviceObservable.player(1);

        System.out.println("#############");
        moviceObservable.player(0);

        System.out.println("#############");
        moviceObservable.player(3);
        /**
         * 被观察者(电影): 开始播放重点
         * 注意：进入重点了，先去上厕所
         * #############
         * 被观察者(电影): 开始播放普通情节
         * 快进播放
         * #############
         * 被观察者(电影): 其他情况，不进行通知
         */
    }
}
