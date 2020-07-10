package com.xmu.hospital.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
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
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Long value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Long value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Long value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Long value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Long value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Long value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Long> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Long> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Long value1, Long value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Long value1, Long value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andODidIsNull() {
            addCriterion("o_did is null");
            return (Criteria) this;
        }

        public Criteria andODidIsNotNull() {
            addCriterion("o_did is not null");
            return (Criteria) this;
        }

        public Criteria andODidEqualTo(Long value) {
            addCriterion("o_did =", value, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidNotEqualTo(Long value) {
            addCriterion("o_did <>", value, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidGreaterThan(Long value) {
            addCriterion("o_did >", value, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidGreaterThanOrEqualTo(Long value) {
            addCriterion("o_did >=", value, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidLessThan(Long value) {
            addCriterion("o_did <", value, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidLessThanOrEqualTo(Long value) {
            addCriterion("o_did <=", value, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidIn(List<Long> values) {
            addCriterion("o_did in", values, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidNotIn(List<Long> values) {
            addCriterion("o_did not in", values, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidBetween(Long value1, Long value2) {
            addCriterion("o_did between", value1, value2, "oDid");
            return (Criteria) this;
        }

        public Criteria andODidNotBetween(Long value1, Long value2) {
            addCriterion("o_did not between", value1, value2, "oDid");
            return (Criteria) this;
        }

        public Criteria andOHidIsNull() {
            addCriterion("o_hid is null");
            return (Criteria) this;
        }

        public Criteria andOHidIsNotNull() {
            addCriterion("o_hid is not null");
            return (Criteria) this;
        }

        public Criteria andOHidEqualTo(Long value) {
            addCriterion("o_hid =", value, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidNotEqualTo(Long value) {
            addCriterion("o_hid <>", value, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidGreaterThan(Long value) {
            addCriterion("o_hid >", value, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidGreaterThanOrEqualTo(Long value) {
            addCriterion("o_hid >=", value, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidLessThan(Long value) {
            addCriterion("o_hid <", value, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidLessThanOrEqualTo(Long value) {
            addCriterion("o_hid <=", value, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidIn(List<Long> values) {
            addCriterion("o_hid in", values, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidNotIn(List<Long> values) {
            addCriterion("o_hid not in", values, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidBetween(Long value1, Long value2) {
            addCriterion("o_hid between", value1, value2, "oHid");
            return (Criteria) this;
        }

        public Criteria andOHidNotBetween(Long value1, Long value2) {
            addCriterion("o_hid not between", value1, value2, "oHid");
            return (Criteria) this;
        }

        public Criteria andOUseridIsNull() {
            addCriterion("o_userid is null");
            return (Criteria) this;
        }

        public Criteria andOUseridIsNotNull() {
            addCriterion("o_userid is not null");
            return (Criteria) this;
        }

        public Criteria andOUseridEqualTo(Long value) {
            addCriterion("o_userid =", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridNotEqualTo(Long value) {
            addCriterion("o_userid <>", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridGreaterThan(Long value) {
            addCriterion("o_userid >", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("o_userid >=", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridLessThan(Long value) {
            addCriterion("o_userid <", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridLessThanOrEqualTo(Long value) {
            addCriterion("o_userid <=", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridIn(List<Long> values) {
            addCriterion("o_userid in", values, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridNotIn(List<Long> values) {
            addCriterion("o_userid not in", values, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridBetween(Long value1, Long value2) {
            addCriterion("o_userid between", value1, value2, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridNotBetween(Long value1, Long value2) {
            addCriterion("o_userid not between", value1, value2, "oUserid");
            return (Criteria) this;
        }

        public Criteria andORaddressIsNull() {
            addCriterion("o_raddress is null");
            return (Criteria) this;
        }

        public Criteria andORaddressIsNotNull() {
            addCriterion("o_raddress is not null");
            return (Criteria) this;
        }

        public Criteria andORaddressEqualTo(String value) {
            addCriterion("o_raddress =", value, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressNotEqualTo(String value) {
            addCriterion("o_raddress <>", value, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressGreaterThan(String value) {
            addCriterion("o_raddress >", value, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressGreaterThanOrEqualTo(String value) {
            addCriterion("o_raddress >=", value, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressLessThan(String value) {
            addCriterion("o_raddress <", value, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressLessThanOrEqualTo(String value) {
            addCriterion("o_raddress <=", value, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressLike(String value) {
            addCriterion("o_raddress like", value, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressNotLike(String value) {
            addCriterion("o_raddress not like", value, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressIn(List<String> values) {
            addCriterion("o_raddress in", values, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressNotIn(List<String> values) {
            addCriterion("o_raddress not in", values, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressBetween(String value1, String value2) {
            addCriterion("o_raddress between", value1, value2, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andORaddressNotBetween(String value1, String value2) {
            addCriterion("o_raddress not between", value1, value2, "oRaddress");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(Byte value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(Byte value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(Byte value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(Byte value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(Byte value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<Byte> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<Byte> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(Byte value1, Byte value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andODateIsNull() {
            addCriterion("o_date is null");
            return (Criteria) this;
        }

        public Criteria andODateIsNotNull() {
            addCriterion("o_date is not null");
            return (Criteria) this;
        }

        public Criteria andODateEqualTo(Date value) {
            addCriterion("o_date =", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotEqualTo(Date value) {
            addCriterion("o_date <>", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThan(Date value) {
            addCriterion("o_date >", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThanOrEqualTo(Date value) {
            addCriterion("o_date >=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThan(Date value) {
            addCriterion("o_date <", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThanOrEqualTo(Date value) {
            addCriterion("o_date <=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateIn(List<Date> values) {
            addCriterion("o_date in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotIn(List<Date> values) {
            addCriterion("o_date not in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateBetween(Date value1, Date value2) {
            addCriterion("o_date between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotBetween(Date value1, Date value2) {
            addCriterion("o_date not between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNull() {
            addCriterion("o_price is null");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNotNull() {
            addCriterion("o_price is not null");
            return (Criteria) this;
        }

        public Criteria andOPriceEqualTo(BigDecimal value) {
            addCriterion("o_price =", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotEqualTo(BigDecimal value) {
            addCriterion("o_price <>", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThan(BigDecimal value) {
            addCriterion("o_price >", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("o_price >=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThan(BigDecimal value) {
            addCriterion("o_price <", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("o_price <=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceIn(List<BigDecimal> values) {
            addCriterion("o_price in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotIn(List<BigDecimal> values) {
            addCriterion("o_price not in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("o_price between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("o_price not between", value1, value2, "oPrice");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated do_not_delete_during_merge Fri Jul 10 10:17:58 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated Fri Jul 10 10:17:58 CST 2020
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