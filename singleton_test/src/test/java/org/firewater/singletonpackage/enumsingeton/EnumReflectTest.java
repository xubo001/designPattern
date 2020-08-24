package org.firewater.singletonpackage.enumsingeton;

import java.lang.reflect.Constructor;

public class EnumReflectTest {
    public static void main(String[] args)  {
        try {
            EnumSingeton instance1 = EnumSingeton.SINGETONINSTANCE.getInstance();
           //  EnumSingeton instance2 = EnumSingeton.SINGETONINSTANCE.getClass().newInstance();会报错
            Constructor<EnumSingeton> constructor = (EnumSingeton.class).getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);
            EnumSingeton instance2 = constructor.newInstance("测试",888);
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1 == instance2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
