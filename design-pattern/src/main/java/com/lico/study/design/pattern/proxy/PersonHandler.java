package com.lico.study.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 项目：lico-study
 * 包名：com.lico.study.proxy
 * 功能：
 * 时间：2018-03-21
 * 作者：miaoxw
 */
public class PersonHandler<T> implements InvocationHandler {

    private T o;

    public PersonHandler(T o) {
        this.o = o;
    }

    public T proxy() {
        return (T) Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("proxy start:");
        Object result = method.invoke(o, args);
        System.err.println("proxy end.");
        return result;
    }
}
