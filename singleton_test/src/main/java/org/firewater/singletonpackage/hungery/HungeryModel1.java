package org.firewater.singletonpackage.hungery;


public class HungeryModel1 {
    private HungeryModel1() {};
    private static HungeryModel1 hungeryModel1 = new HungeryModel1();
    public static HungeryModel1 getInstance(){
        return hungeryModel1;
    }
}
