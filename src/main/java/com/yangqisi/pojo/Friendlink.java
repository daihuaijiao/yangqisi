package com.yangqisi.pojo;

import java.util.Date;

public class Friendlink {
    private Integer fId;

    private String fSitename;

    private String fSiteadd;

    private String fSitelogo;

    private String fLinktype;

    private Byte fHeadshow;

    private Byte fRecycle;

    private Byte fExammark;

    private Date fAddtime;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfSitename() {
        return fSitename;
    }

    public void setfSitename(String fSitename) {
        this.fSitename = fSitename == null ? null : fSitename.trim();
    }

    public String getfSiteadd() {
        return fSiteadd;
    }

    public void setfSiteadd(String fSiteadd) {
        this.fSiteadd = fSiteadd == null ? null : fSiteadd.trim();
    }

    public String getfSitelogo() {
        return fSitelogo;
    }

    public void setfSitelogo(String fSitelogo) {
        this.fSitelogo = fSitelogo == null ? null : fSitelogo.trim();
    }

    public String getfLinktype() {
        return fLinktype;
    }

    public void setfLinktype(String fLinktype) {
        this.fLinktype = fLinktype == null ? null : fLinktype.trim();
    }

    public Byte getfHeadshow() {
        return fHeadshow;
    }

    public void setfHeadshow(Byte fHeadshow) {
        this.fHeadshow = fHeadshow;
    }

    public Byte getfRecycle() {
        return fRecycle;
    }

    public void setfRecycle(Byte fRecycle) {
        this.fRecycle = fRecycle;
    }

    public Byte getfExammark() {
        return fExammark;
    }

    public void setfExammark(Byte fExammark) {
        this.fExammark = fExammark;
    }

    public Date getfAddtime() {
        return fAddtime;
    }

    public void setfAddtime(Date fAddtime) {
        this.fAddtime = fAddtime;
    }
}