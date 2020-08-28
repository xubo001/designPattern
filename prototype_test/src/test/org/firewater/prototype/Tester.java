package org.firewater.prototype;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        String[] test =new String[]{"111","222","333"};
        String[] copy=new String[10];
//        System.arraycopy(test,0,copy,0,test.length);
//        System.out.println(test[0]==copy[0]);

        copy=Arrays.copyOf(test,test.length);
        System.out.println(test[0]==copy[0]);

    }
}
