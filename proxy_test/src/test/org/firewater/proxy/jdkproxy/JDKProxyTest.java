package org.firewater.proxy.jdkproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        JDKProxy jdkProxy =new JDKProxy();
        Object instance = jdkProxy.getInstance(new Student());
        Method study = instance.getClass().getMethod("study", null);
        study.invoke(instance);
    }
}
