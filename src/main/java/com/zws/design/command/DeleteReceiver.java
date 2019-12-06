package com.zws.design.command;

/**
 * @author zhengws
 * @date 2019-09-06 18:27
 */
public class DeleteReceiver implements Receiver {
    public void action() {
        System.out.println("开始执行删除操作...");
    }
}
