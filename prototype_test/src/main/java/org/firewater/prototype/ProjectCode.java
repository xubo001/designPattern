package org.firewater.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*一堆初始化的工程    用类来定义*/
public class ProjectCode implements Cloneable, Serializable {

    //工程名
    private String projectName;
    //文件数量
    private int   fileNum;
    //引用的文件列表
    private List<String> list ;
    //深浅克隆标志
    private boolean deepFlag;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getFileNum() {
        return fileNum;
    }

    public void setFileNum(int fileNum) {
        this.fileNum = fileNum;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public boolean isDeepFlag() {
        return deepFlag;
    }

    public void setDeepFlag(boolean deepFlag) {
        this.deepFlag = deepFlag;
    }

    public ProjectCode(){

    }
    public ProjectCode(String projectName, int fileNum, List<String> list) {
        this.projectName = projectName;
        this.fileNum = fileNum;
        this.list = list;
    }

    public ProjectCode clone(){
        return deepFlag?deepClone():shallowClone();
    }
    //这个方法没有完全实现克隆，只克隆到list层级
//    private ProjectCode deepClone(){
//        ProjectCode copy = null;
//        try {
//            copy=(ProjectCode) super.clone();
//            copy.setProjectName(new String(this.projectName));
//            copy.setFileNum(this.fileNum);
//            ArrayList<String> list = (ArrayList<String>) copy.getList();
//            copy.setList((List<String>) list.clone());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return copy;
//    }

    private  ProjectCode deepClone(){
        ProjectCode copy = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
            try {
                copy= (ProjectCode) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return copy;
    }



    private ProjectCode shallowClone(){
        try {//JDK默认的是一种浅克隆
            return (ProjectCode) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
