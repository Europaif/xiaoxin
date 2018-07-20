package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sms")
public class Bookbean {

    private  String url ="";
    private  String appkey ="";
    private  String secret ="";
    private  String signName ="";
    private  String tplCode ="";
    private  String type ="";
    private  String open ="";
    private  String tplCode2 ="";

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getAppkey() {
        return appkey;
    }
    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }
    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }
    public String getSignName() {
        return signName;
    }
    public void setSignName(String signName) {
        this.signName = signName;
    }
    public String getTplCode() {
        return tplCode;
    }
    public void setTplCode(String tplCode) {
        this.tplCode = tplCode;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getOpen() {
        return open;
    }
    public void setOpen(String open) {
        this.open = open;
    }
    public String getTplCode2() {
        return tplCode2;
    }
    public void setTplCode2(String tplCode2) {
        this.tplCode2 = tplCode2;
    }

}