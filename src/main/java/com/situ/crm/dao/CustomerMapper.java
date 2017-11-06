package com.situ.crm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.situ.crm.pojo.Customer;
import com.situ.crm.pojo.CustomerExample;
import com.situ.crm.vo.CustomerConstitute;
import com.situ.crm.vo.CustomerContribute;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);


	Customer getCustomerId(Customer customer);

	Customer getCustomer(String name, String password);

	List<Customer> findCustomerNum();

	List<Customer> findLossCustomer();
	
	List<CustomerContribute> findCustomerContribute(Map<String, Object> map);

	List<CustomerContribute> selectCustomerContribute(Map<String, Object> map);

	List<CustomerConstitute> findCustomerConstitute();
}