package org.firewater.singletonpackage.innerclass;

import org.firewater.singletonpackage.lazy.LazyModel;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        InnerClassModel innerClassModel=InnerClassModel.getInstance();
        System.out.println(innerClassModel);
    }
}
