package com.yangqisi.pojo;

import java.util.Date;

public class Picturenews {
    private Integer aId;

    private String aTitle;

    private Date aAddtime;

    private String aEditor;

    private String address;

    private String aContent;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle == null ? null : aTitle.trim();
    }

    public Date getaAddtime() {
        return aAddtime;
    }

    public void setaAddtime(Date aAddtime) {
        this.aAddtime = aAddtime;
    }

    public String getaEditor() {
        return aEditor;
    }

    public void setaEditor(String aEditor) {
        this.aEditor = aEditor == null ? null : aEditor.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent == null ? null : aContent.trim();
    }
}