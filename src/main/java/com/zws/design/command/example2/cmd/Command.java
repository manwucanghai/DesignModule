package com.zws.design.command.example2.cmd;

import com.zws.design.command.example2.group.CodeGroup;
import com.zws.design.command.example2.group.Group;
import com.zws.design.command.example2.group.PageGroup;
import com.zws.design.command.example2.group.RequireGroup;

/**
 * @author zhengws
 * @date 2019-12-26 07:06
 */
public abstract class Command {

    protected static final Group pageGroup = new PageGroup();
    protected static final Group codeGroup = new CodeGroup();
    protected static final Group requireGroup = new RequireGroup();

    /**
     * 执行命令
     */
    public abstract void execute();
}
