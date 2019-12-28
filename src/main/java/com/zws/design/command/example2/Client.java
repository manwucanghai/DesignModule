package com.zws.design.command.example2;

import com.zws.design.command.example2.cmd.Command;
import com.zws.design.command.example2.cmd.DeletePageCommand;

/**
 * @author zhengws
 * @date 2019-12-26 07:15
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command deletePageCommand = new DeletePageCommand();
        invoker.setCommand(deletePageCommand);
        invoker.aciton();
    }
}
