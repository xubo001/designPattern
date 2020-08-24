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


    public static ITellThreeKingdomPeople getInstance2(String className){
        if(className!=null&&!"".equals(className)) {
            try {
                ITellThreeKingdomPeople o = (ITellThreeKingdomPeople) Class.forName(className).newInstance();
                return o;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static ITellThreeKingdomPeople getInstance3(Class clazz){
        if(clazz!=null) {
            try {
                ITellThreeKingdomPeople o = (ITellThreeKingdomPeople) clazz.newInstance();
                return o;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
