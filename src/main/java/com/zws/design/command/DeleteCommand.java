package com.zws.design.command;

/**
 * @author zhengws
 * @date 2019-09-06 18:27
 */
public class DeleteCommand extends Command {
    public DeleteCommand() {
        super(new DeleteReceiver());
    }

    void execute() {
        super.receiver.action();
    }
}
