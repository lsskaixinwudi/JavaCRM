package com.situ.crm.pojo;

public class Datadic {
    private Integer id;

    private String datadicName;

    private String datadicValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatadicName() {
        return datadicName;
    }

    public void setDatadicName(String datadicName) {
        this.datadicName = datadicName == null ? null : datadicName.trim();
    }

    public String getDatadicValue() {
        return datadicValue;
    }

    public void setDatadicValue(String datadicValue) {
        this.datadicValue = datadicValue == null ? null : datadicValue.trim();
    }
}