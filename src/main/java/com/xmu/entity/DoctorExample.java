package com.xmu.entity;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public DoctorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
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
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Long value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Long value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Long value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Long value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Long value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Long value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Long> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Long> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Long value1, Long value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Long value1, Long value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNull() {
            addCriterion("d_type is null");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNotNull() {
            addCriterion("d_type is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeEqualTo(String value) {
            addCriterion("d_type =", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotEqualTo(String value) {
            addCriterion("d_type <>", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThan(String value) {
            addCriterion("d_type >", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThanOrEqualTo(String value) {
            addCriterion("d_type >=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThan(String value) {
            addCriterion("d_type <", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThanOrEqualTo(String value) {
            addCriterion("d_type <=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLike(String value) {
            addCriterion("d_type like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotLike(String value) {
            addCriterion("d_type not like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeIn(List<String> values) {
            addCriterion("d_type in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotIn(List<String> values) {
            addCriterion("d_type not in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeBetween(String value1, String value2) {
            addCriterion("d_type between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotBetween(String value1, String value2) {
            addCriterion("d_type not between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDDescIsNull() {
            addCriterion("d_desc is null");
            return (Criteria) this;
        }

        public Criteria andDDescIsNotNull() {
            addCriterion("d_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDDescEqualTo(String value) {
            addCriterion("d_desc =", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotEqualTo(String value) {
            addCriterion("d_desc <>", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThan(String value) {
            addCriterion("d_desc >", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThanOrEqualTo(String value) {
            addCriterion("d_desc >=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThan(String value) {
            addCriterion("d_desc <", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThanOrEqualTo(String value) {
            addCriterion("d_desc <=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLike(String value) {
            addCriterion("d_desc like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotLike(String value) {
            addCriterion("d_desc not like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescIn(List<String> values) {
            addCriterion("d_desc in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotIn(List<String> values) {
            addCriterion("d_desc not in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescBetween(String value1, String value2) {
            addCriterion("d_desc between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotBetween(String value1, String value2) {
            addCriterion("d_desc not between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDPhoneIsNull() {
            addCriterion("d_phone is null");
            return (Criteria) this;
        }

        public Criteria andDPhoneIsNotNull() {
            addCriterion("d_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDPhoneEqualTo(String value) {
            addCriterion("d_phone =", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotEqualTo(String value) {
            addCriterion("d_phone <>", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneGreaterThan(String value) {
            addCriterion("d_phone >", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("d_phone >=", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLessThan(String value) {
            addCriterion("d_phone <", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLessThanOrEqualTo(String value) {
            addCriterion("d_phone <=", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLike(String value) {
            addCriterion("d_phone like", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotLike(String value) {
            addCriterion("d_phone not like", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneIn(List<String> values) {
            addCriterion("d_phone in", values, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotIn(List<String> values) {
            addCriterion("d_phone not in", values, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneBetween(String value1, String value2) {
            addCriterion("d_phone between", value1, value2, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotBetween(String value1, String value2) {
            addCriterion("d_phone not between", value1, value2, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDRidIsNull() {
            addCriterion("d_rid is null");
            return (Criteria) this;
        }

        public Criteria andDRidIsNotNull() {
            addCriterion("d_rid is not null");
            return (Criteria) this;
        }

        public Criteria andDRidEqualTo(Long value) {
            addCriterion("d_rid =", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidNotEqualTo(Long value) {
            addCriterion("d_rid <>", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidGreaterThan(Long value) {
            addCriterion("d_rid >", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidGreaterThanOrEqualTo(Long value) {
            addCriterion("d_rid >=", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidLessThan(Long value) {
            addCriterion("d_rid <", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidLessThanOrEqualTo(Long value) {
            addCriterion("d_rid <=", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidIn(List<Long> values) {
            addCriterion("d_rid in", values, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidNotIn(List<Long> values) {
            addCriterion("d_rid not in", values, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidBetween(Long value1, Long value2) {
            addCriterion("d_rid between", value1, value2, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidNotBetween(Long value1, Long value2) {
            addCriterion("d_rid not between", value1, value2, "dRid");
            return (Criteria) this;
        }

        public Criteria andDHidIsNull() {
            addCriterion("d_hid is null");
            return (Criteria) this;
        }

        public Criteria andDHidIsNotNull() {
            addCriterion("d_hid is not null");
            return (Criteria) this;
        }

        public Criteria andDHidEqualTo(Long value) {
            addCriterion("d_hid =", value, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidNotEqualTo(Long value) {
            addCriterion("d_hid <>", value, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidGreaterThan(Long value) {
            addCriterion("d_hid >", value, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidGreaterThanOrEqualTo(Long value) {
            addCriterion("d_hid >=", value, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidLessThan(Long value) {
            addCriterion("d_hid <", value, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidLessThanOrEqualTo(Long value) {
            addCriterion("d_hid <=", value, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidIn(List<Long> values) {
            addCriterion("d_hid in", values, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidNotIn(List<Long> values) {
            addCriterion("d_hid not in", values, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidBetween(Long value1, Long value2) {
            addCriterion("d_hid between", value1, value2, "dHid");
            return (Criteria) this;
        }

        public Criteria andDHidNotBetween(Long value1, Long value2) {
            addCriterion("d_hid not between", value1, value2, "dHid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table doctor
     *
     * @mbggenerated do_not_delete_during_merge Fri Jul 10 15:53:47 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table doctor
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
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