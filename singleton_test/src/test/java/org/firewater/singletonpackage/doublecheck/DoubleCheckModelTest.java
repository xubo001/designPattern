package org.firewater.singletonpackage.doublecheck;

import org.firewater.singletonpackage.hungery.HungeryModel1;
import org.firewater.singletonpackage.hungery.HungeryModel2;
import org.firewater.singletonpackage.hungery.ThreadTest;

public class DoubleCheckModelTest {
    public static void main(String[] args) {
//        DoubleCheckModel doubleCheckModel1=DoubleCheckModel.getInstance();
//        DoubleCheckModel doubleCheckModel2=DoubleCheckModel.getInstance();
//        System.out.println("one====="+doubleCheckModel1);
//        System.out.println("one====="+doubleCheckModel2);
//        System.out.println(doubleCheckModel1==doubleCheckModel2);

        Thread thread1=new Thread(new ThreadTest());
        Thread thread2=new Thread(new ThreadTest());
        thread1.start();
        thread2.start();
    }
}
