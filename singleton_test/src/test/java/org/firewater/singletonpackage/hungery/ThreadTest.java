package org.firewater.singletonpackage.hungery;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        HungeryModel2 hungeryModel1=HungeryModel2.getInstance();
        System.out.println(hungeryModel1);
    }
}
