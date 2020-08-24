package org.firewater.factorymethod;

import org.firewater.common.ITellThreeKingdomPeople;

public class FactoryMethodMain {
    public static void main(String[] args) {
        GuanYuFactory guanYuFactory= new GuanYuFactory();
        ITellThreeKingdomPeople guanYu=  guanYuFactory.createPeople();
        guanYu.story();

        ZhangFeiFactory zhangFeiFactory=new ZhangFeiFactory();
        ITellThreeKingdomPeople zhangFei=  zhangFeiFactory.createPeople();
        zhangFei.story();

        ZhaoYunFactory zhaoYunFactory=new ZhaoYunFactory();
        ITellThreeKingdomPeople zhaoYun=  zhaoYunFactory.createPeople();
        zhaoYun.story();

    }
}
