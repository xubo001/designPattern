package org.firewater.singletonpackage.enumsingeton;

public enum EnumSingeton {
    SINGETONINSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public EnumSingeton getInstance(){
        return SINGETONINSTANCE;
    }
}
