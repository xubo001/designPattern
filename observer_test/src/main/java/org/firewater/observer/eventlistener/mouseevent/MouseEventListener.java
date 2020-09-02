package org.firewater.observer.eventlistener.mouseevent;

import org.firewater.observer.eventlistener.core.EventListener;

public class MouseEventListener extends EventListener {

    public void click() {
        System.out.println("this is   mouse click method");
        triger(EventType.ON_MOUSER_CLICK);
    }

    public void over()
    {
        System.out.println("this is  mouse over method");
        triger(EventType.ON_MOUSER_OVER);
    }

    public void up() {
        System.out.println("this is  mouse up method");
        triger(EventType.ON_MOUSER_UP);
    }

    public void down() {
        System.out.println("this is  mouse down method");
        triger(EventType.ON_MOUSER_DOWN);
    }

    public void doubleClick() {
        System.out.println("this is  mouse double click method");
        triger(EventType.ON_MOUSER_DOUBLE_CLICK);
    }

    public void wheel() {
        System.out.println("this is  mouse wheel method");
        triger(EventType.ON_MOUSER_WHEEL);
    }

    public void move() {
        System.out.println("this is  mouse move method");
        triger(EventType.ON_MOUSER_MOVE);
    }
}

