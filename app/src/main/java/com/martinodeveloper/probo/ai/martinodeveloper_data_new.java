package com.martinodeveloper.probo.ai;

public class martinodeveloper_data_new {

    public String appName;
    public String value,value2,value3,value4,value5,value6;
    public String appLink;
    public martinodeveloper_data_new(String name, String full, String appLink) {
        this.appName=name;
        this.value=full;
        this.appLink = appLink;
    }
    public martinodeveloper_data_new(){

    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAppLink() {
        return appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }



}