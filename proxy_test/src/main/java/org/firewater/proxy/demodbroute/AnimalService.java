package org.firewater.proxy.demodbroute;

public class AnimalService implements IAnimalSerice {
    public AnimalDao animalDao;
    public int createAnimal(Animal animal){
        animalDao =new AnimalDao();
        int count = animalDao.createAnimal(animal);
        return count;
    }
}
