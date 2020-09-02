package org.firewater.observer.eventlistener.keyboardevent;

import org.firewater.observer.eventlistener.core.EventListener;

public class KeyBoardEventListener extends EventListener {
    public void up(){
        System.out.println("this is keyboard keyup");
        triger(EventType.ON_KEY_UP);
    }
    public void down(){
        System.out.println("this is keyboard keydown");
        triger(EventType.ON_KEY_DOWN);
    }
    public void press(){
        System.out.println("this is keyboard keypress");
        triger(EventType.ON_KEY_PRESS);
    }

}
