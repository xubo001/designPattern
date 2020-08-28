package org.firewater.prototype;

public class ProtoType {
    private ProjectCode projectCode;

    public ProtoType(ProjectCode projectCode) {
        this.projectCode = projectCode;
    }

    public ProjectCode getInstance(boolean  deepFlag){
        projectCode.setDeepFlag(deepFlag);
        ProjectCode copy=projectCode.clone();
        return copy;
    }
}
