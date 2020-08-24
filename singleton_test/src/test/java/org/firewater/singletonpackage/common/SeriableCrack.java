package org.firewater.singletonpackage.common;

import org.firewater.singletonpackage.hungery.HungeryModel1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableCrack {
    public static void main(String[] args) {
        HungeryModel1 HungeryModel11=HungeryModel1.getInstance();
        HungeryModel1 HungeryModel12;
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("HungeryModel1.obj");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(HungeryModel11);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream=new FileInputStream("HungeryModel1.obj");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            HungeryModel12=(HungeryModel1)objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(HungeryModel11);
            System.out.println(HungeryModel12);
            System.out.println(HungeryModel11 == HungeryModel12);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
