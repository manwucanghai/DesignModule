package com.zws.design.command.example1;

import java.util.LinkedHashSet;

/**
 * 接口人，专门接手命令，并执行命令的。
 *
 * @author zhengws
 * @date 2019-09-06 15:58
 */
public class Invoker {

    private LinkedHashSet<Command> commands;

    public Invoker() {

    }

    public Invoker(LinkedHashSet<Command> commands) {
        this.commands = commands;
    }

    public void addCommand(Command command) {
        if (commands == null || commands.size() == 0) {
            commands = new LinkedHashSet<Command>();
        }
        commands.add(command);
    }

    public void removeCommand(Command command) {
        if (commands == null || commands.size() == 0) {
            return;
        }
        commands.remove(command);
    }

    public void action() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
