package org.firewater.observer.eventlistener.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EventListener {
    protected Map<String ,Event> eventMap=new HashMap<String,Event>();

    public  void AddListener(String eventType,Object targetElement){
        try {
            this.AddListener(eventType,targetElement,targetElement.getClass().getMethod("on"+getUpperCaseMethodName(eventType),Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private void AddListener(String  eventType,Object targetElement, Method method){
        eventMap.put(eventType,new Event(targetElement,method));
    }
    private void triger(Event event){
        try {
            event.setSrcElement(this);
            event.setHappenTime(new Date());
            Method callBack = event.getCallBack();
            if(callBack!=null) {
                callBack.invoke(event.getTargetElement(), event);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    public void triger(String trigerName) {
        if(!this.eventMap.containsKey(trigerName)){return;}
        Event event = this.eventMap.get(trigerName);
        event.setTriger(trigerName);
        triger(event);
    }


    private String getUpperCaseMethodName(String name) {
        return name.substring(0,1).toUpperCase()+name.substring(1);
    }

}
