package com.situ.crm.vo;

public class khfu {

	private String serviceType;
	private Integer num;
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "khfu [serviceType=" + serviceType + ", num=" + num + "]";
	}
	
}
