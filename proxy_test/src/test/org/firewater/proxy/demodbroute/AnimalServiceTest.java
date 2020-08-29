package org.firewater.proxy.demodbroute;


import org.firewater.proxy.demodbroute.proxy.StaticProxyDBRoute;

import java.util.Date;


public class AnimalServiceTest {

    public static void main(String[] args) {
//        AnimalService animalService =new AnimalService();
//        Animal animal =new Animal() ;
//        animal.setName("bird");
//        animal.setAge(1);
//        animal.setBirthday(new Date());
//        animalService.createAnimal(animal);


        Animal animal = new Animal("bird", 1, new Date());
        IAnimalSerice iAnimalSerice = new StaticProxyDBRoute(new AnimalService());
        iAnimalSerice.createAnimal(animal);

    }
}