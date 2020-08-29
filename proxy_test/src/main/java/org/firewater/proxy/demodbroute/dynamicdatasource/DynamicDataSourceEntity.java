package org.firewater.proxy.demodbroute.dynamicdatasource;

public class DynamicDataSourceEntity {
    private static ThreadLocal<String> local=new ThreadLocal<String>();
    private final  static String default_dbNo="db_01";
    private  DynamicDataSourceEntity(){}

    public static void get(){
        local.get();
    }
    public static void set(String dbroute){
        local.set(dbroute);
    }
    public static void set(int dbNo){
        local.set("DB_"+dbNo);
        System.out.println("DB_"+dbNo+"库");
    }

    public static void reset(){
        local.set(default_dbNo);
    }

}
