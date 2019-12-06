package com.zws.design.command;

/**
 * @author zhengws
 * @date 2019-09-06 18:16
 */
public class SelectReceiver implements Receiver {
    public void action() {
        System.out.println("执行查询操作...");
    }
}
