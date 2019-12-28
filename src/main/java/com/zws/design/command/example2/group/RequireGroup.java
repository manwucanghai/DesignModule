package com.zws.design.command.example2.group;

/**
 * 需求组
 * @author zhengws
 * @date 2019-12-26 07:02
 */
public class RequireGroup implements Group {
    public void find() {
        System.out.println("找到需求组...");
    }

    public void add() {
        System.out.println("客户要求添加一个需求");
    }

    public void delete() {
        System.out.println("客户要求删除一个需求");
    }

    public void change() {
        System.out.println("客户要求改变一个需求");
    }

    public void plan() {
        System.out.println("客户要求改变需求计划");
    }
}
