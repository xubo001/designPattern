package org.firewater.decorator.decoratorv2;

public  abstract  class NoodlesDecorator extends  NoodlesBase{
    private Noodles noodles;

    public NoodlesDecorator(Noodles noodles) {
        this.noodles = noodles;
    }

    public  String getMsg(){
        return noodles.getMsg();
    }
    public  int getPrice(){
        return noodles.getPrice();
    }
}
