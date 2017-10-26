package com.situ.crm.pojo;

import java.util.Date;

public class CustomerService {
    private Integer id;

    private String serveType;

    private String overview;

    private String customer;

    private String state;

    private String serviceRequest;

    private String createPeople;

    private Date createTime;

    private String assigner;

    private Date assignTime;

    private String serviceProce;

    private String serviceProcePeople;

    private Date serviceProceTime;

    private String serviceProceResult;

    private String myd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServeType() {
        return serveType;
    }

    public void setServeType(String serveType) {
        this.serveType = serveType == null ? null : serveType.trim();
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(String serviceRequest) {
        this.serviceRequest = serviceRequest == null ? null : serviceRequest.trim();
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople == null ? null : createPeople.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAssigner() {
        return assigner;
    }

    public void setAssigner(String assigner) {
        this.assigner = assigner == null ? null : assigner.trim();
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getServiceProce() {
        return serviceProce;
    }

    public void setServiceProce(String serviceProce) {
        this.serviceProce = serviceProce == null ? null : serviceProce.trim();
    }

    public String getServiceProcePeople() {
        return serviceProcePeople;
    }

    public void setServiceProcePeople(String serviceProcePeople) {
        this.serviceProcePeople = serviceProcePeople == null ? null : serviceProcePeople.trim();
    }

    public Date getServiceProceTime() {
        return serviceProceTime;
    }

    public void setServiceProceTime(Date serviceProceTime) {
        this.serviceProceTime = serviceProceTime;
    }

    public String getServiceProceResult() {
        return serviceProceResult;
    }

    public void setServiceProceResult(String serviceProceResult) {
        this.serviceProceResult = serviceProceResult == null ? null : serviceProceResult.trim();
    }

    public String getMyd() {
        return myd;
    }

    public void setMyd(String myd) {
        this.myd = myd == null ? null : myd.trim();
    }
}