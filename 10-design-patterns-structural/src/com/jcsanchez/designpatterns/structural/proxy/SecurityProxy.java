package com.jcsanchez.designpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jsssn on 19-May-17.
 */
public class SecurityProxy implements InvocationHandler {

    private Object object;

    private SecurityProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        return java.lang.reflect.Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), new SecurityProxy(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        try {
            if (method.getName().contains("post")) {
                throw new IllegalAccessException("Posts are currently not allowed");
            } else {
                result = method.invoke(object, args);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        }

        return result;
    }
}
