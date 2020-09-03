package org.firewater.decorator.decoratorv2;

public class PorkRibsNoodlesDecorator extends NoodlesDecorator {
    private Noodles noodles;
    public PorkRibsNoodlesDecorator(Noodles noodles){
        this.noodles=noodles;
    }
    public  String getMsg(){
        return noodles.getMsg()+"+1排骨";
    }
    public  int getPrice(){
        return noodles.getPrice()+6;
    }
}
