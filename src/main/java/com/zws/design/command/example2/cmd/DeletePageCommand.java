package com.zws.design.command.example2.cmd;

/**
 * @author zhengws
 * @date 2019-12-26 07:12
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        pageGroup.find();
        pageGroup.delete();
        pageGroup.plan();
    }
}
