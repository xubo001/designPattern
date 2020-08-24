package org.firewater.singletonpackage.enumsingeton;

public class EnumSingetonTest {
    public static void main(String[] args) {
        EnumSingeton enumSingeton1=EnumSingeton.SINGETONINSTANCE.getInstance();
        System.out.println(enumSingeton1);
        EnumSingeton enumSingeton2=EnumSingeton.SINGETONINSTANCE.getInstance();
        System.out.println(enumSingeton2);
        System.out.println(enumSingeton1==enumSingeton2);
    }
}
