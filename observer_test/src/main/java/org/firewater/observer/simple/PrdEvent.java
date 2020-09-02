package org.firewater.observer.simple;

import java.util.Date;

public class PrdEvent {
    private String name;
    private String sysName;
    private String EventDes;
    private Date createDate;

    public PrdEvent(String name, String sysName, String eventDes, Date createDate) {
        this.name = name;
        this.sysName = sysName;
        EventDes = eventDes;
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getEventDes() {
        return EventDes;
    }

    public void setEventDes(String eventDes) {
        EventDes = eventDes;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
