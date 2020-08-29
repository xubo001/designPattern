package org.firewater.proxy.staticproxy;

public class Teacher implements Person {
    private Person person;

    public Teacher(Person person) {
        this.person = person;
    }


    @Override
    public void study() {
        before();
        person.study();
        after();
    }


    public void before(){
        System.out.println("课前备课");
    }
    public void after(){
        System.out.println("布置作业");
    }
}
