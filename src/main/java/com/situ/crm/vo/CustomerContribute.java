package com.situ.crm.vo;

public class CustomerContribute {
	//客户名字
	private String name;
	//客户所有订单贡献累加和
	private Long contribute;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getContribute() {
		return contribute;
	}

	public void setContribute(Long contribute) {
		this.contribute = contribute;
	}

	@Override
	public String toString() {
		return "CustomerContribute [name=" + name + ", contribute=" + contribute + "]";
	}

}