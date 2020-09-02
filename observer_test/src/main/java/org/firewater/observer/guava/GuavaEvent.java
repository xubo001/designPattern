package org.firewater.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    @Subscribe
    public void helloGuava(String name){
        System.out.println("hello "+name);
    }
}
