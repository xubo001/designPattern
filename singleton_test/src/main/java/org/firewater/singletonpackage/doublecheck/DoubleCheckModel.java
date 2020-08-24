package org.firewater.singletonpackage.doublecheck;

public class DoubleCheckModel {
    private DoubleCheckModel(){};
    private static DoubleCheckModel doubleCheckModel=null;
    public static DoubleCheckModel getInstance(){
        if(doubleCheckModel==null){
            synchronized (DoubleCheckModel.class) {
                if(doubleCheckModel==null)
                    doubleCheckModel = new DoubleCheckModel();
            }
        }
        return doubleCheckModel;
    }
}
