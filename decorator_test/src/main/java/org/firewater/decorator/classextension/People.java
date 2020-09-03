package org.firewater.decorator.classextension;

public class People implements IPeople {
    @Override
    public void go() {
        System.out.println("people go!");
    }

    @Override
    public void run() {
        System.out.println("people run!");
    }
}
