package org.firewater.simplefactory;

/*
起始类  三种模式
（1）、使用分隔区间的字符串判断
（2）、使用类名称判断
（3）、直接使用类进行传参
* */
public class TellStoryMain {
    public static void main(String[] args) {

        //使用分隔区间的字符串判断
        ITellThreeKingdomPeople guanYu1 = ThreeKingdomPeopleFactory.getInstance("GuanYu");
        guanYu1.story();

        ITellThreeKingdomPeople zhangFei1 = ThreeKingdomPeopleFactory.getInstance("ZhangFei");
        zhangFei1.story();


        //使用类名称判断
        ITellThreeKingdomPeople guanYu2 = ThreeKingdomPeopleFactory.getInstance2("org.firewater.simplefactory.TellGuanyuStory");
        guanYu2.story();

        ITellThreeKingdomPeople zhangFei2 = ThreeKingdomPeopleFactory.getInstance2("org.firewater.simplefactory.TellZhangfeiStory");
        zhangFei2.story();

        //使用类进行传参
        ITellThreeKingdomPeople guanYu3 = ThreeKingdomPeopleFactory.getInstance3(TellGuanyuStory.class);
        guanYu2.story();

        ITellThreeKingdomPeople zhangFei3 = ThreeKingdomPeopleFactory.getInstance3(TellZhangfeiStory.class);
        zhangFei2.story();


    }
}
