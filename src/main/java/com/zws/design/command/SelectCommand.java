package com.zws.design.command;

/**
 * @author zhengws
 * @date 2019-09-06 16:01
 */
public class SelectCommand extends Command {

    public SelectCommand() {
        super(new SelectReceiver());
    }

    void execute() {
        super.receiver.action();
    }
}
