package org.firewater.singletonpackage.hungery;


public class HungeryModel2 {
    private HungeryModel2() {};
    private static HungeryModel2 hungeryModel2 =null;
    static{
        hungeryModel2=new HungeryModel2();
    }
    public static HungeryModel2 getInstance(){
        return hungeryModel2;
    }
}
