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

        public Criteria andCustomerNoIsNull() {
            addCriterion("customer_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("customer_no =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("customer_no <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("customer_no >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_no >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("customer_no <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("customer_no <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("customer_no like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("customer_no not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("customer_no in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("customer_no not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("customer_no between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("customer_no not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIsNull() {
            addCriterion("customer_manager is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIsNotNull() {
            addCriterion("customer_manager is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerEqualTo(String value) {
            addCriterion("customer_manager =", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotEqualTo(String value) {
            addCriterion("customer_manager <>", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerGreaterThan(String value) {
            addCriterion("customer_manager >", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerGreaterThanOrEqualTo(String value) {
            addCriterion("customer_manager >=", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLessThan(String value) {
            addCriterion("customer_manager <", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLessThanOrEqualTo(String value) {
            addCriterion("customer_manager <=", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerLike(String value) {
            addCriterion("customer_manager like", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotLike(String value) {
            addCriterion("customer_manager not like", value, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerIn(List<String> values) {
            addCriterion("customer_manager in", values, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotIn(List<String> values) {
            addCriterion("customer_manager not in", values, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerBetween(String value1, String value2) {
            addCriterion("customer_manager between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerNotBetween(String value1, String value2) {
            addCriterion("customer_manager not between", value1, value2, "customerManager");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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