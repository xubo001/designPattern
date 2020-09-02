package org.firewater.observer.simple;

import java.util.Date;

public class ObserverTest {
    public static void main(String[] args) {
        Developer developer1=new Developer("fire classmate");
        Developer developer2=new Developer("water classmate");
        Manager manager1=new Manager("Jack ma");
        Manager manager2=new Manager("Peter ma");

        Prd prd=Prd.getInstance();
        PrdEvent prdEvent=new PrdEvent("wrong num too many","Customer System","Error:Not enough Space",new Date());
        prd.addObserver(developer1);
        prd.addObserver(developer2);
        prd.addObserver(manager1);
        prd.addObserver(manager2);
        prd.publishProblem(prdEvent);
    }
}
