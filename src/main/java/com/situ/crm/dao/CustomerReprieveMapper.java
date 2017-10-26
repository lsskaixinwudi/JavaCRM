package com.situ.crm.dao;

import com.situ.crm.pojo.CustomerReprieve;
import com.situ.crm.pojo.CustomerReprieveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerReprieveMapper {
    int countByExample(CustomerReprieveExample example);

    int deleteByExample(CustomerReprieveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerReprieve record);

    int insertSelective(CustomerReprieve record);

    List<CustomerReprieve> selectByExample(CustomerReprieveExample example);

    CustomerReprieve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerReprieve record, @Param("example") CustomerReprieveExample example);

    int updateByExample(@Param("record") CustomerReprieve record, @Param("example") CustomerReprieveExample example);

    int updateByPrimaryKeySelective(CustomerReprieve record);

    int updateByPrimaryKey(CustomerReprieve record);
}