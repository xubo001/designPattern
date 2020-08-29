package org.firewater.proxy.demodbroute;

public class AnimalDao {
    public int createAnimal(Animal animal){
        System.out.println("insert into db");
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getBirthday());
        return 1;
    }
}
