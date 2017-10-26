package com.situ.crm.pojo;

public class Datadic {
    private Integer id;

    private String dataDicName;

    private String dataDicValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataDicName() {
        return dataDicName;
    }

    public void setDataDicName(String dataDicName) {
        this.dataDicName = dataDicName == null ? null : dataDicName.trim();
    }

    public String getDataDicValue() {
        return dataDicValue;
    }

    public void setDataDicValue(String dataDicValue) {
        this.dataDicValue = dataDicValue == null ? null : dataDicValue.trim();
    }
}