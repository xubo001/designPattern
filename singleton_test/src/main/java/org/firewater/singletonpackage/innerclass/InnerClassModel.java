package org.firewater.singletonpackage.innerclass;

public class InnerClassModel {
    private InnerClassModel() {
        try {
            if (InnerClassInner.innerClassModel != null) {
                throw new Exception("已创建了类，不能对单例对象再创建对象");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static InnerClassModel getInstance(){
        return InnerClassInner.innerClassModel;
    }
    private static class InnerClassInner{
        private static final InnerClassModel innerClassModel=new InnerClassModel();
    }
}
