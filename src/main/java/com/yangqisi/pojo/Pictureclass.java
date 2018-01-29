package com.yangqisi.pojo;

public class Pictureclass {
    private Integer classid;

    private String classname;

    private Integer parentid;

    private String parentpath;

    private Integer depth;

    private Integer rootid;

    private Integer child;

    private Integer previd;

    private Integer nextid;

    private Integer orderid;

    private Integer setting;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getParentpath() {
        return parentpath;
    }

    public void setParentpath(String parentpath) {
        this.parentpath = parentpath == null ? null : parentpath.trim();
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getRootid() {
        return rootid;
    }

    public void setRootid(Integer rootid) {
        this.rootid = rootid;
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    public Integer getPrevid() {
        return previd;
    }

    public void setPrevid(Integer previd) {
        this.previd = previd;
    }

    public Integer getNextid() {
        return nextid;
    }

    public void setNextid(Integer nextid) {
        this.nextid = nextid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getSetting() {
        return setting;
    }

    public void setSetting(Integer setting) {
        this.setting = setting;
    }
}