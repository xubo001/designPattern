package org.firewater.factorymethod;

import org.firewater.common.ITellThreeKingdomPeople;
import org.firewater.common.TellZhangfeiStory;

public class ZhangFeiFactory implements  IFactoryMethodFactory{
    @Override
    public ITellThreeKingdomPeople createPeople() {
        return new TellZhangfeiStory();
    }
}
