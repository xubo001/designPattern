package org.firewater.observer.eventlistener.mouseevent;

import org.firewater.observer.eventlistener.core.Event;

public class MouseCallBack {
    public  void onMouseOver(Event e){
        System.out.println("this is  triger mouse over method"+e);
    };
    public  void onMouseUp(Event e){
        System.out.println("this is triger mouse up method"+e);
    };
    public  void onMouseDown(Event e){
        System.out.println("this is triger mouse down method"+e);
    };
    public  void onMouseMove(Event e){
        System.out.println("this is triger mouse move method"+e);
    };
    public  void onMouseClick(Event e){
        System.out.println("this is triger  mouse click method"+e);
    };
    public  void onMouseWheel(Event e){
        System.out.println("this is triger mouse wheel method"+e);
    };
    public  void onMouseDoubleClick(Event e){
        System.out.println("this is triger mouse double click method"+e);
    };
}
