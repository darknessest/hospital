package com.xmu.entity;

import java.util.ArrayList;
import java.util.List;

public class HospitalExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public HospitalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
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
     * This method corresponds to the database table hospital
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
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Jul 10 15:53:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
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
     * This class corresponds to the database table hospital
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Long value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Long value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Long value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Long value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Long value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Long value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Long> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Long> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Long value1, Long value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Long value1, Long value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHAccountIsNull() {
            addCriterion("h_account is null");
            return (Criteria) this;
        }

        public Criteria andHAccountIsNotNull() {
            addCriterion("h_account is not null");
            return (Criteria) this;
        }

        public Criteria andHAccountEqualTo(String value) {
            addCriterion("h_account =", value, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountNotEqualTo(String value) {
            addCriterion("h_account <>", value, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountGreaterThan(String value) {
            addCriterion("h_account >", value, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountGreaterThanOrEqualTo(String value) {
            addCriterion("h_account >=", value, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountLessThan(String value) {
            addCriterion("h_account <", value, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountLessThanOrEqualTo(String value) {
            addCriterion("h_account <=", value, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountLike(String value) {
            addCriterion("h_account like", value, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountNotLike(String value) {
            addCriterion("h_account not like", value, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountIn(List<String> values) {
            addCriterion("h_account in", values, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountNotIn(List<String> values) {
            addCriterion("h_account not in", values, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountBetween(String value1, String value2) {
            addCriterion("h_account between", value1, value2, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHAccountNotBetween(String value1, String value2) {
            addCriterion("h_account not between", value1, value2, "hAccount");
            return (Criteria) this;
        }

        public Criteria andHPasswordIsNull() {
            addCriterion("h_password is null");
            return (Criteria) this;
        }

        public Criteria andHPasswordIsNotNull() {
            addCriterion("h_password is not null");
            return (Criteria) this;
        }

        public Criteria andHPasswordEqualTo(String value) {
            addCriterion("h_password =", value, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordNotEqualTo(String value) {
            addCriterion("h_password <>", value, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordGreaterThan(String value) {
            addCriterion("h_password >", value, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("h_password >=", value, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordLessThan(String value) {
            addCriterion("h_password <", value, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordLessThanOrEqualTo(String value) {
            addCriterion("h_password <=", value, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordLike(String value) {
            addCriterion("h_password like", value, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordNotLike(String value) {
            addCriterion("h_password not like", value, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordIn(List<String> values) {
            addCriterion("h_password in", values, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordNotIn(List<String> values) {
            addCriterion("h_password not in", values, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordBetween(String value1, String value2) {
            addCriterion("h_password between", value1, value2, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHPasswordNotBetween(String value1, String value2) {
            addCriterion("h_password not between", value1, value2, "hPassword");
            return (Criteria) this;
        }

        public Criteria andHNameIsNull() {
            addCriterion("h_name is null");
            return (Criteria) this;
        }

        public Criteria andHNameIsNotNull() {
            addCriterion("h_name is not null");
            return (Criteria) this;
        }

        public Criteria andHNameEqualTo(String value) {
            addCriterion("h_name =", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotEqualTo(String value) {
            addCriterion("h_name <>", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThan(String value) {
            addCriterion("h_name >", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_name >=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThan(String value) {
            addCriterion("h_name <", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThanOrEqualTo(String value) {
            addCriterion("h_name <=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLike(String value) {
            addCriterion("h_name like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotLike(String value) {
            addCriterion("h_name not like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameIn(List<String> values) {
            addCriterion("h_name in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotIn(List<String> values) {
            addCriterion("h_name not in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameBetween(String value1, String value2) {
            addCriterion("h_name between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotBetween(String value1, String value2) {
            addCriterion("h_name not between", value1, value2, "hName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hospital
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
     * This class corresponds to the database table hospital
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