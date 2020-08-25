package org.firewater.singletonpackage.container;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ContainerSingetonTest {
    public static void main(String[] args) {
//        Object bean1 = ContainerSingeton.getBean("org.firewater.singletonpackage.container.Obj");
//        System.out.println(bean1);
//        Object bean2 = ContainerSingeton.getBean("org.firewater.singletonpackage.container.Obj");
//        System.out.println(bean2);


        List<FutureTask<Object>> taskList=new ArrayList<FutureTask<Object>>();
        Tester tester = new Tester();
        FutureTask<Object> futureTask;
        for(int i=0;i<10;i++) {
            futureTask=new FutureTask<Object>(tester);
            taskList.add(futureTask);
            new Thread(futureTask).start();
        }
        for(int i=0;i<10;i++) {
            try {
                futureTask=taskList.get(i);
                Object o = futureTask.get();
                System.out.println(o);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
