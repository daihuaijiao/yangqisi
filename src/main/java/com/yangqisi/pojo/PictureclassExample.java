package com.yangqisi.pojo;

import java.util.ArrayList;
import java.util.List;

public class PictureclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureclassExample() {
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
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("ClassName is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("ClassName =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("ClassName <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("ClassName >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassName >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("ClassName <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("ClassName <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("ClassName like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("ClassName not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("ClassName in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("ClassName not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("ClassName between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("ClassName not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentpathIsNull() {
            addCriterion("ParentPath is null");
            return (Criteria) this;
        }

        public Criteria andParentpathIsNotNull() {
            addCriterion("ParentPath is not null");
            return (Criteria) this;
        }

        public Criteria andParentpathEqualTo(String value) {
            addCriterion("ParentPath =", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotEqualTo(String value) {
            addCriterion("ParentPath <>", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathGreaterThan(String value) {
            addCriterion("ParentPath >", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathGreaterThanOrEqualTo(String value) {
            addCriterion("ParentPath >=", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLessThan(String value) {
            addCriterion("ParentPath <", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLessThanOrEqualTo(String value) {
            addCriterion("ParentPath <=", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathLike(String value) {
            addCriterion("ParentPath like", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotLike(String value) {
            addCriterion("ParentPath not like", value, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathIn(List<String> values) {
            addCriterion("ParentPath in", values, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotIn(List<String> values) {
            addCriterion("ParentPath not in", values, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathBetween(String value1, String value2) {
            addCriterion("ParentPath between", value1, value2, "parentpath");
            return (Criteria) this;
        }

        public Criteria andParentpathNotBetween(String value1, String value2) {
            addCriterion("ParentPath not between", value1, value2, "parentpath");
            return (Criteria) this;
        }

        public Criteria andDepthIsNull() {
            addCriterion("Depth is null");
            return (Criteria) this;
        }

        public Criteria andDepthIsNotNull() {
            addCriterion("Depth is not null");
            return (Criteria) this;
        }

        public Criteria andDepthEqualTo(Integer value) {
            addCriterion("Depth =", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotEqualTo(Integer value) {
            addCriterion("Depth <>", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThan(Integer value) {
            addCriterion("Depth >", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("Depth >=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThan(Integer value) {
            addCriterion("Depth <", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThanOrEqualTo(Integer value) {
            addCriterion("Depth <=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthIn(List<Integer> values) {
            addCriterion("Depth in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotIn(List<Integer> values) {
            addCriterion("Depth not in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthBetween(Integer value1, Integer value2) {
            addCriterion("Depth between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("Depth not between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andRootidIsNull() {
            addCriterion("RootID is null");
            return (Criteria) this;
        }

        public Criteria andRootidIsNotNull() {
            addCriterion("RootID is not null");
            return (Criteria) this;
        }

        public Criteria andRootidEqualTo(Integer value) {
            addCriterion("RootID =", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotEqualTo(Integer value) {
            addCriterion("RootID <>", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThan(Integer value) {
            addCriterion("RootID >", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RootID >=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThan(Integer value) {
            addCriterion("RootID <", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThanOrEqualTo(Integer value) {
            addCriterion("RootID <=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidIn(List<Integer> values) {
            addCriterion("RootID in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotIn(List<Integer> values) {
            addCriterion("RootID not in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidBetween(Integer value1, Integer value2) {
            addCriterion("RootID between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotBetween(Integer value1, Integer value2) {
            addCriterion("RootID not between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andChildIsNull() {
            addCriterion("Child is null");
            return (Criteria) this;
        }

        public Criteria andChildIsNotNull() {
            addCriterion("Child is not null");
            return (Criteria) this;
        }

        public Criteria andChildEqualTo(Integer value) {
            addCriterion("Child =", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotEqualTo(Integer value) {
            addCriterion("Child <>", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThan(Integer value) {
            addCriterion("Child >", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThanOrEqualTo(Integer value) {
            addCriterion("Child >=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThan(Integer value) {
            addCriterion("Child <", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThanOrEqualTo(Integer value) {
            addCriterion("Child <=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildIn(List<Integer> values) {
            addCriterion("Child in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotIn(List<Integer> values) {
            addCriterion("Child not in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildBetween(Integer value1, Integer value2) {
            addCriterion("Child between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotBetween(Integer value1, Integer value2) {
            addCriterion("Child not between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andPrevidIsNull() {
            addCriterion("PrevID is null");
            return (Criteria) this;
        }

        public Criteria andPrevidIsNotNull() {
            addCriterion("PrevID is not null");
            return (Criteria) this;
        }

        public Criteria andPrevidEqualTo(Integer value) {
            addCriterion("PrevID =", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidNotEqualTo(Integer value) {
            addCriterion("PrevID <>", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidGreaterThan(Integer value) {
            addCriterion("PrevID >", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrevID >=", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidLessThan(Integer value) {
            addCriterion("PrevID <", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidLessThanOrEqualTo(Integer value) {
            addCriterion("PrevID <=", value, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidIn(List<Integer> values) {
            addCriterion("PrevID in", values, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidNotIn(List<Integer> values) {
            addCriterion("PrevID not in", values, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidBetween(Integer value1, Integer value2) {
            addCriterion("PrevID between", value1, value2, "previd");
            return (Criteria) this;
        }

        public Criteria andPrevidNotBetween(Integer value1, Integer value2) {
            addCriterion("PrevID not between", value1, value2, "previd");
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
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andSettingIsNull() {
            addCriterion("Setting is null");
            return (Criteria) this;
        }

        public Criteria andSettingIsNotNull() {
            addCriterion("Setting is not null");
            return (Criteria) this;
        }

        public Criteria andSettingEqualTo(Integer value) {
            addCriterion("Setting =", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotEqualTo(Integer value) {
            addCriterion("Setting <>", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingGreaterThan(Integer value) {
            addCriterion("Setting >", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingGreaterThanOrEqualTo(Integer value) {
            addCriterion("Setting >=", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingLessThan(Integer value) {
            addCriterion("Setting <", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingLessThanOrEqualTo(Integer value) {
            addCriterion("Setting <=", value, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingIn(List<Integer> values) {
            addCriterion("Setting in", values, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotIn(List<Integer> values) {
            addCriterion("Setting not in", values, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingBetween(Integer value1, Integer value2) {
            addCriterion("Setting between", value1, value2, "setting");
            return (Criteria) this;
        }

        public Criteria andSettingNotBetween(Integer value1, Integer value2) {
            addCriterion("Setting not between", value1, value2, "setting");
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