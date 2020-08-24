package org.firewater.singletonpackage.lazy;

import org.firewater.singletonpackage.hungery.HungeryModel2;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        LazyModel lazyModel=LazyModel.getInstance();
        System.out.println(lazyModel);
    }
}
