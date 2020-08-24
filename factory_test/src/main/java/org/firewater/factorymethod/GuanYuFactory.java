package org.firewater.factorymethod;

import org.firewater.common.ITellThreeKingdomPeople;
import org.firewater.common.TellGuanyuStory;

public class GuanYuFactory implements IFactoryMethodFactory {

    @Override
    public ITellThreeKingdomPeople createPeople() {
        return new TellGuanyuStory();
    }
}
