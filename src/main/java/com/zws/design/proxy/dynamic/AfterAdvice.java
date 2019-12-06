package com.zws.design.proxy.dynamic;

/**
 * @author zhengws
 * @date 2019-09-06 10:21
 */
public class AfterAdvice implements IAdvice {
    public void execute() {
        System.out.println("后置操作。");
    }
}
