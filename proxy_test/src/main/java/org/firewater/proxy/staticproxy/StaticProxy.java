package org.firewater.proxy.staticproxy;

public class StaticProxy {
    public  void studentStudy(){
        Teacher teacher =new Teacher(new Student());
        teacher.study();
    }
}
