package com.jjc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestInvokerHandler implements InvocationHandler {

    private Object target;

    public TestInvokerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object invoke = method.invoke(target, args);
        System.out.println("after");
        return invoke;
    }

    public static void main(String[] args) {

    }

}
