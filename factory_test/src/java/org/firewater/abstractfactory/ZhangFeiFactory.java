package org.firewater.abstractfactory;

public class ZhangFeiFactory implements IAbstactFactory {
    @Override
    public IWeapon weapon() {
        return new ZhangFeiWeapon();
    }

    @Override
    public IClothes clothes() {
        return new ZhangFeiClothes();
    }
}
