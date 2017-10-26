package com.situ.crm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerLossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerLossExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCusNoIsNull() {
            addCriterion("cus_no is null");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNotNull() {
            addCriterion("cus_no is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoEqualTo(String value) {
            addCriterion("cus_no =", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotEqualTo(String value) {
            addCriterion("cus_no <>", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThan(String value) {
            addCriterion("cus_no >", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThanOrEqualTo(String value) {
            addCriterion("cus_no >=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThan(String value) {
            addCriterion("cus_no <", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThanOrEqualTo(String value) {
            addCriterion("cus_no <=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLike(String value) {
            addCriterion("cus_no like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotLike(String value) {
            addCriterion("cus_no not like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIn(List<String> values) {
            addCriterion("cus_no in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotIn(List<String> values) {
            addCriterion("cus_no not in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoBetween(String value1, String value2) {
            addCriterion("cus_no between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotBetween(String value1, String value2) {
            addCriterion("cus_no not between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusManagerIsNull() {
            addCriterion("cus_manager is null");
            return (Criteria) this;
        }

        public Criteria andCusManagerIsNotNull() {
            addCriterion("cus_manager is not null");
            return (Criteria) this;
        }

        public Criteria andCusManagerEqualTo(String value) {
            addCriterion("cus_manager =", value, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerNotEqualTo(String value) {
            addCriterion("cus_manager <>", value, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerGreaterThan(String value) {
            addCriterion("cus_manager >", value, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerGreaterThanOrEqualTo(String value) {
            addCriterion("cus_manager >=", value, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerLessThan(String value) {
            addCriterion("cus_manager <", value, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerLessThanOrEqualTo(String value) {
            addCriterion("cus_manager <=", value, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerLike(String value) {
            addCriterion("cus_manager like", value, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerNotLike(String value) {
            addCriterion("cus_manager not like", value, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerIn(List<String> values) {
            addCriterion("cus_manager in", values, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerNotIn(List<String> values) {
            addCriterion("cus_manager not in", values, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerBetween(String value1, String value2) {
            addCriterion("cus_manager between", value1, value2, "cusManager");
            return (Criteria) this;
        }

        public Criteria andCusManagerNotBetween(String value1, String value2) {
            addCriterion("cus_manager not between", value1, value2, "cusManager");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeIsNull() {
            addCriterion("last_order_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeIsNotNull() {
            addCriterion("last_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeEqualTo(Date value) {
            addCriterionForJDBCDate("last_order_time =", value, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_order_time <>", value, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("last_order_time >", value, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_order_time >=", value, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeLessThan(Date value) {
            addCriterionForJDBCDate("last_order_time <", value, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_order_time <=", value, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeIn(List<Date> values) {
            addCriterionForJDBCDate("last_order_time in", values, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_order_time not in", values, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_order_time between", value1, value2, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_order_time not between", value1, value2, "lastOrderTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeIsNull() {
            addCriterion("confirm_loss_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeIsNotNull() {
            addCriterion("confirm_loss_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeEqualTo(Date value) {
            addCriterionForJDBCDate("confirm_loss_time =", value, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("confirm_loss_time <>", value, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("confirm_loss_time >", value, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("confirm_loss_time >=", value, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeLessThan(Date value) {
            addCriterionForJDBCDate("confirm_loss_time <", value, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("confirm_loss_time <=", value, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeIn(List<Date> values) {
            addCriterionForJDBCDate("confirm_loss_time in", values, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("confirm_loss_time not in", values, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("confirm_loss_time between", value1, value2, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andConfirmLossTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("confirm_loss_time not between", value1, value2, "confirmLossTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLossReasonIsNull() {
            addCriterion("loss_reason is null");
            return (Criteria) this;
        }

        public Criteria andLossReasonIsNotNull() {
            addCriterion("loss_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLossReasonEqualTo(String value) {
            addCriterion("loss_reason =", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonNotEqualTo(String value) {
            addCriterion("loss_reason <>", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonGreaterThan(String value) {
            addCriterion("loss_reason >", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonGreaterThanOrEqualTo(String value) {
            addCriterion("loss_reason >=", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonLessThan(String value) {
            addCriterion("loss_reason <", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonLessThanOrEqualTo(String value) {
            addCriterion("loss_reason <=", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonLike(String value) {
            addCriterion("loss_reason like", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonNotLike(String value) {
            addCriterion("loss_reason not like", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonIn(List<String> values) {
            addCriterion("loss_reason in", values, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonNotIn(List<String> values) {
            addCriterion("loss_reason not in", values, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonBetween(String value1, String value2) {
            addCriterion("loss_reason between", value1, value2, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonNotBetween(String value1, String value2) {
            addCriterion("loss_reason not between", value1, value2, "lossReason");
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