package com.zws.design.command.example2;

import com.zws.design.command.example2.cmd.Command;

/**
 * 负责人只要接到客户的命令，就立刻执行
 * @author zhengws
 * @date 2019-12-26 07:13
 */

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void aciton() {
        command.execute();
    }
}
