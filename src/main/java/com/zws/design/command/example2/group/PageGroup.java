package com.zws.design.command.example2.group;

/**
 * 页面组，也就是前端组
 * @author zhengws
 * @date 2019-12-26 07:01
 */
public class PageGroup implements Group {
    public void find() {
        System.out.println("找到页面组...");
    }

    public void add() {
        System.out.println("客户要求添加一个页面");
    }

    public void delete() {
        System.out.println("客户要求删除一个页面");
    }

    public void change() {
        System.out.println("客户要求修改一个页面");
    }

    public void plan() {
        System.out.println("客户要求页面调整计划");
    }
}
