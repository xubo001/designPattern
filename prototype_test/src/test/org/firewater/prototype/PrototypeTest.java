package org.firewater.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("starter1");
        list.add("starter2");


        ProjectCode projectCode=new ProjectCode("干净的boot工程",13,list);
        ProtoType protoType=new ProtoType(projectCode);
        //深克隆
        ProjectCode copy = protoType.getInstance(true);
        System.out.println("projectCode===="+projectCode);
        System.out.println("copy===="+copy);


        System.out.println(projectCode.getProjectName());
        System.out.println(copy.getProjectName());
        System.out.println(projectCode.getProjectName()==copy.getProjectName());



        System.out.println(projectCode.getList());
        System.out.println(copy.getList());
        System.out.println(projectCode.getList()==copy.getList());


        System.out.println(projectCode.getList().get(0));
        System.out.println(copy.getList().get(0));
        System.out.println(projectCode.getList().get(0)==copy.getList().get(0));



    }
}
