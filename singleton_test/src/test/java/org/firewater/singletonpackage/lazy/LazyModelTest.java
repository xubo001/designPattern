package org.firewater.singletonpackage.lazy;

public class LazyModelTest {
    public static void main(String[] args) {


//        LazyModel lazyModel1=LazyModel.getInstance();
//        LazyModel lazyModel2=LazyModel.getInstance();
//        System.out.println("one====="+lazyModel1);
//        System.out.println("one====="+lazyModel2);
//        System.out.println(lazyModel1==lazyModel2);

        Thread thread1=new Thread(new ThreadTest());
        Thread thread2=new Thread(new ThreadTest());
        thread1.start();
        thread2.start();


    }
}
