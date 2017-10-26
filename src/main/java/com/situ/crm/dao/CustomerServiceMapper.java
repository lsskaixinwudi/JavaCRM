package com.situ.crm.dao;

import com.situ.crm.pojo.CustomerService;
import com.situ.crm.pojo.CustomerServiceExample;
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
}