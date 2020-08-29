package org.firewater.proxy.demodbroute;
//测试类，这个不用看
public class IAnimalSrviceProxy implements  IAnimalSerice {
    private IAnimalSerice iAnimalSerice;
    public IAnimalSrviceProxy(IAnimalSerice iAnimalSerice){
        this.iAnimalSerice=iAnimalSerice;
    }



    public int createAnimal(Animal animal) {
        before();
        int animal1 = iAnimalSerice.createAnimal(animal);
        return animal1;
    }

    public void before(){
        System.out.println("JDK课前备课");
    }
    public void after(){
        System.out.println("JDK布置作业");
    }
}
