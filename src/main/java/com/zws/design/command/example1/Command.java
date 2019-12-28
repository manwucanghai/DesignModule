package com.zws.design.command.example1;

/**
 * @author zhengws
 * @date 2019-09-06 15:56
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void execute();
}
