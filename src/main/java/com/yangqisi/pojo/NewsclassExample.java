package com.yangqisi.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewsclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsclassExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andClassidIsNull() {
            addCriterion("classID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("className is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("className is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("className =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("className <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("className >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("className >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("className <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("className <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("className like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("className not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("className in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("className not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("className between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("className not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentpathIsNull() {
            addCriterion("parentPath is null");
            return (Criteria) this;
        }

        public Criteria andParentpathIsNotNull() {
            addCriterion("parentPath is not null");
            return (Criteria) this;
        }

        public Criteria andParentpathEqualTo(String value) {
            addCriterion("parentPath =", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotEqualTo(String value) {
            addCriterion("parentPath <>", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathGreaterThan(String value) {
            addCriterion("parentPath >", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathGreaterThanOrEqualTo(String value) {
            addCriterion("parentPath >=", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLessThan(String value) {
            addCriterion("parentPath <", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLessThanOrEqualTo(String value) {
            addCriterion("parentPath <=", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLike(String value) {
            addCriterion("parentPath like", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotLike(String value) {
            addCriterion("parentPath not like", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathIn(List<String> values) {
            addCriterion("parentPath in", values, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotIn(List<String> values) {
            addCriterion("parentPath not in", values, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathBetween(String value1, String value2) {
            addCriterion("parentPath between", value1, value2, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotBetween(String value1, String value2) {
            addCriterion("parentPath not between", value1, value2, "parentpath");
            return (Criteria) this;
        }

        public Criteria andDepthIsNull() {
            addCriterion("depth is null");
            return (Criteria) this;
        }

        public Criteria andDepthIsNotNull() {
            addCriterion("depth is not null");
            return (Criteria) this;
        }

        public Criteria andDepthEqualTo(Integer value) {
            addCriterion("depth =", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotEqualTo(Integer value) {
            addCriterion("depth <>", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThan(Integer value) {
            addCriterion("depth >", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("depth >=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThan(Integer value) {
            addCriterion("depth <", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThanOrEqualTo(Integer value) {
            addCriterion("depth <=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthIn(List<Integer> values) {
            addCriterion("depth in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotIn(List<Integer> values) {
            addCriterion("depth not in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthBetween(Integer value1, Integer value2) {
            addCriterion("depth between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("depth not between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andRootidIsNull() {
            addCriterion("rootID is null");
            return (Criteria) this;
        }

        public Criteria andRootidIsNotNull() {
            addCriterion("rootID is not null");
            return (Criteria) this;
        }

        public Criteria andRootidEqualTo(Integer value) {
            addCriterion("rootID =", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotEqualTo(Integer value) {
            addCriterion("rootID <>", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThan(Integer value) {
            addCriterion("rootID >", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rootID >=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThan(Integer value) {
            addCriterion("rootID <", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThanOrEqualTo(Integer value) {
            addCriterion("rootID <=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidIn(List<Integer> values) {
            addCriterion("rootID in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotIn(List<Integer> values) {
            addCriterion("rootID not in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidBetween(Integer value1, Integer value2) {
            addCriterion("rootID between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotBetween(Integer value1, Integer value2) {
            addCriterion("rootID not between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andChildIsNull() {
            addCriterion("child is null");
            return (Criteria) this;
        }

        public Criteria andChildIsNotNull() {
            addCriterion("child is not null");
            return (Criteria) this;
        }

        public Criteria andChildEqualTo(Integer value) {
            addCriterion("child =", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotEqualTo(Integer value) {
            addCriterion("child <>", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThan(Integer value) {
            addCriterion("child >", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThanOrEqualTo(Integer value) {
            addCriterion("child >=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThan(Integer value) {
            addCriterion("child <", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThanOrEqualTo(Integer value) {
            addCriterion("child <=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildIn(List<Integer> values) {
            addCriterion("child in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotIn(List<Integer> values) {
            addCriterion("child not in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildBetween(Integer value1, Integer value2) {
            addCriterion("child between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotBetween(Integer value1, Integer value2) {
            addCriterion("child not between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andPrevidIsNull() {
            addCriterion("prevID is null");
            return (Criteria) this;
        }

        public Criteria andPrevidIsNotNull() {
            addCriterion("prevID is not null");
            return (Criteria) this;
        }

        public Criteria andPrevidEqualTo(Integer value) {
            addCriterion("prevID =", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidNotEqualTo(Integer value) {
            addCriterion("prevID <>", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidGreaterThan(Integer value) {
            addCriterion("prevID >", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prevID >=", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidLessThan(Integer value) {
            addCriterion("prevID <", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidLessThanOrEqualTo(Integer value) {
            addCriterion("prevID <=", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidIn(List<Integer> values) {
            addCriterion("prevID in", values, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidNotIn(List<Integer> values) {
            addCriterion("prevID not in", values, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidBetween(Integer value1, Integer value2) {
            addCriterion("prevID between", value1, value2, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidNotBetween(Integer value1, Integer value2) {
            addCriterion("prevID not between", value1, value2, "previd");
            return (Criteria) this;
        }

        public Criteria andNextidIsNull() {
            addCriterion("NextID is null");
            return (Criteria) this;
        }

        public Criteria andNextidIsNotNull() {
            addCriterion("NextID is not null");
            return (Criteria) this;
        }

        public Criteria andNextidEqualTo(Integer value) {
            addCriterion("NextID =", value, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidNotEqualTo(Integer value) {
            addCriterion("NextID <>", value, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidGreaterThan(Integer value) {
            addCriterion("NextID >", value, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NextID >=", value, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidLessThan(Integer value) {
            addCriterion("NextID <", value, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidLessThanOrEqualTo(Integer value) {
            addCriterion("NextID <=", value, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidIn(List<Integer> values) {
            addCriterion("NextID in", values, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidNotIn(List<Integer> values) {
            addCriterion("NextID not in", values, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidBetween(Integer value1, Integer value2) {
            addCriterion("NextID between", value1, value2, "nextid");
            return (Criteria) this;
        }

        public Criteria andNextidNotBetween(Integer value1, Integer value2) {
            addCriterion("NextID not between", value1, value2, "nextid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andSettingIsNull() {
            addCriterion("setting is null");
            return (Criteria) this;
        }

        public Criteria andSettingIsNotNull() {
            addCriterion("setting is not null");
            return (Criteria) this;
        }

        public Criteria andSettingEqualTo(Integer value) {
            addCriterion("setting =", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotEqualTo(Integer value) {
            addCriterion("setting <>", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingGreaterThan(Integer value) {
            addCriterion("setting >", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingGreaterThanOrEqualTo(Integer value) {
            addCriterion("setting >=", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingLessThan(Integer value) {
            addCriterion("setting <", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingLessThanOrEqualTo(Integer value) {
            addCriterion("setting <=", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingIn(List<Integer> values) {
            addCriterion("setting in", values, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotIn(List<Integer> values) {
            addCriterion("setting not in", values, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingBetween(Integer value1, Integer value2) {
            addCriterion("setting between", value1, value2, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotBetween(Integer value1, Integer value2) {
            addCriterion("setting not between", value1, value2, "setting");
            return (Criteria) this;
        }

        public Criteria andCShowIsNull() {
            addCriterion("c_show is null");
            return (Criteria) this;
        }

        public Criteria andCShowIsNotNull() {
            addCriterion("c_show is not null");
            return (Criteria) this;
        }

        public Criteria andCShowEqualTo(Byte value) {
            addCriterion("c_show =", value, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowNotEqualTo(Byte value) {
            addCriterion("c_show <>", value, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowGreaterThan(Byte value) {
            addCriterion("c_show >", value, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowGreaterThanOrEqualTo(Byte value) {
            addCriterion("c_show >=", value, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowLessThan(Byte value) {
            addCriterion("c_show <", value, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowLessThanOrEqualTo(Byte value) {
            addCriterion("c_show <=", value, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowIn(List<Byte> values) {
            addCriterion("c_show in", values, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowNotIn(List<Byte> values) {
            addCriterion("c_show not in", values, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowBetween(Byte value1, Byte value2) {
            addCriterion("c_show between", value1, value2, "cShow");
            return (Criteria) this;
        }

        public Criteria andCShowNotBetween(Byte value1, Byte value2) {
            addCriterion("c_show not between", value1, value2, "cShow");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}