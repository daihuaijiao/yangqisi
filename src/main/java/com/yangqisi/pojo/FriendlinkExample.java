package com.yangqisi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendlinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendlinkExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("F_ID is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("F_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("F_ID =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("F_ID <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("F_ID >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ID >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("F_ID <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("F_ID <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("F_ID in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("F_ID not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("F_ID between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ID not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFSitenameIsNull() {
            addCriterion("F_SITENAME is null");
            return (Criteria) this;
        }

        public Criteria andFSitenameIsNotNull() {
            addCriterion("F_SITENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFSitenameEqualTo(String value) {
            addCriterion("F_SITENAME =", value, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameNotEqualTo(String value) {
            addCriterion("F_SITENAME <>", value, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameGreaterThan(String value) {
            addCriterion("F_SITENAME >", value, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("F_SITENAME >=", value, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameLessThan(String value) {
            addCriterion("F_SITENAME <", value, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameLessThanOrEqualTo(String value) {
            addCriterion("F_SITENAME <=", value, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameLike(String value) {
            addCriterion("F_SITENAME like", value, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameNotLike(String value) {
            addCriterion("F_SITENAME not like", value, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameIn(List<String> values) {
            addCriterion("F_SITENAME in", values, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameNotIn(List<String> values) {
            addCriterion("F_SITENAME not in", values, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameBetween(String value1, String value2) {
            addCriterion("F_SITENAME between", value1, value2, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSitenameNotBetween(String value1, String value2) {
            addCriterion("F_SITENAME not between", value1, value2, "fSitename");
            return (Criteria) this;
        }

        public Criteria andFSiteaddIsNull() {
            addCriterion("F_SITEADD is null");
            return (Criteria) this;
        }

        public Criteria andFSiteaddIsNotNull() {
            addCriterion("F_SITEADD is not null");
            return (Criteria) this;
        }

        public Criteria andFSiteaddEqualTo(String value) {
            addCriterion("F_SITEADD =", value, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddNotEqualTo(String value) {
            addCriterion("F_SITEADD <>", value, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddGreaterThan(String value) {
            addCriterion("F_SITEADD >", value, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddGreaterThanOrEqualTo(String value) {
            addCriterion("F_SITEADD >=", value, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddLessThan(String value) {
            addCriterion("F_SITEADD <", value, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddLessThanOrEqualTo(String value) {
            addCriterion("F_SITEADD <=", value, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddLike(String value) {
            addCriterion("F_SITEADD like", value, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddNotLike(String value) {
            addCriterion("F_SITEADD not like", value, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddIn(List<String> values) {
            addCriterion("F_SITEADD in", values, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddNotIn(List<String> values) {
            addCriterion("F_SITEADD not in", values, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddBetween(String value1, String value2) {
            addCriterion("F_SITEADD between", value1, value2, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSiteaddNotBetween(String value1, String value2) {
            addCriterion("F_SITEADD not between", value1, value2, "fSiteadd");
            return (Criteria) this;
        }

        public Criteria andFSitelogoIsNull() {
            addCriterion("F_SITELOGO is null");
            return (Criteria) this;
        }

        public Criteria andFSitelogoIsNotNull() {
            addCriterion("F_SITELOGO is not null");
            return (Criteria) this;
        }

        public Criteria andFSitelogoEqualTo(String value) {
            addCriterion("F_SITELOGO =", value, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoNotEqualTo(String value) {
            addCriterion("F_SITELOGO <>", value, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoGreaterThan(String value) {
            addCriterion("F_SITELOGO >", value, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoGreaterThanOrEqualTo(String value) {
            addCriterion("F_SITELOGO >=", value, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoLessThan(String value) {
            addCriterion("F_SITELOGO <", value, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoLessThanOrEqualTo(String value) {
            addCriterion("F_SITELOGO <=", value, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoLike(String value) {
            addCriterion("F_SITELOGO like", value, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoNotLike(String value) {
            addCriterion("F_SITELOGO not like", value, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoIn(List<String> values) {
            addCriterion("F_SITELOGO in", values, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoNotIn(List<String> values) {
            addCriterion("F_SITELOGO not in", values, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoBetween(String value1, String value2) {
            addCriterion("F_SITELOGO between", value1, value2, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFSitelogoNotBetween(String value1, String value2) {
            addCriterion("F_SITELOGO not between", value1, value2, "fSitelogo");
            return (Criteria) this;
        }

        public Criteria andFLinktypeIsNull() {
            addCriterion("F_LINKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFLinktypeIsNotNull() {
            addCriterion("F_LINKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFLinktypeEqualTo(String value) {
            addCriterion("F_LINKTYPE =", value, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeNotEqualTo(String value) {
            addCriterion("F_LINKTYPE <>", value, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeGreaterThan(String value) {
            addCriterion("F_LINKTYPE >", value, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_LINKTYPE >=", value, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeLessThan(String value) {
            addCriterion("F_LINKTYPE <", value, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeLessThanOrEqualTo(String value) {
            addCriterion("F_LINKTYPE <=", value, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeLike(String value) {
            addCriterion("F_LINKTYPE like", value, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeNotLike(String value) {
            addCriterion("F_LINKTYPE not like", value, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeIn(List<String> values) {
            addCriterion("F_LINKTYPE in", values, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeNotIn(List<String> values) {
            addCriterion("F_LINKTYPE not in", values, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeBetween(String value1, String value2) {
            addCriterion("F_LINKTYPE between", value1, value2, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFLinktypeNotBetween(String value1, String value2) {
            addCriterion("F_LINKTYPE not between", value1, value2, "fLinktype");
            return (Criteria) this;
        }

        public Criteria andFHeadshowIsNull() {
            addCriterion("F_HEADSHOW is null");
            return (Criteria) this;
        }

        public Criteria andFHeadshowIsNotNull() {
            addCriterion("F_HEADSHOW is not null");
            return (Criteria) this;
        }

        public Criteria andFHeadshowEqualTo(Byte value) {
            addCriterion("F_HEADSHOW =", value, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowNotEqualTo(Byte value) {
            addCriterion("F_HEADSHOW <>", value, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowGreaterThan(Byte value) {
            addCriterion("F_HEADSHOW >", value, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("F_HEADSHOW >=", value, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowLessThan(Byte value) {
            addCriterion("F_HEADSHOW <", value, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowLessThanOrEqualTo(Byte value) {
            addCriterion("F_HEADSHOW <=", value, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowIn(List<Byte> values) {
            addCriterion("F_HEADSHOW in", values, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowNotIn(List<Byte> values) {
            addCriterion("F_HEADSHOW not in", values, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowBetween(Byte value1, Byte value2) {
            addCriterion("F_HEADSHOW between", value1, value2, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFHeadshowNotBetween(Byte value1, Byte value2) {
            addCriterion("F_HEADSHOW not between", value1, value2, "fHeadshow");
            return (Criteria) this;
        }

        public Criteria andFRecycleIsNull() {
            addCriterion("F_RECYCLE is null");
            return (Criteria) this;
        }

        public Criteria andFRecycleIsNotNull() {
            addCriterion("F_RECYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andFRecycleEqualTo(Byte value) {
            addCriterion("F_RECYCLE =", value, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleNotEqualTo(Byte value) {
            addCriterion("F_RECYCLE <>", value, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleGreaterThan(Byte value) {
            addCriterion("F_RECYCLE >", value, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleGreaterThanOrEqualTo(Byte value) {
            addCriterion("F_RECYCLE >=", value, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleLessThan(Byte value) {
            addCriterion("F_RECYCLE <", value, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleLessThanOrEqualTo(Byte value) {
            addCriterion("F_RECYCLE <=", value, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleIn(List<Byte> values) {
            addCriterion("F_RECYCLE in", values, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleNotIn(List<Byte> values) {
            addCriterion("F_RECYCLE not in", values, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleBetween(Byte value1, Byte value2) {
            addCriterion("F_RECYCLE between", value1, value2, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFRecycleNotBetween(Byte value1, Byte value2) {
            addCriterion("F_RECYCLE not between", value1, value2, "fRecycle");
            return (Criteria) this;
        }

        public Criteria andFExammarkIsNull() {
            addCriterion("F_EXAMMARK is null");
            return (Criteria) this;
        }

        public Criteria andFExammarkIsNotNull() {
            addCriterion("F_EXAMMARK is not null");
            return (Criteria) this;
        }

        public Criteria andFExammarkEqualTo(Byte value) {
            addCriterion("F_EXAMMARK =", value, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkNotEqualTo(Byte value) {
            addCriterion("F_EXAMMARK <>", value, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkGreaterThan(Byte value) {
            addCriterion("F_EXAMMARK >", value, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkGreaterThanOrEqualTo(Byte value) {
            addCriterion("F_EXAMMARK >=", value, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkLessThan(Byte value) {
            addCriterion("F_EXAMMARK <", value, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkLessThanOrEqualTo(Byte value) {
            addCriterion("F_EXAMMARK <=", value, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkIn(List<Byte> values) {
            addCriterion("F_EXAMMARK in", values, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkNotIn(List<Byte> values) {
            addCriterion("F_EXAMMARK not in", values, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkBetween(Byte value1, Byte value2) {
            addCriterion("F_EXAMMARK between", value1, value2, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFExammarkNotBetween(Byte value1, Byte value2) {
            addCriterion("F_EXAMMARK not between", value1, value2, "fExammark");
            return (Criteria) this;
        }

        public Criteria andFAddtimeIsNull() {
            addCriterion("F_ADDTIME is null");
            return (Criteria) this;
        }

        public Criteria andFAddtimeIsNotNull() {
            addCriterion("F_ADDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFAddtimeEqualTo(Date value) {
            addCriterion("F_ADDTIME =", value, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeNotEqualTo(Date value) {
            addCriterion("F_ADDTIME <>", value, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeGreaterThan(Date value) {
            addCriterion("F_ADDTIME >", value, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_ADDTIME >=", value, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeLessThan(Date value) {
            addCriterion("F_ADDTIME <", value, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("F_ADDTIME <=", value, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeIn(List<Date> values) {
            addCriterion("F_ADDTIME in", values, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeNotIn(List<Date> values) {
            addCriterion("F_ADDTIME not in", values, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeBetween(Date value1, Date value2) {
            addCriterion("F_ADDTIME between", value1, value2, "fAddtime");
            return (Criteria) this;
        }

        public Criteria andFAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("F_ADDTIME not between", value1, value2, "fAddtime");
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