package com.yangqisi.pojo;

public class Aboutus {
    private Integer id;

    private String jianjie;

    private String wenhua;

    private String lianxi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie == null ? null : jianjie.trim();
    }

    public String getWenhua() {
        return wenhua;
    }

    public void setWenhua(String wenhua) {
        this.wenhua = wenhua == null ? null : wenhua.trim();
    }

    public String getLianxi() {
        return lianxi;
    }

    public void setLianxi(String lianxi) {
        this.lianxi = lianxi == null ? null : lianxi.trim();
    }
}