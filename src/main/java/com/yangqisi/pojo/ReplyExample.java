package com.yangqisi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNull() {
            addCriterion("r_time is null");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNotNull() {
            addCriterion("r_time is not null");
            return (Criteria) this;
        }

        public Criteria andRTimeEqualTo(Date value) {
            addCriterion("r_time =", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotEqualTo(Date value) {
            addCriterion("r_time <>", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThan(Date value) {
            addCriterion("r_time >", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("r_time >=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThan(Date value) {
            addCriterion("r_time <", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThanOrEqualTo(Date value) {
            addCriterion("r_time <=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeIn(List<Date> values) {
            addCriterion("r_time in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotIn(List<Date> values) {
            addCriterion("r_time not in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeBetween(Date value1, Date value2) {
            addCriterion("r_time between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotBetween(Date value1, Date value2) {
            addCriterion("r_time not between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRIpIsNull() {
            addCriterion("r_ip is null");
            return (Criteria) this;
        }

        public Criteria andRIpIsNotNull() {
            addCriterion("r_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRIpEqualTo(String value) {
            addCriterion("r_ip =", value, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpNotEqualTo(String value) {
            addCriterion("r_ip <>", value, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpGreaterThan(String value) {
            addCriterion("r_ip >", value, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpGreaterThanOrEqualTo(String value) {
            addCriterion("r_ip >=", value, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpLessThan(String value) {
            addCriterion("r_ip <", value, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpLessThanOrEqualTo(String value) {
            addCriterion("r_ip <=", value, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpLike(String value) {
            addCriterion("r_ip like", value, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpNotLike(String value) {
            addCriterion("r_ip not like", value, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpIn(List<String> values) {
            addCriterion("r_ip in", values, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpNotIn(List<String> values) {
            addCriterion("r_ip not in", values, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpBetween(String value1, String value2) {
            addCriterion("r_ip between", value1, value2, "rIp");
            return (Criteria) this;
        }

        public Criteria andRIpNotBetween(String value1, String value2) {
            addCriterion("r_ip not between", value1, value2, "rIp");
            return (Criteria) this;
        }

        public Criteria andRUsernameIsNull() {
            addCriterion("r_username is null");
            return (Criteria) this;
        }

        public Criteria andRUsernameIsNotNull() {
            addCriterion("r_username is not null");
            return (Criteria) this;
        }

        public Criteria andRUsernameEqualTo(String value) {
            addCriterion("r_username =", value, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameNotEqualTo(String value) {
            addCriterion("r_username <>", value, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameGreaterThan(String value) {
            addCriterion("r_username >", value, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("r_username >=", value, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameLessThan(String value) {
            addCriterion("r_username <", value, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameLessThanOrEqualTo(String value) {
            addCriterion("r_username <=", value, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameLike(String value) {
            addCriterion("r_username like", value, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameNotLike(String value) {
            addCriterion("r_username not like", value, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameIn(List<String> values) {
            addCriterion("r_username in", values, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameNotIn(List<String> values) {
            addCriterion("r_username not in", values, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameBetween(String value1, String value2) {
            addCriterion("r_username between", value1, value2, "rUsername");
            return (Criteria) this;
        }

        public Criteria andRUsernameNotBetween(String value1, String value2) {
            addCriterion("r_username not between", value1, value2, "rUsername");
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