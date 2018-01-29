package com.yangqisi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsdataExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("D_ID is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("D_ID =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("D_ID <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("D_ID >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_ID >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("D_ID <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("D_ID <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("D_ID in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("D_ID not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("D_ID between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("D_ID not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDClassidIsNull() {
            addCriterion("D_ClassID is null");
            return (Criteria) this;
        }

        public Criteria andDClassidIsNotNull() {
            addCriterion("D_ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andDClassidEqualTo(Integer value) {
            addCriterion("D_ClassID =", value, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidNotEqualTo(Integer value) {
            addCriterion("D_ClassID <>", value, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidGreaterThan(Integer value) {
            addCriterion("D_ClassID >", value, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_ClassID >=", value, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidLessThan(Integer value) {
            addCriterion("D_ClassID <", value, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidLessThanOrEqualTo(Integer value) {
            addCriterion("D_ClassID <=", value, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidIn(List<Integer> values) {
            addCriterion("D_ClassID in", values, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidNotIn(List<Integer> values) {
            addCriterion("D_ClassID not in", values, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidBetween(Integer value1, Integer value2) {
            addCriterion("D_ClassID between", value1, value2, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("D_ClassID not between", value1, value2, "dClassid");
            return (Criteria) this;
        }

        public Criteria andDClassnameIsNull() {
            addCriterion("D_ClassName is null");
            return (Criteria) this;
        }

        public Criteria andDClassnameIsNotNull() {
            addCriterion("D_ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andDClassnameEqualTo(String value) {
            addCriterion("D_ClassName =", value, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameNotEqualTo(String value) {
            addCriterion("D_ClassName <>", value, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameGreaterThan(String value) {
            addCriterion("D_ClassName >", value, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("D_ClassName >=", value, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameLessThan(String value) {
            addCriterion("D_ClassName <", value, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameLessThanOrEqualTo(String value) {
            addCriterion("D_ClassName <=", value, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameLike(String value) {
            addCriterion("D_ClassName like", value, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameNotLike(String value) {
            addCriterion("D_ClassName not like", value, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameIn(List<String> values) {
            addCriterion("D_ClassName in", values, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameNotIn(List<String> values) {
            addCriterion("D_ClassName not in", values, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameBetween(String value1, String value2) {
            addCriterion("D_ClassName between", value1, value2, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDClassnameNotBetween(String value1, String value2) {
            addCriterion("D_ClassName not between", value1, value2, "dClassname");
            return (Criteria) this;
        }

        public Criteria andDTitleIsNull() {
            addCriterion("D_Title is null");
            return (Criteria) this;
        }

        public Criteria andDTitleIsNotNull() {
            addCriterion("D_Title is not null");
            return (Criteria) this;
        }

        public Criteria andDTitleEqualTo(String value) {
            addCriterion("D_Title =", value, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleNotEqualTo(String value) {
            addCriterion("D_Title <>", value, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleGreaterThan(String value) {
            addCriterion("D_Title >", value, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleGreaterThanOrEqualTo(String value) {
            addCriterion("D_Title >=", value, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleLessThan(String value) {
            addCriterion("D_Title <", value, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleLessThanOrEqualTo(String value) {
            addCriterion("D_Title <=", value, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleLike(String value) {
            addCriterion("D_Title like", value, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleNotLike(String value) {
            addCriterion("D_Title not like", value, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleIn(List<String> values) {
            addCriterion("D_Title in", values, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleNotIn(List<String> values) {
            addCriterion("D_Title not in", values, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleBetween(String value1, String value2) {
            addCriterion("D_Title between", value1, value2, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTitleNotBetween(String value1, String value2) {
            addCriterion("D_Title not between", value1, value2, "dTitle");
            return (Criteria) this;
        }

        public Criteria andDTimeIsNull() {
            addCriterion("D_Time is null");
            return (Criteria) this;
        }

        public Criteria andDTimeIsNotNull() {
            addCriterion("D_Time is not null");
            return (Criteria) this;
        }

        public Criteria andDTimeEqualTo(Date value) {
            addCriterion("D_Time =", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotEqualTo(Date value) {
            addCriterion("D_Time <>", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeGreaterThan(Date value) {
            addCriterion("D_Time >", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_Time >=", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLessThan(Date value) {
            addCriterion("D_Time <", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLessThanOrEqualTo(Date value) {
            addCriterion("D_Time <=", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeIn(List<Date> values) {
            addCriterion("D_Time in", values, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotIn(List<Date> values) {
            addCriterion("D_Time not in", values, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeBetween(Date value1, Date value2) {
            addCriterion("D_Time between", value1, value2, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotBetween(Date value1, Date value2) {
            addCriterion("D_Time not between", value1, value2, "dTime");
            return (Criteria) this;
        }

        public Criteria andDAuthorIsNull() {
            addCriterion("D_Author is null");
            return (Criteria) this;
        }

        public Criteria andDAuthorIsNotNull() {
            addCriterion("D_Author is not null");
            return (Criteria) this;
        }

        public Criteria andDAuthorEqualTo(String value) {
            addCriterion("D_Author =", value, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorNotEqualTo(String value) {
            addCriterion("D_Author <>", value, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorGreaterThan(String value) {
            addCriterion("D_Author >", value, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("D_Author >=", value, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorLessThan(String value) {
            addCriterion("D_Author <", value, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorLessThanOrEqualTo(String value) {
            addCriterion("D_Author <=", value, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorLike(String value) {
            addCriterion("D_Author like", value, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorNotLike(String value) {
            addCriterion("D_Author not like", value, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorIn(List<String> values) {
            addCriterion("D_Author in", values, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorNotIn(List<String> values) {
            addCriterion("D_Author not in", values, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorBetween(String value1, String value2) {
            addCriterion("D_Author between", value1, value2, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDAuthorNotBetween(String value1, String value2) {
            addCriterion("D_Author not between", value1, value2, "dAuthor");
            return (Criteria) this;
        }

        public Criteria andDSourceIsNull() {
            addCriterion("D_Source is null");
            return (Criteria) this;
        }

        public Criteria andDSourceIsNotNull() {
            addCriterion("D_Source is not null");
            return (Criteria) this;
        }

        public Criteria andDSourceEqualTo(String value) {
            addCriterion("D_Source =", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceNotEqualTo(String value) {
            addCriterion("D_Source <>", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceGreaterThan(String value) {
            addCriterion("D_Source >", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceGreaterThanOrEqualTo(String value) {
            addCriterion("D_Source >=", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceLessThan(String value) {
            addCriterion("D_Source <", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceLessThanOrEqualTo(String value) {
            addCriterion("D_Source <=", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceLike(String value) {
            addCriterion("D_Source like", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceNotLike(String value) {
            addCriterion("D_Source not like", value, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceIn(List<String> values) {
            addCriterion("D_Source in", values, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceNotIn(List<String> values) {
            addCriterion("D_Source not in", values, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceBetween(String value1, String value2) {
            addCriterion("D_Source between", value1, value2, "dSource");
            return (Criteria) this;
        }

        public Criteria andDSourceNotBetween(String value1, String value2) {
            addCriterion("D_Source not between", value1, value2, "dSource");
            return (Criteria) this;
        }

        public Criteria andDPictureIsNull() {
            addCriterion("D_Picture is null");
            return (Criteria) this;
        }

        public Criteria andDPictureIsNotNull() {
            addCriterion("D_Picture is not null");
            return (Criteria) this;
        }

        public Criteria andDPictureEqualTo(String value) {
            addCriterion("D_Picture =", value, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureNotEqualTo(String value) {
            addCriterion("D_Picture <>", value, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureGreaterThan(String value) {
            addCriterion("D_Picture >", value, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureGreaterThanOrEqualTo(String value) {
            addCriterion("D_Picture >=", value, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureLessThan(String value) {
            addCriterion("D_Picture <", value, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureLessThanOrEqualTo(String value) {
            addCriterion("D_Picture <=", value, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureLike(String value) {
            addCriterion("D_Picture like", value, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureNotLike(String value) {
            addCriterion("D_Picture not like", value, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureIn(List<String> values) {
            addCriterion("D_Picture in", values, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureNotIn(List<String> values) {
            addCriterion("D_Picture not in", values, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureBetween(String value1, String value2) {
            addCriterion("D_Picture between", value1, value2, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDPictureNotBetween(String value1, String value2) {
            addCriterion("D_Picture not between", value1, value2, "dPicture");
            return (Criteria) this;
        }

        public Criteria andDEditorIsNull() {
            addCriterion("D_Editor is null");
            return (Criteria) this;
        }

        public Criteria andDEditorIsNotNull() {
            addCriterion("D_Editor is not null");
            return (Criteria) this;
        }

        public Criteria andDEditorEqualTo(String value) {
            addCriterion("D_Editor =", value, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorNotEqualTo(String value) {
            addCriterion("D_Editor <>", value, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorGreaterThan(String value) {
            addCriterion("D_Editor >", value, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorGreaterThanOrEqualTo(String value) {
            addCriterion("D_Editor >=", value, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorLessThan(String value) {
            addCriterion("D_Editor <", value, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorLessThanOrEqualTo(String value) {
            addCriterion("D_Editor <=", value, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorLike(String value) {
            addCriterion("D_Editor like", value, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorNotLike(String value) {
            addCriterion("D_Editor not like", value, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorIn(List<String> values) {
            addCriterion("D_Editor in", values, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorNotIn(List<String> values) {
            addCriterion("D_Editor not in", values, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorBetween(String value1, String value2) {
            addCriterion("D_Editor between", value1, value2, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDEditorNotBetween(String value1, String value2) {
            addCriterion("D_Editor not between", value1, value2, "dEditor");
            return (Criteria) this;
        }

        public Criteria andDNumIsNull() {
            addCriterion("D_Num is null");
            return (Criteria) this;
        }

        public Criteria andDNumIsNotNull() {
            addCriterion("D_Num is not null");
            return (Criteria) this;
        }

        public Criteria andDNumEqualTo(Integer value) {
            addCriterion("D_Num =", value, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumNotEqualTo(Integer value) {
            addCriterion("D_Num <>", value, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumGreaterThan(Integer value) {
            addCriterion("D_Num >", value, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Num >=", value, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumLessThan(Integer value) {
            addCriterion("D_Num <", value, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumLessThanOrEqualTo(Integer value) {
            addCriterion("D_Num <=", value, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumIn(List<Integer> values) {
            addCriterion("D_Num in", values, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumNotIn(List<Integer> values) {
            addCriterion("D_Num not in", values, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumBetween(Integer value1, Integer value2) {
            addCriterion("D_Num between", value1, value2, "dNum");
            return (Criteria) this;
        }

        public Criteria andDNumNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Num not between", value1, value2, "dNum");
            return (Criteria) this;
        }

        public Criteria andDCountIsNull() {
            addCriterion("D_Count is null");
            return (Criteria) this;
        }

        public Criteria andDCountIsNotNull() {
            addCriterion("D_Count is not null");
            return (Criteria) this;
        }

        public Criteria andDCountEqualTo(Integer value) {
            addCriterion("D_Count =", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountNotEqualTo(Integer value) {
            addCriterion("D_Count <>", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountGreaterThan(Integer value) {
            addCriterion("D_Count >", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Count >=", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountLessThan(Integer value) {
            addCriterion("D_Count <", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountLessThanOrEqualTo(Integer value) {
            addCriterion("D_Count <=", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountIn(List<Integer> values) {
            addCriterion("D_Count in", values, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountNotIn(List<Integer> values) {
            addCriterion("D_Count not in", values, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountBetween(Integer value1, Integer value2) {
            addCriterion("D_Count between", value1, value2, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Count not between", value1, value2, "dCount");
            return (Criteria) this;
        }

        public Criteria andDRecycleIsNull() {
            addCriterion("D_Recycle is null");
            return (Criteria) this;
        }

        public Criteria andDRecycleIsNotNull() {
            addCriterion("D_Recycle is not null");
            return (Criteria) this;
        }

        public Criteria andDRecycleEqualTo(Byte value) {
            addCriterion("D_Recycle =", value, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleNotEqualTo(Byte value) {
            addCriterion("D_Recycle <>", value, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleGreaterThan(Byte value) {
            addCriterion("D_Recycle >", value, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleGreaterThanOrEqualTo(Byte value) {
            addCriterion("D_Recycle >=", value, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleLessThan(Byte value) {
            addCriterion("D_Recycle <", value, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleLessThanOrEqualTo(Byte value) {
            addCriterion("D_Recycle <=", value, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleIn(List<Byte> values) {
            addCriterion("D_Recycle in", values, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleNotIn(List<Byte> values) {
            addCriterion("D_Recycle not in", values, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleBetween(Byte value1, Byte value2) {
            addCriterion("D_Recycle between", value1, value2, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycleNotBetween(Byte value1, Byte value2) {
            addCriterion("D_Recycle not between", value1, value2, "dRecycle");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeIsNull() {
            addCriterion("D_RecycleTime is null");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeIsNotNull() {
            addCriterion("D_RecycleTime is not null");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeEqualTo(Date value) {
            addCriterion("D_RecycleTime =", value, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeNotEqualTo(Date value) {
            addCriterion("D_RecycleTime <>", value, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeGreaterThan(Date value) {
            addCriterion("D_RecycleTime >", value, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_RecycleTime >=", value, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeLessThan(Date value) {
            addCriterion("D_RecycleTime <", value, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeLessThanOrEqualTo(Date value) {
            addCriterion("D_RecycleTime <=", value, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeIn(List<Date> values) {
            addCriterion("D_RecycleTime in", values, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeNotIn(List<Date> values) {
            addCriterion("D_RecycleTime not in", values, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeBetween(Date value1, Date value2) {
            addCriterion("D_RecycleTime between", value1, value2, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andDRecycletimeNotBetween(Date value1, Date value2) {
            addCriterion("D_RecycleTime not between", value1, value2, "dRecycletime");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andDescripIsNull() {
            addCriterion("descrip is null");
            return (Criteria) this;
        }

        public Criteria andDescripIsNotNull() {
            addCriterion("descrip is not null");
            return (Criteria) this;
        }

        public Criteria andDescripEqualTo(String value) {
            addCriterion("descrip =", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotEqualTo(String value) {
            addCriterion("descrip <>", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripGreaterThan(String value) {
            addCriterion("descrip >", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripGreaterThanOrEqualTo(String value) {
            addCriterion("descrip >=", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLessThan(String value) {
            addCriterion("descrip <", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLessThanOrEqualTo(String value) {
            addCriterion("descrip <=", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLike(String value) {
            addCriterion("descrip like", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotLike(String value) {
            addCriterion("descrip not like", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripIn(List<String> values) {
            addCriterion("descrip in", values, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotIn(List<String> values) {
            addCriterion("descrip not in", values, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripBetween(String value1, String value2) {
            addCriterion("descrip between", value1, value2, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotBetween(String value1, String value2) {
            addCriterion("descrip not between", value1, value2, "descrip");
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