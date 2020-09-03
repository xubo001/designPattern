package org.firewater.decorator.decoratorv1;

public class DecoratorTest {
    public static void main(String[] args) {
        Noodles noodles=new Noodles();
        System.out.println(noodles.getMsg());
        System.out.println(noodles.getPrice());


        Noodles noodles1=new EggNoodles();
        System.out.println(noodles1.getMsg());
        System.out.println(noodles1.getPrice());


        Noodles noodles2=new PorkRibsNoodles();
        System.out.println(noodles2.getMsg());
        System.out.println(noodles2.getPrice());

    }
}
