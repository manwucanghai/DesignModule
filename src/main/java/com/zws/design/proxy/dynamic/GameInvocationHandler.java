package com.zws.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhengws
 * @date 2019-09-02 18:06
 */
public class GameInvocationHandler implements InvocationHandler {
    private Object target = null;
    private IAdvice advice = null;

    public GameInvocationHandler(Object target, IAdvice advice) {
        this.target = target;
        this.advice = advice;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (advice instanceof BeforeAdvice || advice instanceof AroundAdvice){
            advice.execute();
        }
        Object result = method.invoke(this.target, args);
        if (advice instanceof AfterAdvice || advice instanceof AroundAdvice){
            advice.execute();
        }
        return result;
    }
}
