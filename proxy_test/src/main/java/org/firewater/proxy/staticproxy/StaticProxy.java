package org.firewater.proxy.staticproxy;

import org.firewater.proxy.common.Student;
import org.firewater.proxy.common.Teacher;

public class StaticProxy {
    public  void studentStudy(){
        Teacher teacher =new Teacher(new Student());
        teacher.study();
    }
}
