package com.zws.design.command.example2.cmd;

/**
 * @author zhengws
 * @date 2019-12-26 07:09
 */
public class AddRequirementCommand extends Command {
    public void execute() {
        requireGroup.find();
        requireGroup.add();
        requireGroup.plan();
    }
}
