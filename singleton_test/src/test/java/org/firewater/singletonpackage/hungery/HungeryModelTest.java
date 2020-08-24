package org.firewater.singletonpackage.hungery;

public class HungeryModelTest {
    public static void main(String[] args) {
        HungeryModel1 hungeryModel1=HungeryModel1.getInstance();
        HungeryModel1 hungeryModel2=HungeryModel1.getInstance();
        System.out.println("one====="+hungeryModel1);
        System.out.println("one====="+hungeryModel2);
        System.out.println(hungeryModel1==hungeryModel2);


        HungeryModel2 hungeryModel3=HungeryModel2.getInstance();
        HungeryModel2 hungeryModel4=HungeryModel2.getInstance();
        System.out.println("two====="+hungeryModel3);
        System.out.println("two====="+hungeryModel4);
        System.out.println(hungeryModel3==hungeryModel4);


        Thread thread1 = new Thread(new ThreadTest());
        Thread thread2 = new Thread(new ThreadTest());
        thread1.start();
        thread2.start();
    }
}
