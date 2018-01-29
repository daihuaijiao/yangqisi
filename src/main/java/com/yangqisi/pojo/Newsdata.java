package com.yangqisi.pojo;

import java.util.Date;

public class Newsdata {
    private Integer dId;

    private Integer dClassid;

    private String dClassname;

    private String dTitle;

    private Date dTime;

    private String dAuthor;

    private String dSource;

    private String dPicture;

    private String dEditor;

    private Integer dNum;

    private Integer dCount;

    private Byte dRecycle;

    private Date dRecycletime;

    private String keyword;

    private String descrip;

    private String sSoftdown1;

    private String setorder;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getdClassid() {
        return dClassid;
    }

    public void setdClassid(Integer dClassid) {
        this.dClassid = dClassid;
    }

    public String getdClassname() {
        return dClassname;
    }

    public void setdClassname(String dClassname) {
        this.dClassname = dClassname == null ? null : dClassname.trim();
    }

    public String getdTitle() {
        return dTitle;
    }

    public void setdTitle(String dTitle) {
        this.dTitle = dTitle == null ? null : dTitle.trim();
    }

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date dTime) {
        this.dTime = dTime;
    }

    public String getdAuthor() {
        return dAuthor;
    }

    public void setdAuthor(String dAuthor) {
        this.dAuthor = dAuthor == null ? null : dAuthor.trim();
    }

    public String getdSource() {
        return dSource;
    }

    public void setdSource(String dSource) {
        this.dSource = dSource == null ? null : dSource.trim();
    }

    public String getdPicture() {
        return dPicture;
    }

    public void setdPicture(String dPicture) {
        this.dPicture = dPicture == null ? null : dPicture.trim();
    }

    public String getdEditor() {
        return dEditor;
    }

    public void setdEditor(String dEditor) {
        this.dEditor = dEditor == null ? null : dEditor.trim();
    }

    public Integer getdNum() {
        return dNum;
    }

    public void setdNum(Integer dNum) {
        this.dNum = dNum;
    }

    public Integer getdCount() {
        return dCount;
    }

    public void setdCount(Integer dCount) {
        this.dCount = dCount;
    }

    public Byte getdRecycle() {
        return dRecycle;
    }

    public void setdRecycle(Byte dRecycle) {
        this.dRecycle = dRecycle;
    }

    public Date getdRecycletime() {
        return dRecycletime;
    }

    public void setdRecycletime(Date dRecycletime) {
        this.dRecycletime = dRecycletime;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip == null ? null : descrip.trim();
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
}