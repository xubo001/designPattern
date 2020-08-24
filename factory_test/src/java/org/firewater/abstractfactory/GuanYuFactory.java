package org.firewater.abstractfactory;

public class GuanYuFactory implements IAbstactFactory {
    @Override
    public IWeapon weapon() {
        return new GuanYuWeapon();
    }

    @Override
    public IClothes clothes() {
        return new GuanYuClothes();
    }
}
