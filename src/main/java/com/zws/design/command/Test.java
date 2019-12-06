package com.zws.design.command;

/**
 * @author zhengws
 * @date 2019-09-06 18:17
 */
public class Test {
    public static void main(String[] args) {
        Command selectCommand = new SelectCommand();
        Command deleteCommand = new DeleteCommand();
        Invoker invoker = new Invoker();
        invoker.addCommand(selectCommand);
        invoker.addCommand(deleteCommand);
        invoker.removeCommand(selectCommand);
        invoker.action();

    }
}
