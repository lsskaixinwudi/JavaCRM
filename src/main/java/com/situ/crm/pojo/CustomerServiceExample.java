package com.situ.crm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerServiceExample() {
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

        public Criteria andServeTypeIsNull() {
            addCriterion("serve_type is null");
            return (Criteria) this;
        }

        public Criteria andServeTypeIsNotNull() {
            addCriterion("serve_type is not null");
            return (Criteria) this;
        }

        public Criteria andServeTypeEqualTo(String value) {
            addCriterion("serve_type =", value, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeNotEqualTo(String value) {
            addCriterion("serve_type <>", value, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeGreaterThan(String value) {
            addCriterion("serve_type >", value, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("serve_type >=", value, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeLessThan(String value) {
            addCriterion("serve_type <", value, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeLessThanOrEqualTo(String value) {
            addCriterion("serve_type <=", value, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeLike(String value) {
            addCriterion("serve_type like", value, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeNotLike(String value) {
            addCriterion("serve_type not like", value, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeIn(List<String> values) {
            addCriterion("serve_type in", values, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeNotIn(List<String> values) {
            addCriterion("serve_type not in", values, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeBetween(String value1, String value2) {
            addCriterion("serve_type between", value1, value2, "serveType");
            return (Criteria) this;
        }

        public Criteria andServeTypeNotBetween(String value1, String value2) {
            addCriterion("serve_type not between", value1, value2, "serveType");
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

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIsNull() {
            addCriterion("service_request is null");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIsNotNull() {
            addCriterion("service_request is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRequestEqualTo(String value) {
            addCriterion("service_request =", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotEqualTo(String value) {
            addCriterion("service_request <>", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestGreaterThan(String value) {
            addCriterion("service_request >", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestGreaterThanOrEqualTo(String value) {
            addCriterion("service_request >=", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLessThan(String value) {
            addCriterion("service_request <", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLessThanOrEqualTo(String value) {
            addCriterion("service_request <=", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLike(String value) {
            addCriterion("service_request like", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotLike(String value) {
            addCriterion("service_request not like", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIn(List<String> values) {
            addCriterion("service_request in", values, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotIn(List<String> values) {
            addCriterion("service_request not in", values, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestBetween(String value1, String value2) {
            addCriterion("service_request between", value1, value2, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotBetween(String value1, String value2) {
            addCriterion("service_request not between", value1, value2, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIsNull() {
            addCriterion("create_people is null");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIsNotNull() {
            addCriterion("create_people is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleEqualTo(String value) {
            addCriterion("create_people =", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotEqualTo(String value) {
            addCriterion("create_people <>", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleGreaterThan(String value) {
            addCriterion("create_people >", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("create_people >=", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLessThan(String value) {
            addCriterion("create_people <", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLessThanOrEqualTo(String value) {
            addCriterion("create_people <=", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLike(String value) {
            addCriterion("create_people like", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotLike(String value) {
            addCriterion("create_people not like", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIn(List<String> values) {
            addCriterion("create_people in", values, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotIn(List<String> values) {
            addCriterion("create_people not in", values, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleBetween(String value1, String value2) {
            addCriterion("create_people between", value1, value2, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotBetween(String value1, String value2) {
            addCriterion("create_people not between", value1, value2, "createPeople");
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

        public Criteria andAssignerIsNull() {
            addCriterion("assigner is null");
            return (Criteria) this;
        }

        public Criteria andAssignerIsNotNull() {
            addCriterion("assigner is not null");
            return (Criteria) this;
        }

        public Criteria andAssignerEqualTo(String value) {
            addCriterion("assigner =", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotEqualTo(String value) {
            addCriterion("assigner <>", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerGreaterThan(String value) {
            addCriterion("assigner >", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerGreaterThanOrEqualTo(String value) {
            addCriterion("assigner >=", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLessThan(String value) {
            addCriterion("assigner <", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLessThanOrEqualTo(String value) {
            addCriterion("assigner <=", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerLike(String value) {
            addCriterion("assigner like", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotLike(String value) {
            addCriterion("assigner not like", value, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerIn(List<String> values) {
            addCriterion("assigner in", values, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotIn(List<String> values) {
            addCriterion("assigner not in", values, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerBetween(String value1, String value2) {
            addCriterion("assigner between", value1, value2, "assigner");
            return (Criteria) this;
        }

        public Criteria andAssignerNotBetween(String value1, String value2) {
            addCriterion("assigner not between", value1, value2, "assigner");
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

        public Criteria andServiceProceIsNull() {
            addCriterion("service_proce is null");
            return (Criteria) this;
        }

        public Criteria andServiceProceIsNotNull() {
            addCriterion("service_proce is not null");
            return (Criteria) this;
        }

        public Criteria andServiceProceEqualTo(String value) {
            addCriterion("service_proce =", value, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceNotEqualTo(String value) {
            addCriterion("service_proce <>", value, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceGreaterThan(String value) {
            addCriterion("service_proce >", value, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceGreaterThanOrEqualTo(String value) {
            addCriterion("service_proce >=", value, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceLessThan(String value) {
            addCriterion("service_proce <", value, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceLessThanOrEqualTo(String value) {
            addCriterion("service_proce <=", value, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceLike(String value) {
            addCriterion("service_proce like", value, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceNotLike(String value) {
            addCriterion("service_proce not like", value, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceIn(List<String> values) {
            addCriterion("service_proce in", values, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceNotIn(List<String> values) {
            addCriterion("service_proce not in", values, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceBetween(String value1, String value2) {
            addCriterion("service_proce between", value1, value2, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProceNotBetween(String value1, String value2) {
            addCriterion("service_proce not between", value1, value2, "serviceProce");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleIsNull() {
            addCriterion("service_proce_people is null");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleIsNotNull() {
            addCriterion("service_proce_people is not null");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleEqualTo(String value) {
            addCriterion("service_proce_people =", value, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleNotEqualTo(String value) {
            addCriterion("service_proce_people <>", value, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleGreaterThan(String value) {
            addCriterion("service_proce_people >", value, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("service_proce_people >=", value, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleLessThan(String value) {
            addCriterion("service_proce_people <", value, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleLessThanOrEqualTo(String value) {
            addCriterion("service_proce_people <=", value, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleLike(String value) {
            addCriterion("service_proce_people like", value, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleNotLike(String value) {
            addCriterion("service_proce_people not like", value, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleIn(List<String> values) {
            addCriterion("service_proce_people in", values, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleNotIn(List<String> values) {
            addCriterion("service_proce_people not in", values, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleBetween(String value1, String value2) {
            addCriterion("service_proce_people between", value1, value2, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProcePeopleNotBetween(String value1, String value2) {
            addCriterion("service_proce_people not between", value1, value2, "serviceProcePeople");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeIsNull() {
            addCriterion("service_proce_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeIsNotNull() {
            addCriterion("service_proce_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeEqualTo(Date value) {
            addCriterion("service_proce_time =", value, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeNotEqualTo(Date value) {
            addCriterion("service_proce_time <>", value, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeGreaterThan(Date value) {
            addCriterion("service_proce_time >", value, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("service_proce_time >=", value, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeLessThan(Date value) {
            addCriterion("service_proce_time <", value, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeLessThanOrEqualTo(Date value) {
            addCriterion("service_proce_time <=", value, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeIn(List<Date> values) {
            addCriterion("service_proce_time in", values, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeNotIn(List<Date> values) {
            addCriterion("service_proce_time not in", values, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeBetween(Date value1, Date value2) {
            addCriterion("service_proce_time between", value1, value2, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceTimeNotBetween(Date value1, Date value2) {
            addCriterion("service_proce_time not between", value1, value2, "serviceProceTime");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultIsNull() {
            addCriterion("service_proce_result is null");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultIsNotNull() {
            addCriterion("service_proce_result is not null");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultEqualTo(String value) {
            addCriterion("service_proce_result =", value, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultNotEqualTo(String value) {
            addCriterion("service_proce_result <>", value, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultGreaterThan(String value) {
            addCriterion("service_proce_result >", value, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultGreaterThanOrEqualTo(String value) {
            addCriterion("service_proce_result >=", value, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultLessThan(String value) {
            addCriterion("service_proce_result <", value, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultLessThanOrEqualTo(String value) {
            addCriterion("service_proce_result <=", value, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultLike(String value) {
            addCriterion("service_proce_result like", value, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultNotLike(String value) {
            addCriterion("service_proce_result not like", value, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultIn(List<String> values) {
            addCriterion("service_proce_result in", values, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultNotIn(List<String> values) {
            addCriterion("service_proce_result not in", values, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultBetween(String value1, String value2) {
            addCriterion("service_proce_result between", value1, value2, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andServiceProceResultNotBetween(String value1, String value2) {
            addCriterion("service_proce_result not between", value1, value2, "serviceProceResult");
            return (Criteria) this;
        }

        public Criteria andMydIsNull() {
            addCriterion("myd is null");
            return (Criteria) this;
        }

        public Criteria andMydIsNotNull() {
            addCriterion("myd is not null");
            return (Criteria) this;
        }

        public Criteria andMydEqualTo(String value) {
            addCriterion("myd =", value, "myd");
            return (Criteria) this;
        }

        public Criteria andMydNotEqualTo(String value) {
            addCriterion("myd <>", value, "myd");
            return (Criteria) this;
        }

        public Criteria andMydGreaterThan(String value) {
            addCriterion("myd >", value, "myd");
            return (Criteria) this;
        }

        public Criteria andMydGreaterThanOrEqualTo(String value) {
            addCriterion("myd >=", value, "myd");
            return (Criteria) this;
        }

        public Criteria andMydLessThan(String value) {
            addCriterion("myd <", value, "myd");
            return (Criteria) this;
        }

        public Criteria andMydLessThanOrEqualTo(String value) {
            addCriterion("myd <=", value, "myd");
            return (Criteria) this;
        }

        public Criteria andMydLike(String value) {
            addCriterion("myd like", value, "myd");
            return (Criteria) this;
        }

        public Criteria andMydNotLike(String value) {
            addCriterion("myd not like", value, "myd");
            return (Criteria) this;
        }

        public Criteria andMydIn(List<String> values) {
            addCriterion("myd in", values, "myd");
            return (Criteria) this;
        }

        public Criteria andMydNotIn(List<String> values) {
            addCriterion("myd not in", values, "myd");
            return (Criteria) this;
        }

        public Criteria andMydBetween(String value1, String value2) {
            addCriterion("myd between", value1, value2, "myd");
            return (Criteria) this;
        }

        public Criteria andMydNotBetween(String value1, String value2) {
            addCriterion("myd not between", value1, value2, "myd");
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