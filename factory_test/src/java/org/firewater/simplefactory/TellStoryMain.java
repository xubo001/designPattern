package org.firewater.simplefactory;

public class TellStoryMain {
    public static void main(String[] args) {
        ITellThreeKingdomPeople guanYu=ThreeKingdomPeopleFactory.getInstance("GuanYu");
        guanYu.story();


        ITellThreeKingdomPeople zhangFei=ThreeKingdomPeopleFactory.getInstance("ZhangFei");
        zhangFei.story();
    }
}
