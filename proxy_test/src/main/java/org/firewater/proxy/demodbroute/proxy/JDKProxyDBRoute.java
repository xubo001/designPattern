package org.firewater.proxy.demodbroute.proxy;

import org.firewater.proxy.demodbroute.Animal;
import org.firewater.proxy.demodbroute.dynamicdatasource.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;

public class JDKProxyDBRoute implements InvocationHandler {
    private Object object;

    public Object getInstance(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object invoke = method.invoke(object, args);
        after();
        return invoke;
    }

    public void before(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //根据生日日期分库
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        Method getBirthDay = object.getClass().getMethod("getBirthday");
        String day = sdf.format(getBirthDay.invoke(object));
        DynamicDataSourceEntity.set(Integer.parseInt(day));
    }

    public void after() {
        DynamicDataSourceEntity.reset();
    }
}
