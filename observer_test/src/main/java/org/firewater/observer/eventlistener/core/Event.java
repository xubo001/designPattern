package org.firewater.observer.eventlistener.core;

import java.lang.reflect.Method;
import java.util.Date;

public class Event {
    private Object srcElement;
    private Object targetElement;
    private String triger;
    private Method  callBack;
    private Date happenTime;


    public Event(Object targetElement, Method callBack) {
        this.targetElement = targetElement;
        this.callBack = callBack;
    }

    public Object getSrcElement() {
        return srcElement;
    }

    public void setSrcElement(Object srcElement) {
        this.srcElement = srcElement;
    }

    public Object getTargetElement() {
        return targetElement;
    }

    public void setTargetElement(Object targetElement) {
        this.targetElement = targetElement;
    }

    public String getTriger() {
        return triger;
    }

    public void setTriger(String triger) {
        this.triger = triger;
    }

    public Method getCallBack() {
        return callBack;
    }

    public void setCallBack(Method callBack) {
        this.callBack = callBack;
    }

    public Date getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Date happenTime) {
        this.happenTime = happenTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "srcElement=" + srcElement +
                ", targetElement=" + targetElement +
                ", triger='" + triger + '\'' +
                ", callBack=" + callBack +
                ", happenTime=" + happenTime +
                '}';
    }
}
