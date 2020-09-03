package org.firewater.decorator.decoratorv1;

public class EggNoodles extends  Noodles {
    public String getMsg(){
        return super.getMsg()+"+1鸡蛋";
    }
    public int getPrice(){
        return super.getPrice()+2;
    }
}
