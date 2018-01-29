package com.yangqisi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PicturedataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicturedataExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("P_ID is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("P_ID =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("P_ID <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("P_ID >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_ID >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("P_ID <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("P_ID <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("P_ID in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("P_ID not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("P_ID between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("P_ID not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPPicturenameIsNull() {
            addCriterion("P_PictureName is null");
            return (Criteria) this;
        }

        public Criteria andPPicturenameIsNotNull() {
            addCriterion("P_PictureName is not null");
            return (Criteria) this;
        }

        public Criteria andPPicturenameEqualTo(String value) {
            addCriterion("P_PictureName =", value, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameNotEqualTo(String value) {
            addCriterion("P_PictureName <>", value, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameGreaterThan(String value) {
            addCriterion("P_PictureName >", value, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameGreaterThanOrEqualTo(String value) {
            addCriterion("P_PictureName >=", value, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameLessThan(String value) {
            addCriterion("P_PictureName <", value, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameLessThanOrEqualTo(String value) {
            addCriterion("P_PictureName <=", value, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameLike(String value) {
            addCriterion("P_PictureName like", value, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameNotLike(String value) {
            addCriterion("P_PictureName not like", value, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameIn(List<String> values) {
            addCriterion("P_PictureName in", values, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameNotIn(List<String> values) {
            addCriterion("P_PictureName not in", values, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameBetween(String value1, String value2) {
            addCriterion("P_PictureName between", value1, value2, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPicturenameNotBetween(String value1, String value2) {
            addCriterion("P_PictureName not between", value1, value2, "pPicturename");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidIsNull() {
            addCriterion("P_PictureClassID is null");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidIsNotNull() {
            addCriterion("P_PictureClassID is not null");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidEqualTo(Integer value) {
            addCriterion("P_PictureClassID =", value, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidNotEqualTo(Integer value) {
            addCriterion("P_PictureClassID <>", value, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidGreaterThan(Integer value) {
            addCriterion("P_PictureClassID >", value, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_PictureClassID >=", value, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidLessThan(Integer value) {
            addCriterion("P_PictureClassID <", value, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidLessThanOrEqualTo(Integer value) {
            addCriterion("P_PictureClassID <=", value, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidIn(List<Integer> values) {
            addCriterion("P_PictureClassID in", values, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidNotIn(List<Integer> values) {
            addCriterion("P_PictureClassID not in", values, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidBetween(Integer value1, Integer value2) {
            addCriterion("P_PictureClassID between", value1, value2, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("P_PictureClassID not between", value1, value2, "pPictureclassid");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsIsNull() {
            addCriterion("P_PictureUrlS is null");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsIsNotNull() {
            addCriterion("P_PictureUrlS is not null");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsEqualTo(String value) {
            addCriterion("P_PictureUrlS =", value, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsNotEqualTo(String value) {
            addCriterion("P_PictureUrlS <>", value, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsGreaterThan(String value) {
            addCriterion("P_PictureUrlS >", value, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsGreaterThanOrEqualTo(String value) {
            addCriterion("P_PictureUrlS >=", value, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsLessThan(String value) {
            addCriterion("P_PictureUrlS <", value, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsLessThanOrEqualTo(String value) {
            addCriterion("P_PictureUrlS <=", value, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsLike(String value) {
            addCriterion("P_PictureUrlS like", value, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsNotLike(String value) {
            addCriterion("P_PictureUrlS not like", value, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsIn(List<String> values) {
            addCriterion("P_PictureUrlS in", values, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsNotIn(List<String> values) {
            addCriterion("P_PictureUrlS not in", values, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsBetween(String value1, String value2) {
            addCriterion("P_PictureUrlS between", value1, value2, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlsNotBetween(String value1, String value2) {
            addCriterion("P_PictureUrlS not between", value1, value2, "pPictureurls");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbIsNull() {
            addCriterion("P_PictureUrlB is null");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbIsNotNull() {
            addCriterion("P_PictureUrlB is not null");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbEqualTo(String value) {
            addCriterion("P_PictureUrlB =", value, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbNotEqualTo(String value) {
            addCriterion("P_PictureUrlB <>", value, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbGreaterThan(String value) {
            addCriterion("P_PictureUrlB >", value, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbGreaterThanOrEqualTo(String value) {
            addCriterion("P_PictureUrlB >=", value, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbLessThan(String value) {
            addCriterion("P_PictureUrlB <", value, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbLessThanOrEqualTo(String value) {
            addCriterion("P_PictureUrlB <=", value, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbLike(String value) {
            addCriterion("P_PictureUrlB like", value, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbNotLike(String value) {
            addCriterion("P_PictureUrlB not like", value, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbIn(List<String> values) {
            addCriterion("P_PictureUrlB in", values, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbNotIn(List<String> values) {
            addCriterion("P_PictureUrlB not in", values, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbBetween(String value1, String value2) {
            addCriterion("P_PictureUrlB between", value1, value2, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureurlbNotBetween(String value1, String value2) {
            addCriterion("P_PictureUrlB not between", value1, value2, "pPictureurlb");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeIsNull() {
            addCriterion("P_PictureAddTime is null");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeIsNotNull() {
            addCriterion("P_PictureAddTime is not null");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeEqualTo(Date value) {
            addCriterion("P_PictureAddTime =", value, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeNotEqualTo(Date value) {
            addCriterion("P_PictureAddTime <>", value, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeGreaterThan(Date value) {
            addCriterion("P_PictureAddTime >", value, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("P_PictureAddTime >=", value, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeLessThan(Date value) {
            addCriterion("P_PictureAddTime <", value, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("P_PictureAddTime <=", value, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeIn(List<Date> values) {
            addCriterion("P_PictureAddTime in", values, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeNotIn(List<Date> values) {
            addCriterion("P_PictureAddTime not in", values, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeBetween(Date value1, Date value2) {
            addCriterion("P_PictureAddTime between", value1, value2, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPPictureaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("P_PictureAddTime not between", value1, value2, "pPictureaddtime");
            return (Criteria) this;
        }

        public Criteria andPEditorIsNull() {
            addCriterion("P_Editor is null");
            return (Criteria) this;
        }

        public Criteria andPEditorIsNotNull() {
            addCriterion("P_Editor is not null");
            return (Criteria) this;
        }

        public Criteria andPEditorEqualTo(String value) {
            addCriterion("P_Editor =", value, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorNotEqualTo(String value) {
            addCriterion("P_Editor <>", value, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorGreaterThan(String value) {
            addCriterion("P_Editor >", value, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorGreaterThanOrEqualTo(String value) {
            addCriterion("P_Editor >=", value, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorLessThan(String value) {
            addCriterion("P_Editor <", value, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorLessThanOrEqualTo(String value) {
            addCriterion("P_Editor <=", value, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorLike(String value) {
            addCriterion("P_Editor like", value, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorNotLike(String value) {
            addCriterion("P_Editor not like", value, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorIn(List<String> values) {
            addCriterion("P_Editor in", values, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorNotIn(List<String> values) {
            addCriterion("P_Editor not in", values, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorBetween(String value1, String value2) {
            addCriterion("P_Editor between", value1, value2, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPEditorNotBetween(String value1, String value2) {
            addCriterion("P_Editor not between", value1, value2, "pEditor");
            return (Criteria) this;
        }

        public Criteria andPRecycleIsNull() {
            addCriterion("P_Recycle is null");
            return (Criteria) this;
        }

        public Criteria andPRecycleIsNotNull() {
            addCriterion("P_Recycle is not null");
            return (Criteria) this;
        }

        public Criteria andPRecycleEqualTo(Byte value) {
            addCriterion("P_Recycle =", value, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleNotEqualTo(Byte value) {
            addCriterion("P_Recycle <>", value, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleGreaterThan(Byte value) {
            addCriterion("P_Recycle >", value, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Recycle >=", value, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleLessThan(Byte value) {
            addCriterion("P_Recycle <", value, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleLessThanOrEqualTo(Byte value) {
            addCriterion("P_Recycle <=", value, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleIn(List<Byte> values) {
            addCriterion("P_Recycle in", values, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleNotIn(List<Byte> values) {
            addCriterion("P_Recycle not in", values, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleBetween(Byte value1, Byte value2) {
            addCriterion("P_Recycle between", value1, value2, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycleNotBetween(Byte value1, Byte value2) {
            addCriterion("P_Recycle not between", value1, value2, "pRecycle");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeIsNull() {
            addCriterion("P_RecycleTime is null");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeIsNotNull() {
            addCriterion("P_RecycleTime is not null");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeEqualTo(Date value) {
            addCriterion("P_RecycleTime =", value, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeNotEqualTo(Date value) {
            addCriterion("P_RecycleTime <>", value, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeGreaterThan(Date value) {
            addCriterion("P_RecycleTime >", value, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("P_RecycleTime >=", value, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeLessThan(Date value) {
            addCriterion("P_RecycleTime <", value, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeLessThanOrEqualTo(Date value) {
            addCriterion("P_RecycleTime <=", value, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeIn(List<Date> values) {
            addCriterion("P_RecycleTime in", values, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeNotIn(List<Date> values) {
            addCriterion("P_RecycleTime not in", values, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeBetween(Date value1, Date value2) {
            addCriterion("P_RecycleTime between", value1, value2, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andPRecycletimeNotBetween(Date value1, Date value2) {
            addCriterion("P_RecycleTime not between", value1, value2, "pRecycletime");
            return (Criteria) this;
        }

        public Criteria andTopIsNull() {
            addCriterion("top is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("top is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(String value) {
            addCriterion("top =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(String value) {
            addCriterion("top <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(String value) {
            addCriterion("top >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(String value) {
            addCriterion("top >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(String value) {
            addCriterion("top <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(String value) {
            addCriterion("top <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLike(String value) {
            addCriterion("top like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotLike(String value) {
            addCriterion("top not like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<String> values) {
            addCriterion("top in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<String> values) {
            addCriterion("top not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(String value1, String value2) {
            addCriterion("top between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(String value1, String value2) {
            addCriterion("top not between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1IsNull() {
            addCriterion("S_SoftDown1 is null");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1IsNotNull() {
            addCriterion("S_SoftDown1 is not null");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1EqualTo(String value) {
            addCriterion("S_SoftDown1 =", value, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1NotEqualTo(String value) {
            addCriterion("S_SoftDown1 <>", value, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1GreaterThan(String value) {
            addCriterion("S_SoftDown1 >", value, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1GreaterThanOrEqualTo(String value) {
            addCriterion("S_SoftDown1 >=", value, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1LessThan(String value) {
            addCriterion("S_SoftDown1 <", value, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1LessThanOrEqualTo(String value) {
            addCriterion("S_SoftDown1 <=", value, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1Like(String value) {
            addCriterion("S_SoftDown1 like", value, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1NotLike(String value) {
            addCriterion("S_SoftDown1 not like", value, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1In(List<String> values) {
            addCriterion("S_SoftDown1 in", values, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1NotIn(List<String> values) {
            addCriterion("S_SoftDown1 not in", values, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1Between(String value1, String value2) {
            addCriterion("S_SoftDown1 between", value1, value2, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSSoftdown1NotBetween(String value1, String value2) {
            addCriterion("S_SoftDown1 not between", value1, value2, "sSoftdown1");
            return (Criteria) this;
        }

        public Criteria andSetorderIsNull() {
            addCriterion("setorder is null");
            return (Criteria) this;
        }

        public Criteria andSetorderIsNotNull() {
            addCriterion("setorder is not null");
            return (Criteria) this;
        }

        public Criteria andSetorderEqualTo(String value) {
            addCriterion("setorder =", value, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderNotEqualTo(String value) {
            addCriterion("setorder <>", value, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderGreaterThan(String value) {
            addCriterion("setorder >", value, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderGreaterThanOrEqualTo(String value) {
            addCriterion("setorder >=", value, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderLessThan(String value) {
            addCriterion("setorder <", value, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderLessThanOrEqualTo(String value) {
            addCriterion("setorder <=", value, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderLike(String value) {
            addCriterion("setorder like", value, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderNotLike(String value) {
            addCriterion("setorder not like", value, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderIn(List<String> values) {
            addCriterion("setorder in", values, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderNotIn(List<String> values) {
            addCriterion("setorder not in", values, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderBetween(String value1, String value2) {
            addCriterion("setorder between", value1, value2, "setorder");
            return (Criteria) this;
        }

        public Criteria andSetorderNotBetween(String value1, String value2) {
            addCriterion("setorder not between", value1, value2, "setorder");
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