package org.firewater.observer.simple;

import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;

public class Manager implements Observer {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Prd prd= (Prd) o;
        PrdEvent prdEvent= (PrdEvent) arg;
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(prdEvent.getCreateDate());
        System.out.println(this.name+"：您好");
        System.out.println(date+":"+prdEvent.getSysName()+"在"+Prd.name+"环境上发生了重大事件");
        System.out.println("请立即处理！");
    }
}
