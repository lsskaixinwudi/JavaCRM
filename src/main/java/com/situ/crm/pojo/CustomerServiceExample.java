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

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andServiceDealIsNull() {
            addCriterion("service_deal is null");
            return (Criteria) this;
        }

        public Criteria andServiceDealIsNotNull() {
            addCriterion("service_deal is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDealEqualTo(String value) {
            addCriterion("service_deal =", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotEqualTo(String value) {
            addCriterion("service_deal <>", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealGreaterThan(String value) {
            addCriterion("service_deal >", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealGreaterThanOrEqualTo(String value) {
            addCriterion("service_deal >=", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLessThan(String value) {
            addCriterion("service_deal <", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLessThanOrEqualTo(String value) {
            addCriterion("service_deal <=", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLike(String value) {
            addCriterion("service_deal like", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotLike(String value) {
            addCriterion("service_deal not like", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealIn(List<String> values) {
            addCriterion("service_deal in", values, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotIn(List<String> values) {
            addCriterion("service_deal not in", values, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealBetween(String value1, String value2) {
            addCriterion("service_deal between", value1, value2, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotBetween(String value1, String value2) {
            addCriterion("service_deal not between", value1, value2, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleIsNull() {
            addCriterion("service_deal_people is null");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleIsNotNull() {
            addCriterion("service_deal_people is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleEqualTo(String value) {
            addCriterion("service_deal_people =", value, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleNotEqualTo(String value) {
            addCriterion("service_deal_people <>", value, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleGreaterThan(String value) {
            addCriterion("service_deal_people >", value, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("service_deal_people >=", value, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleLessThan(String value) {
            addCriterion("service_deal_people <", value, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleLessThanOrEqualTo(String value) {
            addCriterion("service_deal_people <=", value, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleLike(String value) {
            addCriterion("service_deal_people like", value, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleNotLike(String value) {
            addCriterion("service_deal_people not like", value, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleIn(List<String> values) {
            addCriterion("service_deal_people in", values, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleNotIn(List<String> values) {
            addCriterion("service_deal_people not in", values, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleBetween(String value1, String value2) {
            addCriterion("service_deal_people between", value1, value2, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealPeopleNotBetween(String value1, String value2) {
            addCriterion("service_deal_people not between", value1, value2, "serviceDealPeople");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeIsNull() {
            addCriterion("service_deal_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeIsNotNull() {
            addCriterion("service_deal_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeEqualTo(Date value) {
            addCriterion("service_deal_time =", value, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeNotEqualTo(Date value) {
            addCriterion("service_deal_time <>", value, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeGreaterThan(Date value) {
            addCriterion("service_deal_time >", value, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("service_deal_time >=", value, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeLessThan(Date value) {
            addCriterion("service_deal_time <", value, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("service_deal_time <=", value, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeIn(List<Date> values) {
            addCriterion("service_deal_time in", values, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeNotIn(List<Date> values) {
            addCriterion("service_deal_time not in", values, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeBetween(Date value1, Date value2) {
            addCriterion("service_deal_time between", value1, value2, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("service_deal_time not between", value1, value2, "serviceDealTime");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultIsNull() {
            addCriterion("service_deal_result is null");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultIsNotNull() {
            addCriterion("service_deal_result is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultEqualTo(String value) {
            addCriterion("service_deal_result =", value, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultNotEqualTo(String value) {
            addCriterion("service_deal_result <>", value, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultGreaterThan(String value) {
            addCriterion("service_deal_result >", value, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultGreaterThanOrEqualTo(String value) {
            addCriterion("service_deal_result >=", value, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultLessThan(String value) {
            addCriterion("service_deal_result <", value, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultLessThanOrEqualTo(String value) {
            addCriterion("service_deal_result <=", value, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultLike(String value) {
            addCriterion("service_deal_result like", value, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultNotLike(String value) {
            addCriterion("service_deal_result not like", value, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultIn(List<String> values) {
            addCriterion("service_deal_result in", values, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultNotIn(List<String> values) {
            addCriterion("service_deal_result not in", values, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultBetween(String value1, String value2) {
            addCriterion("service_deal_result between", value1, value2, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andServiceDealResultNotBetween(String value1, String value2) {
            addCriterion("service_deal_result not between", value1, value2, "serviceDealResult");
            return (Criteria) this;
        }

        public Criteria andSatisfyIsNull() {
            addCriterion("satisfy is null");
            return (Criteria) this;
        }

        public Criteria andSatisfyIsNotNull() {
            addCriterion("satisfy is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfyEqualTo(String value) {
            addCriterion("satisfy =", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotEqualTo(String value) {
            addCriterion("satisfy <>", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyGreaterThan(String value) {
            addCriterion("satisfy >", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyGreaterThanOrEqualTo(String value) {
            addCriterion("satisfy >=", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLessThan(String value) {
            addCriterion("satisfy <", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLessThanOrEqualTo(String value) {
            addCriterion("satisfy <=", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLike(String value) {
            addCriterion("satisfy like", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotLike(String value) {
            addCriterion("satisfy not like", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyIn(List<String> values) {
            addCriterion("satisfy in", values, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotIn(List<String> values) {
            addCriterion("satisfy not in", values, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyBetween(String value1, String value2) {
            addCriterion("satisfy between", value1, value2, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotBetween(String value1, String value2) {
            addCriterion("satisfy not between", value1, value2, "satisfy");
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