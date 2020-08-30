package org.firewater.proxy.demodbroute;

import org.firewater.proxy.demodbroute.Animal;
import org.firewater.proxy.demodbroute.AnimalService;
import org.firewater.proxy.demodbroute.proxy.JDKProxyDBRoute;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class JDKProxyAnimalServiceTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Animal animal = new Animal("bird", 1, new Date());
        JDKProxyDBRoute jdkProxyDBRoute = new JDKProxyDBRoute();
        /*——————————————————————————————————————————————————————————————*/
//        Object instance = jdkProxyDBRoute.getInstance(new AnimalService());
//        Method createAnimal = instance.getClass().getMethod("createAnimal", Animal.class);
//        Object invoke = createAnimal.invoke(instance, animal);
        /*——————————————————————————————————————————————————————————————*/
        IAnimalSerice instance =(IAnimalSerice) jdkProxyDBRoute.getInstance(new AnimalService());
        int count = instance.createAnimal(animal);
        System.out.println("操作了" + count + "条");
    }
}
