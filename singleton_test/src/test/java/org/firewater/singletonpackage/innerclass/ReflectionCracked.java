package org.firewater.singletonpackage.innerclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionCracked {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        InnerClassModel innerClassModel1=InnerClassModel.getInstance();
        //InnerClassModel innerClassModel2 = innerClassModel1.getClass().newInstance();私有构造函数不能拿类反射
        Constructor<InnerClassModel> constructor = (InnerClassModel.class).getDeclaredConstructor();
        constructor.setAccessible(true);
        InnerClassModel innerClassModel2 = constructor.newInstance();
        System.out.println(innerClassModel1);
        System.out.println(innerClassModel2);
        System.out.println(innerClassModel1==innerClassModel2);
    }
}
