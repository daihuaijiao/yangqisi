package com.yangqisi.pojo;

public class NewsdataWithBLOBs extends Newsdata {
    private String dContent;

    private String dOriginalfilename;

    private String dSavefilename;

    private String dSavepathfilename;

    public String getdContent() {
        return dContent;
    }

    public void setdContent(String dContent) {
        this.dContent = dContent == null ? null : dContent.trim();
    }

    public String getdOriginalfilename() {
        return dOriginalfilename;
    }

    public void setdOriginalfilename(String dOriginalfilename) {
        this.dOriginalfilename = dOriginalfilename == null ? null : dOriginalfilename.trim();
    }

    public String getdSavefilename() {
        return dSavefilename;
    }

    public void setdSavefilename(String dSavefilename) {
        this.dSavefilename = dSavefilename == null ? null : dSavefilename.trim();
    }

    public String getdSavepathfilename() {
        return dSavepathfilename;
    }

    public void setdSavepathfilename(String dSavepathfilename) {
        this.dSavepathfilename = dSavepathfilename == null ? null : dSavepathfilename.trim();
    }
}