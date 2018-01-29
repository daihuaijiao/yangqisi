package com.yangqisi.pojo;

import java.util.Date;

public class Picturedata {
    private Integer pId;

    private String pPicturename;

    private Integer pPictureclassid;

    private String pPictureurls;

    private String pPictureurlb;

    private Date pPictureaddtime;

    private String pEditor;

    private Byte pRecycle;

    private Date pRecycletime;

    private String top;

    private String orderid;

    private String sSoftdown1;

    private String setorder;

    private String pPicturedesc;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpPicturename() {
        return pPicturename;
    }

    public void setpPicturename(String pPicturename) {
        this.pPicturename = pPicturename == null ? null : pPicturename.trim();
    }

    public Integer getpPictureclassid() {
        return pPictureclassid;
    }

    public void setpPictureclassid(Integer pPictureclassid) {
        this.pPictureclassid = pPictureclassid;
    }

    public String getpPictureurls() {
        return pPictureurls;
    }

    public void setpPictureurls(String pPictureurls) {
        this.pPictureurls = pPictureurls == null ? null : pPictureurls.trim();
    }

    public String getpPictureurlb() {
        return pPictureurlb;
    }

    public void setpPictureurlb(String pPictureurlb) {
        this.pPictureurlb = pPictureurlb == null ? null : pPictureurlb.trim();
    }

    public Date getpPictureaddtime() {
        return pPictureaddtime;
    }

    public void setpPictureaddtime(Date pPictureaddtime) {
        this.pPictureaddtime = pPictureaddtime;
    }

    public String getpEditor() {
        return pEditor;
    }

    public void setpEditor(String pEditor) {
        this.pEditor = pEditor == null ? null : pEditor.trim();
    }

    public Byte getpRecycle() {
        return pRecycle;
    }

    public void setpRecycle(Byte pRecycle) {
        this.pRecycle = pRecycle;
    }

    public Date getpRecycletime() {
        return pRecycletime;
    }

    public void setpRecycletime(Date pRecycletime) {
        this.pRecycletime = pRecycletime;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top == null ? null : top.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getsSoftdown1() {
        return sSoftdown1;
    }

    public void setsSoftdown1(String sSoftdown1) {
        this.sSoftdown1 = sSoftdown1 == null ? null : sSoftdown1.trim();
    }

    public String getSetorder() {
        return setorder;
    }

    public void setSetorder(String setorder) {
        this.setorder = setorder == null ? null : setorder.trim();
    }

    public String getpPicturedesc() {
        return pPicturedesc;
    }

    public void setpPicturedesc(String pPicturedesc) {
        this.pPicturedesc = pPicturedesc == null ? null : pPicturedesc.trim();
    }
}