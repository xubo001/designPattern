package org.firewater.decorator.classextension;

public class PeopleTest {
    public static void main(String[] args) {
        IPeopleDecorator peopleDecorator=new PeopleDecorator(new People());
        peopleDecorator.fly();
        peopleDecorator.jump();
        peopleDecorator.go();
        peopleDecorator.run();
    }
}
