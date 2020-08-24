package org.firewater.factorymethod;

import org.firewater.common.ITellThreeKingdomPeople;
import org.firewater.common.TellZhaoYunStory;

public class ZhaoYunFactory implements  IFactoryMethodFactory{
    @Override
    public ITellThreeKingdomPeople createPeople() {
        return new TellZhaoYunStory();
    }
}
