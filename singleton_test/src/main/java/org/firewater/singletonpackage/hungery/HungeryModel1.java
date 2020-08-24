package org.firewater.singletonpackage.hungery;


import java.io.Serializable;

public class HungeryModel1 //implements Serializable
{
    private HungeryModel1() {
    };
    private static HungeryModel1 hungeryModel1 = new HungeryModel1();

    public static HungeryModel1 getInstance() {
        return hungeryModel1;
    }

//    private Object  readResolve() {
//        return hungeryModel1;
//    }
}
