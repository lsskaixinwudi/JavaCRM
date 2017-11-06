package com.situ.crm.dao;

import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.CustomerService;
import com.situ.crm.pojo.CustomerServiceExample;
import com.situ.crm.vo.khfu;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerServiceMapper {
    int countByExample(CustomerServiceExample example);

    int deleteByExample(CustomerServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerService record);

    int insertSelective(CustomerService record);

    List<CustomerService> selectByExample(CustomerServiceExample example);

    CustomerService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerService record, @Param("example") CustomerServiceExample example);

    int updateByExample(@Param("record") CustomerService record, @Param("example") CustomerServiceExample example);

    int updateByPrimaryKeySelective(CustomerService record);

    int updateByPrimaryKey(CustomerService record);

	List<CustomerService> selectByExample1(CustomerServiceExample customerServiceExample);

	List<CustomerService> selectByExample2(CustomerServiceExample customerServiceExample);

	List<CustomerService> selectByExample3(CustomerServiceExample customerServiceExample);

	ServerResponse getServiceDealPeople(CustomerService customerService);

	List<khfu> findkhfw();
}