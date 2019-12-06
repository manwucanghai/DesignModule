package com.zws.design.proxy.dynamic;

/**
 * @author zhengws
 * @date 2019-09-06 10:20
 */
public class BeforeAdvice implements IAdvice {
    public void execute() {
        System.out.println("执行前操作.");
    }
}
