package com.yangqisi.pojo;

public class LiuyanWithBLOBs extends Liuyan {
    private String shuiping;

    private String gerenjianli;

    public String getShuiping() {
        return shuiping;
    }

    public void setShuiping(String shuiping) {
        this.shuiping = shuiping == null ? null : shuiping.trim();
    }

    public String getGerenjianli() {
        return gerenjianli;
    }

    public void setGerenjianli(String gerenjianli) {
        this.gerenjianli = gerenjianli == null ? null : gerenjianli.trim();
    }
}