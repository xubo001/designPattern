package org.firewater.observer.eventlistener;

import org.firewater.observer.eventlistener.keyboardevent.KeyBoardCallBack;
import org.firewater.observer.eventlistener.keyboardevent.KeyBoardEventListener;
import org.firewater.observer.eventlistener.mouseevent.EventType;
import org.firewater.observer.eventlistener.mouseevent.MouseCallBack;
import org.firewater.observer.eventlistener.mouseevent.MouseEventListener;

public class EventListenerTest {
    public static void main(String[] args) {
        MouseEventListener mouseEventListener = new MouseEventListener();
        mouseEventListener.AddListener(EventType.ON_MOUSER_CLICK, new MouseCallBack());
        mouseEventListener.click();

        KeyBoardEventListener keyBoardEventListener=new KeyBoardEventListener();
        keyBoardEventListener.AddListener(org.firewater.observer.eventlistener.keyboardevent.EventType.ON_KEY_PRESS,new KeyBoardCallBack());
        keyBoardEventListener.press();
    }
}
