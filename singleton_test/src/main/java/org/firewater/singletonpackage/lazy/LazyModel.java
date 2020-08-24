package org.firewater.singletonpackage.lazy;

public class LazyModel {
    private LazyModel(){};
    private static LazyModel lazyModel=null;
    public static LazyModel getInstance(){
        if(lazyModel==null){
            lazyModel=new LazyModel();
        }
        return lazyModel;
    }
}
