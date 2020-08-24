package org.firewater.singletonpackage.innerclass;

public class InnerClassModel {
    private InnerClassModel(){}
    public static InnerClassModel getInstance(){
        return InnerClassInner.innerClassModel;
    }
    private static class InnerClassInner{
        private static final InnerClassModel innerClassModel=new InnerClassModel();
    }
}
