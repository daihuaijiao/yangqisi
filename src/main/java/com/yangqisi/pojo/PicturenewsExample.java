package com.yangqisi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PicturenewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicturenewsExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("A_ID is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("A_ID =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("A_ID <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("A_ID >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("A_ID >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("A_ID <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("A_ID <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("A_ID in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("A_ID not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("A_ID between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("A_ID not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andATitleIsNull() {
            addCriterion("A_Title is null");
            return (Criteria) this;
        }

        public Criteria andATitleIsNotNull() {
            addCriterion("A_Title is not null");
            return (Criteria) this;
        }

        public Criteria andATitleEqualTo(String value) {
            addCriterion("A_Title =", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotEqualTo(String value) {
            addCriterion("A_Title <>", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThan(String value) {
            addCriterion("A_Title >", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThanOrEqualTo(String value) {
            addCriterion("A_Title >=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThan(String value) {
            addCriterion("A_Title <", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThanOrEqualTo(String value) {
            addCriterion("A_Title <=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLike(String value) {
            addCriterion("A_Title like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotLike(String value) {
            addCriterion("A_Title not like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleIn(List<String> values) {
            addCriterion("A_Title in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotIn(List<String> values) {
            addCriterion("A_Title not in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleBetween(String value1, String value2) {
            addCriterion("A_Title between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotBetween(String value1, String value2) {
            addCriterion("A_Title not between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andAAddtimeIsNull() {
            addCriterion("A_AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAAddtimeIsNotNull() {
            addCriterion("A_AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAAddtimeEqualTo(Date value) {
            addCriterion("A_AddTime =", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeNotEqualTo(Date value) {
            addCriterion("A_AddTime <>", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeGreaterThan(Date value) {
            addCriterion("A_AddTime >", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("A_AddTime >=", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeLessThan(Date value) {
            addCriterion("A_AddTime <", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("A_AddTime <=", value, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeIn(List<Date> values) {
            addCriterion("A_AddTime in", values, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeNotIn(List<Date> values) {
            addCriterion("A_AddTime not in", values, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeBetween(Date value1, Date value2) {
            addCriterion("A_AddTime between", value1, value2, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("A_AddTime not between", value1, value2, "aAddtime");
            return (Criteria) this;
        }

        public Criteria andAEditorIsNull() {
            addCriterion("A_Editor is null");
            return (Criteria) this;
        }

        public Criteria andAEditorIsNotNull() {
            addCriterion("A_Editor is not null");
            return (Criteria) this;
        }

        public Criteria andAEditorEqualTo(String value) {
            addCriterion("A_Editor =", value, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorNotEqualTo(String value) {
            addCriterion("A_Editor <>", value, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorGreaterThan(String value) {
            addCriterion("A_Editor >", value, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorGreaterThanOrEqualTo(String value) {
            addCriterion("A_Editor >=", value, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorLessThan(String value) {
            addCriterion("A_Editor <", value, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorLessThanOrEqualTo(String value) {
            addCriterion("A_Editor <=", value, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorLike(String value) {
            addCriterion("A_Editor like", value, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorNotLike(String value) {
            addCriterion("A_Editor not like", value, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorIn(List<String> values) {
            addCriterion("A_Editor in", values, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorNotIn(List<String> values) {
            addCriterion("A_Editor not in", values, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorBetween(String value1, String value2) {
            addCriterion("A_Editor between", value1, value2, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAEditorNotBetween(String value1, String value2) {
            addCriterion("A_Editor not between", value1, value2, "aEditor");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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