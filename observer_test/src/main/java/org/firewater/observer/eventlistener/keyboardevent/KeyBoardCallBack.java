package org.firewater.observer.eventlistener.keyboardevent;

import org.firewater.observer.eventlistener.core.Event;

public class KeyBoardCallBack  {
    public void onKeyDown(Event e){
        System.out.println("this is triger keyboard down"+ e);
    }
    public void onKeyUp(Event e){
        System.out.println("this is triger keyboard up"+e);
    }
    public void onKeyPress(Event e){
        System.out.println("this is triger keyboard press"+e);
    }

}
