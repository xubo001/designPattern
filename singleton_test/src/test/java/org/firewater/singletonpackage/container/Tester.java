package org.firewater.singletonpackage.container;

import java.util.concurrent.Callable;

public class Tester implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        Object bean = ContainerSingeton.getBean("org.firewater.singletonpackage.container.Obj");
        System.out.println(Thread.currentThread().getName()+"||"+System.currentTimeMillis());
       return  bean;
    }
}
