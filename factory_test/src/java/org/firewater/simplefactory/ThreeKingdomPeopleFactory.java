package org.firewater.simplefactory;

public class ThreeKingdomPeopleFactory {
    public static ITellThreeKingdomPeople getInstance(String name){
        if("GuanYu".equals(name)){
            return new TellGuanyuStory();
        }
        if("ZhangFei".equals(name)){
            return new TellZhangfeiStory();
        }
        return null;
    }

}
