package org.firewater.singletonpackage.doublecheck;


public class ThreadTest implements Runnable {
    @Override
    public void run() {
        DoubleCheckModel doubleCheckModel=DoubleCheckModel.getInstance();
        System.out.println(doubleCheckModel);
    }
}
