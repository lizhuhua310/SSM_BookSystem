package com.hisen.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public AppointmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
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
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("user_number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("user_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(Integer value) {
            addCriterion("user_number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(Integer value) {
            addCriterion("user_number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(Integer value) {
            addCriterion("user_number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(Integer value) {
            addCriterion("user_number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(Integer value) {
            addCriterion("user_number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<Integer> values) {
            addCriterion("user_number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<Integer> values) {
            addCriterion("user_number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(Integer value1, Integer value2) {
            addCriterion("user_number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("user_number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNull() {
            addCriterion("appointment_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNotNull() {
            addCriterion("appointment_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeEqualTo(Date value) {
            addCriterion("appointment_time =", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotEqualTo(Date value) {
            addCriterion("appointment_time <>", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThan(Date value) {
            addCriterion("appointment_time >", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appointment_time >=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThan(Date value) {
            addCriterion("appointment_time <", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("appointment_time <=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIn(List<Date> values) {
            addCriterion("appointment_time in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotIn(List<Date> values) {
            addCriterion("appointment_time not in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeBetween(Date value1, Date value2) {
            addCriterion("appointment_time between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("appointment_time not between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeIsNull() {
            addCriterion("expect_return_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeIsNotNull() {
            addCriterion("expect_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeEqualTo(Date value) {
            addCriterion("expect_return_time =", value, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeNotEqualTo(Date value) {
            addCriterion("expect_return_time <>", value, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeGreaterThan(Date value) {
            addCriterion("expect_return_time >", value, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_return_time >=", value, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeLessThan(Date value) {
            addCriterion("expect_return_time <", value, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("expect_return_time <=", value, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeIn(List<Date> values) {
            addCriterion("expect_return_time in", values, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeNotIn(List<Date> values) {
            addCriterion("expect_return_time not in", values, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeBetween(Date value1, Date value2) {
            addCriterion("expect_return_time between", value1, value2, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andExpectReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("expect_return_time not between", value1, value2, "expectReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeIsNull() {
            addCriterion("real_return_time is null");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeIsNotNull() {
            addCriterion("real_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeEqualTo(Date value) {
            addCriterion("real_return_time =", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeNotEqualTo(Date value) {
            addCriterion("real_return_time <>", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeGreaterThan(Date value) {
            addCriterion("real_return_time >", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_return_time >=", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeLessThan(Date value) {
            addCriterion("real_return_time <", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_return_time <=", value, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeIn(List<Date> values) {
            addCriterion("real_return_time in", values, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeNotIn(List<Date> values) {
            addCriterion("real_return_time not in", values, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeBetween(Date value1, Date value2) {
            addCriterion("real_return_time between", value1, value2, "realReturnTime");
            return (Criteria) this;
        }

        public Criteria andRealReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_return_time not between", value1, value2, "realReturnTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table appointment
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 02 14:22:28 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table appointment
     *
     * @mbggenerated Wed Aug 02 14:22:28 CST 2017
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