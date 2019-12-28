package com.zws.design.command.example2.group;

/**
 * @author zhengws
 * @date 2019-12-26 07:03
 */
public class CodeGroup implements Group {
    public void find() {
        System.out.println("找到代码组...");
    }

    public void add() {
        System.out.println("客户要求增加一项功能");
    }

    public void delete() {
        System.out.println("客户要求删除一项功能");
    }

    public void change() {
        System.out.println("客户要求修改一项功能");
    }

    public void plan() {
        System.out.println("可以要求代码变更计划.");
    }
}
