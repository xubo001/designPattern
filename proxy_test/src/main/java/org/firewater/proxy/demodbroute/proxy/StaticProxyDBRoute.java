package org.firewater.proxy.demodbroute.proxy;

import org.firewater.proxy.demodbroute.Animal;
import org.firewater.proxy.demodbroute.IAnimalSerice;
import org.firewater.proxy.demodbroute.dynamicdatasource.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;

/*静态代理  数据源切换的大致流程，数据源是假的，仅做测试*/
public class StaticProxyDBRoute implements IAnimalSerice {
    private IAnimalSerice iAnimalSerice;
    public StaticProxyDBRoute(IAnimalSerice iAnimalSerice){
        this.iAnimalSerice=iAnimalSerice;
    }

    public int createAnimal(Animal animal) {
        //根据生日日期分库
        SimpleDateFormat sdf =new SimpleDateFormat("dd");
        String day=sdf.format(animal.getBirthday());
        if(day!=null) {
            DynamicDataSourceEntity.set(Integer.parseInt(day));
            int count = iAnimalSerice.createAnimal(animal);
            System.out.println("操作了"+count+"条");
            return count;
        }
        return 0;
    }


}
