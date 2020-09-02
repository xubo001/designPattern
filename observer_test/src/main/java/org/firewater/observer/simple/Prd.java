package org.firewater.observer.simple;

import java.text.SimpleDateFormat;
import java.util.Observable;

public class Prd extends Observable {
    public final static String name="生产环境";
    private static Prd prd;
    private Prd(){}
    public static Prd getInstance(){
        if(prd==null)
        {
            return new Prd();
        }
        return null;
    }
    public void publishProblem(PrdEvent prdEvent){
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(prdEvent.getCreateDate());
        System.out.println(date+":"+prdEvent.getSysName()+"系统"+prdEvent.getEventDes());
        setChanged();
        notifyObservers(prdEvent);
    }

}
