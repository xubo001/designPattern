package org.firewater.decorator.decoratorv2;

public class DecoratorTest2 {
    public static void main(String[] args) {
        NoodlesBase noodlesBase =new NoodlesBase();
        System.out.println(noodlesBase.getMsg());
        System.out.println(noodlesBase.getPrice());

        EggNoodlesDecorator eggNoodlesDecorator=new EggNoodlesDecorator(noodlesBase);
        System.out.println(eggNoodlesDecorator.getMsg());
        System.out.println(eggNoodlesDecorator.getPrice());

        eggNoodlesDecorator=new EggNoodlesDecorator(eggNoodlesDecorator);
        System.out.println(eggNoodlesDecorator.getMsg());
        System.out.println(eggNoodlesDecorator.getPrice());

        eggNoodlesDecorator=new EggNoodlesDecorator(eggNoodlesDecorator);
        System.out.println(eggNoodlesDecorator.getMsg());
        System.out.println(eggNoodlesDecorator.getPrice());

        PorkRibsNoodlesDecorator porkRibsNoodlesDecorator=new PorkRibsNoodlesDecorator(eggNoodlesDecorator);
        System.out.println(porkRibsNoodlesDecorator.getMsg());
        System.out.println(porkRibsNoodlesDecorator.getPrice());
    }
}
