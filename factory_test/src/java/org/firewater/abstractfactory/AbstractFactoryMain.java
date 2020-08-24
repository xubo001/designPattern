package org.firewater.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        GuanYuFactory guanYuFactory=new GuanYuFactory();
        IWeapon weapon = guanYuFactory.weapon();
        IClothes clothes = guanYuFactory.clothes();
        weapon.desc();
        clothes.desc();


        ZhangFeiFactory zhangFeiFactory=new ZhangFeiFactory();
        IWeapon weapon1 = zhangFeiFactory.weapon();
        IClothes clothes1 = zhangFeiFactory.clothes();
        weapon1.desc();
        clothes1.desc();
    }
}
