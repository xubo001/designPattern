package org.firewater.singletonpackage.enumsingeton;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSeriableTest {
    public static void main(String[] args) {
        EnumSingeton EnumSingeton1=EnumSingeton.SINGETONINSTANCE.getInstance();
        EnumSingeton EnumSingeton2;
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("EnumSingeton.obj");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(EnumSingeton1);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream=new FileInputStream("EnumSingeton.obj");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            EnumSingeton2=(EnumSingeton)objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(EnumSingeton1);
            System.out.println(EnumSingeton2);
            System.out.println(EnumSingeton1 == EnumSingeton2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
