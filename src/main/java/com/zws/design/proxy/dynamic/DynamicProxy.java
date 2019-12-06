package com.zws.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhengws
 * @date 2019-09-02 18:10
 */
public class DynamicProxy {
    public static <T> T newProxyInstance(Object subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new GameInvocationHandler(subject, new AfterAdvice());
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
