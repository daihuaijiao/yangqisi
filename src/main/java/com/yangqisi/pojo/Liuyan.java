package com.yangqisi.pojo;

import java.util.Date;

public class Liuyan {
    private Integer id;

    private String username;

    private String face;

    private String qq;

    private String home;

    private String email;

    private String title;

    private String content;

    private String pic;

    private String ip;

    private Date time;

    private String occation;

    private String laccess;

    private String head;

    private String bid;

    private Byte shenhe;

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

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOccation() {
        return occation;
    }

    public void setOccation(String occation) {
        this.occation = occation == null ? null : occation.trim();
    }

    public String getLaccess() {
        return laccess;
    }

    public void setLaccess(String laccess) {
        this.laccess = laccess == null ? null : laccess.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public Byte getShenhe() {
        return shenhe;
    }

    public void setShenhe(Byte shenhe) {
        this.shenhe = shenhe;
    }
}