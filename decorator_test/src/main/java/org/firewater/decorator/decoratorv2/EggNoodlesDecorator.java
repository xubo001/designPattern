package org.firewater.decorator.decoratorv2;

public class EggNoodlesDecorator extends NoodlesDecorator {
    private Noodles noodles;
    public EggNoodlesDecorator(Noodles noodles){
        this.noodles=noodles;
    }
    public  String getMsg(){
        return noodles.getMsg()+"+1鸡蛋";
    }
    public  int getPrice(){
        return noodles.getPrice()+2;
    }
}
