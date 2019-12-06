package com.zws.design.proxy.dynamic;

/**
 * @author zhengws
 * @date 2019-09-06 10:22
 */
public class AroundAdvice implements IAdvice {
    public void execute() {
        System.out.println("环绕操作执行");
    }
}
