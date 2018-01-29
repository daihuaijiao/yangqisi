package com.yangqisi.pojo;

import java.util.Date;

public class Reply {
    private Integer rId;

    private Integer tId;

    private Date rTime;

    private String rIp;

    private String rUsername;

    private String rContent;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    public String getrIp() {
        return rIp;
    }

    public void setrIp(String rIp) {
        this.rIp = rIp == null ? null : rIp.trim();
    }

    public String getrUsername() {
        return rUsername;
    }

    public void setrUsername(String rUsername) {
        this.rUsername = rUsername == null ? null : rUsername.trim();
    }

    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent == null ? null : rContent.trim();
    }
}