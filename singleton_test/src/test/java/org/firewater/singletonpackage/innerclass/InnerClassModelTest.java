package org.firewater.singletonpackage.innerclass;

public class InnerClassModelTest {
    public static void main(String[] args) {
//        InnerClassModel innerClassModel1=InnerClassModel.getInstance();
//        InnerClassModel innerClassModel2=InnerClassModel.getInstance();
//        System.out.println("one====="+innerClassModel1);
//        System.out.println("one====="+innerClassModel2);
//        System.out.println(innerClassModel1==innerClassModel2);

        Thread thread1=new Thread(new ThreadTest());
        Thread thread2=new Thread(new ThreadTest());
        thread1.start();
        thread2.start();
    }
}
