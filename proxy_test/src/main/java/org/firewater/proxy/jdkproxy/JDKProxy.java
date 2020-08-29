package org.firewater.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy  implements InvocationHandler {

    private Object o;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before ();
        Object invoke = method.invoke(o, args);
        after();
        return invoke;
    }
    public Object getInstance(Object o) {
        this.o=  o;
        Class<?> clazz = o.getClass();
        Object o1 = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return  o1;

    }
    public void before(){
        System.out.println("JDK课前备课");
    }
    public void after(){
        System.out.println("JDK布置作业");
    }
}
