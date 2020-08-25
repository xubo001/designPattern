package org.firewater.singletonpackage.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingeton {
    private ContainerSingeton(){}
    private static Map<String,Object> map=new ConcurrentHashMap<String ,Object>();
    public  static Object getBean(String beanName){
        synchronized (map) {
            if (!map.containsKey(beanName)) {
                //这里只是举例，别联想到其他框架
                try {
                    Object obj = Class.forName(beanName).newInstance();
                    map.put(beanName, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return map.get(beanName);
        }
    }
}
