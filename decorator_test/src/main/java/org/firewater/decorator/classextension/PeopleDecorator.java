package org.firewater.decorator.classextension;

public class PeopleDecorator implements IPeopleDecorator {
    private IPeople people;

    public PeopleDecorator(IPeople people) {
        this.people = people;
    }

    @Override
    public void jump() {
        System.out.println("people jump!");
    }

    @Override
    public void fly() {
        System.out.println("people fly!");
    }

    @Override
    public void go() {
        people.go();
    }

    @Override
    public void run() {
        people.run();
    }
}
