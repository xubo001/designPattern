package org.firewater.decorator.decoratorv1;

public class PorkRibsNoodles extends Noodles {
    public String getMsg(){
        return super.getMsg()+"+1大排";
    }
    public int getPrice(){
        return super.getPrice()+6;
    }
}
