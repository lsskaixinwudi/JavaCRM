package com.situ.crm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleChanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleChanceExample() {
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

        public Criteria andChanceSourceIsNull() {
            addCriterion("chance_source is null");
            return (Criteria) this;
        }

        public Criteria andChanceSourceIsNotNull() {
            addCriterion("chance_source is not null");
            return (Criteria) this;
        }

        public Criteria andChanceSourceEqualTo(String value) {
            addCriterion("chance_source =", value, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceNotEqualTo(String value) {
            addCriterion("chance_source <>", value, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceGreaterThan(String value) {
            addCriterion("chance_source >", value, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceGreaterThanOrEqualTo(String value) {
            addCriterion("chance_source >=", value, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceLessThan(String value) {
            addCriterion("chance_source <", value, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceLessThanOrEqualTo(String value) {
            addCriterion("chance_source <=", value, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceLike(String value) {
            addCriterion("chance_source like", value, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceNotLike(String value) {
            addCriterion("chance_source not like", value, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceIn(List<String> values) {
            addCriterion("chance_source in", values, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceNotIn(List<String> values) {
            addCriterion("chance_source not in", values, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceBetween(String value1, String value2) {
            addCriterion("chance_source between", value1, value2, "chanceSource");
            return (Criteria) this;
        }

        public Criteria andChanceSourceNotBetween(String value1, String value2) {
            addCriterion("chance_source not between", value1, value2, "chanceSource");
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

        public Criteria andCgjlIsNull() {
            addCriterion("cgjl is null");
            return (Criteria) this;
        }

        public Criteria andCgjlIsNotNull() {
            addCriterion("cgjl is not null");
            return (Criteria) this;
        }

        public Criteria andCgjlEqualTo(Integer value) {
            addCriterion("cgjl =", value, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlNotEqualTo(Integer value) {
            addCriterion("cgjl <>", value, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlGreaterThan(Integer value) {
            addCriterion("cgjl >", value, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgjl >=", value, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlLessThan(Integer value) {
            addCriterion("cgjl <", value, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlLessThanOrEqualTo(Integer value) {
            addCriterion("cgjl <=", value, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlIn(List<Integer> values) {
            addCriterion("cgjl in", values, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlNotIn(List<Integer> values) {
            addCriterion("cgjl not in", values, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlBetween(Integer value1, Integer value2) {
            addCriterion("cgjl between", value1, value2, "cgjl");
            return (Criteria) this;
        }

        public Criteria andCgjlNotBetween(Integer value1, Integer value2) {
            addCriterion("cgjl not between", value1, value2, "cgjl");
            return (Criteria) this;
        }

        public Criteria andOverviewIsNull() {
            addCriterion("overview is null");
            return (Criteria) this;
        }

        public Criteria andOverviewIsNotNull() {
            addCriterion("overview is not null");
            return (Criteria) this;
        }

        public Criteria andOverviewEqualTo(String value) {
            addCriterion("overview =", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewNotEqualTo(String value) {
            addCriterion("overview <>", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewGreaterThan(String value) {
            addCriterion("overview >", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewGreaterThanOrEqualTo(String value) {
            addCriterion("overview >=", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewLessThan(String value) {
            addCriterion("overview <", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewLessThanOrEqualTo(String value) {
            addCriterion("overview <=", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewLike(String value) {
            addCriterion("overview like", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewNotLike(String value) {
            addCriterion("overview not like", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewIn(List<String> values) {
            addCriterion("overview in", values, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewNotIn(List<String> values) {
            addCriterion("overview not in", values, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewBetween(String value1, String value2) {
            addCriterion("overview between", value1, value2, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewNotBetween(String value1, String value2) {
            addCriterion("overview not between", value1, value2, "overview");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNull() {
            addCriterion("link_man is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNotNull() {
            addCriterion("link_man is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManEqualTo(String value) {
            addCriterion("link_man =", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotEqualTo(String value) {
            addCriterion("link_man <>", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThan(String value) {
            addCriterion("link_man >", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("link_man >=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThan(String value) {
            addCriterion("link_man <", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThanOrEqualTo(String value) {
            addCriterion("link_man <=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLike(String value) {
            addCriterion("link_man like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotLike(String value) {
            addCriterion("link_man not like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManIn(List<String> values) {
            addCriterion("link_man in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotIn(List<String> values) {
            addCriterion("link_man not in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManBetween(String value1, String value2) {
            addCriterion("link_man between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotBetween(String value1, String value2) {
            addCriterion("link_man not between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNull() {
            addCriterion("link_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNotNull() {
            addCriterion("link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneEqualTo(String value) {
            addCriterion("link_phone =", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotEqualTo(String value) {
            addCriterion("link_phone <>", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThan(String value) {
            addCriterion("link_phone >", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("link_phone >=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThan(String value) {
            addCriterion("link_phone <", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("link_phone <=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLike(String value) {
            addCriterion("link_phone like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotLike(String value) {
            addCriterion("link_phone not like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIn(List<String> values) {
            addCriterion("link_phone in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotIn(List<String> values) {
            addCriterion("link_phone not in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneBetween(String value1, String value2) {
            addCriterion("link_phone between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("link_phone not between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreateManIsNull() {
            addCriterion("create_man is null");
            return (Criteria) this;
        }

        public Criteria andCreateManIsNotNull() {
            addCriterion("create_man is not null");
            return (Criteria) this;
        }

        public Criteria andCreateManEqualTo(String value) {
            addCriterion("create_man =", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotEqualTo(String value) {
            addCriterion("create_man <>", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManGreaterThan(String value) {
            addCriterion("create_man >", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManGreaterThanOrEqualTo(String value) {
            addCriterion("create_man >=", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManLessThan(String value) {
            addCriterion("create_man <", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManLessThanOrEqualTo(String value) {
            addCriterion("create_man <=", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManLike(String value) {
            addCriterion("create_man like", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotLike(String value) {
            addCriterion("create_man not like", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManIn(List<String> values) {
            addCriterion("create_man in", values, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotIn(List<String> values) {
            addCriterion("create_man not in", values, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManBetween(String value1, String value2) {
            addCriterion("create_man between", value1, value2, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotBetween(String value1, String value2) {
            addCriterion("create_man not between", value1, value2, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAssignManIsNull() {
            addCriterion("assign_man is null");
            return (Criteria) this;
        }

        public Criteria andAssignManIsNotNull() {
            addCriterion("assign_man is not null");
            return (Criteria) this;
        }

        public Criteria andAssignManEqualTo(String value) {
            addCriterion("assign_man =", value, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManNotEqualTo(String value) {
            addCriterion("assign_man <>", value, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManGreaterThan(String value) {
            addCriterion("assign_man >", value, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManGreaterThanOrEqualTo(String value) {
            addCriterion("assign_man >=", value, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManLessThan(String value) {
            addCriterion("assign_man <", value, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManLessThanOrEqualTo(String value) {
            addCriterion("assign_man <=", value, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManLike(String value) {
            addCriterion("assign_man like", value, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManNotLike(String value) {
            addCriterion("assign_man not like", value, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManIn(List<String> values) {
            addCriterion("assign_man in", values, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManNotIn(List<String> values) {
            addCriterion("assign_man not in", values, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManBetween(String value1, String value2) {
            addCriterion("assign_man between", value1, value2, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignManNotBetween(String value1, String value2) {
            addCriterion("assign_man not between", value1, value2, "assignMan");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNull() {
            addCriterion("assign_time is null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNotNull() {
            addCriterion("assign_time is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeEqualTo(Date value) {
            addCriterion("assign_time =", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotEqualTo(Date value) {
            addCriterion("assign_time <>", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThan(Date value) {
            addCriterion("assign_time >", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("assign_time >=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThan(Date value) {
            addCriterion("assign_time <", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThanOrEqualTo(Date value) {
            addCriterion("assign_time <=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIn(List<Date> values) {
            addCriterion("assign_time in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotIn(List<Date> values) {
            addCriterion("assign_time not in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeBetween(Date value1, Date value2) {
            addCriterion("assign_time between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotBetween(Date value1, Date value2) {
            addCriterion("assign_time not between", value1, value2, "assignTime");
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

        public Criteria andDevResultIsNull() {
            addCriterion("dev_result is null");
            return (Criteria) this;
        }

        public Criteria andDevResultIsNotNull() {
            addCriterion("dev_result is not null");
            return (Criteria) this;
        }

        public Criteria andDevResultEqualTo(Integer value) {
            addCriterion("dev_result =", value, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultNotEqualTo(Integer value) {
            addCriterion("dev_result <>", value, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultGreaterThan(Integer value) {
            addCriterion("dev_result >", value, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_result >=", value, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultLessThan(Integer value) {
            addCriterion("dev_result <", value, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultLessThanOrEqualTo(Integer value) {
            addCriterion("dev_result <=", value, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultIn(List<Integer> values) {
            addCriterion("dev_result in", values, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultNotIn(List<Integer> values) {
            addCriterion("dev_result not in", values, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultBetween(Integer value1, Integer value2) {
            addCriterion("dev_result between", value1, value2, "devResult");
            return (Criteria) this;
        }

        public Criteria andDevResultNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_result not between", value1, value2, "devResult");
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