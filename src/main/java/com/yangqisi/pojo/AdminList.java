package com.yangqisi.pojo;

import java.util.Date;

public class AdminList {
    private Integer id;

    private String username;

    private Integer userclass;

    private String lastloginip;

    private Date lastlogintime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUserclass() {
        return userclass;
    }

    public void setUserclass(Integer userclass) {
        this.userclass = userclass;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }
}