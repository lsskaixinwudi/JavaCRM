package com.situ.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andKhnoIsNull() {
            addCriterion("khno is null");
            return (Criteria) this;
        }

        public Criteria andKhnoIsNotNull() {
            addCriterion("khno is not null");
            return (Criteria) this;
        }

        public Criteria andKhnoEqualTo(String value) {
            addCriterion("khno =", value, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoNotEqualTo(String value) {
            addCriterion("khno <>", value, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoGreaterThan(String value) {
            addCriterion("khno >", value, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoGreaterThanOrEqualTo(String value) {
            addCriterion("khno >=", value, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoLessThan(String value) {
            addCriterion("khno <", value, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoLessThanOrEqualTo(String value) {
            addCriterion("khno <=", value, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoLike(String value) {
            addCriterion("khno like", value, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoNotLike(String value) {
            addCriterion("khno not like", value, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoIn(List<String> values) {
            addCriterion("khno in", values, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoNotIn(List<String> values) {
            addCriterion("khno not in", values, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoBetween(String value1, String value2) {
            addCriterion("khno between", value1, value2, "khno");
            return (Criteria) this;
        }

        public Criteria andKhnoNotBetween(String value1, String value2) {
            addCriterion("khno not between", value1, value2, "khno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andXydIsNull() {
            addCriterion("xyd is null");
            return (Criteria) this;
        }

        public Criteria andXydIsNotNull() {
            addCriterion("xyd is not null");
            return (Criteria) this;
        }

        public Criteria andXydEqualTo(String value) {
            addCriterion("xyd =", value, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydNotEqualTo(String value) {
            addCriterion("xyd <>", value, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydGreaterThan(String value) {
            addCriterion("xyd >", value, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydGreaterThanOrEqualTo(String value) {
            addCriterion("xyd >=", value, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydLessThan(String value) {
            addCriterion("xyd <", value, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydLessThanOrEqualTo(String value) {
            addCriterion("xyd <=", value, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydLike(String value) {
            addCriterion("xyd like", value, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydNotLike(String value) {
            addCriterion("xyd not like", value, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydIn(List<String> values) {
            addCriterion("xyd in", values, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydNotIn(List<String> values) {
            addCriterion("xyd not in", values, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydBetween(String value1, String value2) {
            addCriterion("xyd between", value1, value2, "xyd");
            return (Criteria) this;
        }

        public Criteria andXydNotBetween(String value1, String value2) {
            addCriterion("xyd not between", value1, value2, "xyd");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andWebSiteIsNull() {
            addCriterion("web_site is null");
            return (Criteria) this;
        }

        public Criteria andWebSiteIsNotNull() {
            addCriterion("web_site is not null");
            return (Criteria) this;
        }

        public Criteria andWebSiteEqualTo(String value) {
            addCriterion("web_site =", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteNotEqualTo(String value) {
            addCriterion("web_site <>", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteGreaterThan(String value) {
            addCriterion("web_site >", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteGreaterThanOrEqualTo(String value) {
            addCriterion("web_site >=", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteLessThan(String value) {
            addCriterion("web_site <", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteLessThanOrEqualTo(String value) {
            addCriterion("web_site <=", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteLike(String value) {
            addCriterion("web_site like", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteNotLike(String value) {
            addCriterion("web_site not like", value, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteIn(List<String> values) {
            addCriterion("web_site in", values, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteNotIn(List<String> values) {
            addCriterion("web_site not in", values, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteBetween(String value1, String value2) {
            addCriterion("web_site between", value1, value2, "webSite");
            return (Criteria) this;
        }

        public Criteria andWebSiteNotBetween(String value1, String value2) {
            addCriterion("web_site not between", value1, value2, "webSite");
            return (Criteria) this;
        }

        public Criteria andYyzzzchIsNull() {
            addCriterion("yyzzzch is null");
            return (Criteria) this;
        }

        public Criteria andYyzzzchIsNotNull() {
            addCriterion("yyzzzch is not null");
            return (Criteria) this;
        }

        public Criteria andYyzzzchEqualTo(String value) {
            addCriterion("yyzzzch =", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchNotEqualTo(String value) {
            addCriterion("yyzzzch <>", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchGreaterThan(String value) {
            addCriterion("yyzzzch >", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchGreaterThanOrEqualTo(String value) {
            addCriterion("yyzzzch >=", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchLessThan(String value) {
            addCriterion("yyzzzch <", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchLessThanOrEqualTo(String value) {
            addCriterion("yyzzzch <=", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchLike(String value) {
            addCriterion("yyzzzch like", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchNotLike(String value) {
            addCriterion("yyzzzch not like", value, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchIn(List<String> values) {
            addCriterion("yyzzzch in", values, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchNotIn(List<String> values) {
            addCriterion("yyzzzch not in", values, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchBetween(String value1, String value2) {
            addCriterion("yyzzzch between", value1, value2, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andYyzzzchNotBetween(String value1, String value2) {
            addCriterion("yyzzzch not between", value1, value2, "yyzzzch");
            return (Criteria) this;
        }

        public Criteria andFrIsNull() {
            addCriterion("fr is null");
            return (Criteria) this;
        }

        public Criteria andFrIsNotNull() {
            addCriterion("fr is not null");
            return (Criteria) this;
        }

        public Criteria andFrEqualTo(String value) {
            addCriterion("fr =", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrNotEqualTo(String value) {
            addCriterion("fr <>", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrGreaterThan(String value) {
            addCriterion("fr >", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrGreaterThanOrEqualTo(String value) {
            addCriterion("fr >=", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrLessThan(String value) {
            addCriterion("fr <", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrLessThanOrEqualTo(String value) {
            addCriterion("fr <=", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrLike(String value) {
            addCriterion("fr like", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrNotLike(String value) {
            addCriterion("fr not like", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrIn(List<String> values) {
            addCriterion("fr in", values, "fr");
            return (Criteria) this;
        }

        public Criteria andFrNotIn(List<String> values) {
            addCriterion("fr not in", values, "fr");
            return (Criteria) this;
        }

        public Criteria andFrBetween(String value1, String value2) {
            addCriterion("fr between", value1, value2, "fr");
            return (Criteria) this;
        }

        public Criteria andFrNotBetween(String value1, String value2) {
            addCriterion("fr not between", value1, value2, "fr");
            return (Criteria) this;
        }

        public Criteria andZczjIsNull() {
            addCriterion("zczj is null");
            return (Criteria) this;
        }

        public Criteria andZczjIsNotNull() {
            addCriterion("zczj is not null");
            return (Criteria) this;
        }

        public Criteria andZczjEqualTo(String value) {
            addCriterion("zczj =", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotEqualTo(String value) {
            addCriterion("zczj <>", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjGreaterThan(String value) {
            addCriterion("zczj >", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjGreaterThanOrEqualTo(String value) {
            addCriterion("zczj >=", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLessThan(String value) {
            addCriterion("zczj <", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLessThanOrEqualTo(String value) {
            addCriterion("zczj <=", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLike(String value) {
            addCriterion("zczj like", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotLike(String value) {
            addCriterion("zczj not like", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjIn(List<String> values) {
            addCriterion("zczj in", values, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotIn(List<String> values) {
            addCriterion("zczj not in", values, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjBetween(String value1, String value2) {
            addCriterion("zczj between", value1, value2, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotBetween(String value1, String value2) {
            addCriterion("zczj not between", value1, value2, "zczj");
            return (Criteria) this;
        }

        public Criteria andNyyeIsNull() {
            addCriterion("nyye is null");
            return (Criteria) this;
        }

        public Criteria andNyyeIsNotNull() {
            addCriterion("nyye is not null");
            return (Criteria) this;
        }

        public Criteria andNyyeEqualTo(String value) {
            addCriterion("nyye =", value, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeNotEqualTo(String value) {
            addCriterion("nyye <>", value, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeGreaterThan(String value) {
            addCriterion("nyye >", value, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeGreaterThanOrEqualTo(String value) {
            addCriterion("nyye >=", value, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeLessThan(String value) {
            addCriterion("nyye <", value, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeLessThanOrEqualTo(String value) {
            addCriterion("nyye <=", value, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeLike(String value) {
            addCriterion("nyye like", value, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeNotLike(String value) {
            addCriterion("nyye not like", value, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeIn(List<String> values) {
            addCriterion("nyye in", values, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeNotIn(List<String> values) {
            addCriterion("nyye not in", values, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeBetween(String value1, String value2) {
            addCriterion("nyye between", value1, value2, "nyye");
            return (Criteria) this;
        }

        public Criteria andNyyeNotBetween(String value1, String value2) {
            addCriterion("nyye not between", value1, value2, "nyye");
            return (Criteria) this;
        }

        public Criteria andKhyhIsNull() {
            addCriterion("khyh is null");
            return (Criteria) this;
        }

        public Criteria andKhyhIsNotNull() {
            addCriterion("khyh is not null");
            return (Criteria) this;
        }

        public Criteria andKhyhEqualTo(String value) {
            addCriterion("khyh =", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotEqualTo(String value) {
            addCriterion("khyh <>", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhGreaterThan(String value) {
            addCriterion("khyh >", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhGreaterThanOrEqualTo(String value) {
            addCriterion("khyh >=", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLessThan(String value) {
            addCriterion("khyh <", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLessThanOrEqualTo(String value) {
            addCriterion("khyh <=", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhLike(String value) {
            addCriterion("khyh like", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotLike(String value) {
            addCriterion("khyh not like", value, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhIn(List<String> values) {
            addCriterion("khyh in", values, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotIn(List<String> values) {
            addCriterion("khyh not in", values, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhBetween(String value1, String value2) {
            addCriterion("khyh between", value1, value2, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhyhNotBetween(String value1, String value2) {
            addCriterion("khyh not between", value1, value2, "khyh");
            return (Criteria) this;
        }

        public Criteria andKhzhIsNull() {
            addCriterion("khzh is null");
            return (Criteria) this;
        }

        public Criteria andKhzhIsNotNull() {
            addCriterion("khzh is not null");
            return (Criteria) this;
        }

        public Criteria andKhzhEqualTo(String value) {
            addCriterion("khzh =", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhNotEqualTo(String value) {
            addCriterion("khzh <>", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhGreaterThan(String value) {
            addCriterion("khzh >", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhGreaterThanOrEqualTo(String value) {
            addCriterion("khzh >=", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhLessThan(String value) {
            addCriterion("khzh <", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhLessThanOrEqualTo(String value) {
            addCriterion("khzh <=", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhLike(String value) {
            addCriterion("khzh like", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhNotLike(String value) {
            addCriterion("khzh not like", value, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhIn(List<String> values) {
            addCriterion("khzh in", values, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhNotIn(List<String> values) {
            addCriterion("khzh not in", values, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhBetween(String value1, String value2) {
            addCriterion("khzh between", value1, value2, "khzh");
            return (Criteria) this;
        }

        public Criteria andKhzhNotBetween(String value1, String value2) {
            addCriterion("khzh not between", value1, value2, "khzh");
            return (Criteria) this;
        }

        public Criteria andDsdjhIsNull() {
            addCriterion("dsdjh is null");
            return (Criteria) this;
        }

        public Criteria andDsdjhIsNotNull() {
            addCriterion("dsdjh is not null");
            return (Criteria) this;
        }

        public Criteria andDsdjhEqualTo(String value) {
            addCriterion("dsdjh =", value, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhNotEqualTo(String value) {
            addCriterion("dsdjh <>", value, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhGreaterThan(String value) {
            addCriterion("dsdjh >", value, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhGreaterThanOrEqualTo(String value) {
            addCriterion("dsdjh >=", value, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhLessThan(String value) {
            addCriterion("dsdjh <", value, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhLessThanOrEqualTo(String value) {
            addCriterion("dsdjh <=", value, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhLike(String value) {
            addCriterion("dsdjh like", value, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhNotLike(String value) {
            addCriterion("dsdjh not like", value, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhIn(List<String> values) {
            addCriterion("dsdjh in", values, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhNotIn(List<String> values) {
            addCriterion("dsdjh not in", values, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhBetween(String value1, String value2) {
            addCriterion("dsdjh between", value1, value2, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andDsdjhNotBetween(String value1, String value2) {
            addCriterion("dsdjh not between", value1, value2, "dsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhIsNull() {
            addCriterion("gsdjh is null");
            return (Criteria) this;
        }

        public Criteria andGsdjhIsNotNull() {
            addCriterion("gsdjh is not null");
            return (Criteria) this;
        }

        public Criteria andGsdjhEqualTo(String value) {
            addCriterion("gsdjh =", value, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhNotEqualTo(String value) {
            addCriterion("gsdjh <>", value, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhGreaterThan(String value) {
            addCriterion("gsdjh >", value, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhGreaterThanOrEqualTo(String value) {
            addCriterion("gsdjh >=", value, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhLessThan(String value) {
            addCriterion("gsdjh <", value, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhLessThanOrEqualTo(String value) {
            addCriterion("gsdjh <=", value, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhLike(String value) {
            addCriterion("gsdjh like", value, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhNotLike(String value) {
            addCriterion("gsdjh not like", value, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhIn(List<String> values) {
            addCriterion("gsdjh in", values, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhNotIn(List<String> values) {
            addCriterion("gsdjh not in", values, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhBetween(String value1, String value2) {
            addCriterion("gsdjh between", value1, value2, "gsdjh");
            return (Criteria) this;
        }

        public Criteria andGsdjhNotBetween(String value1, String value2) {
            addCriterion("gsdjh not between", value1, value2, "gsdjh");
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