package com.situ.crm.dao;

import com.situ.crm.pojo.CustomerLossMeasure;
import com.situ.crm.pojo.CustomerLossMeasureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerLossMeasureMapper {
    int countByExample(CustomerLossMeasureExample example);

    int deleteByExample(CustomerLossMeasureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerLossMeasure record);

    int insertSelective(CustomerLossMeasure record);

    List<CustomerLossMeasure> selectByExample(CustomerLossMeasureExample example);

    CustomerLossMeasure selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerLossMeasure record, @Param("example") CustomerLossMeasureExample example);

    int updateByExample(@Param("record") CustomerLossMeasure record, @Param("example") CustomerLossMeasureExample example);

    int updateByPrimaryKeySelective(CustomerLossMeasure record);

    int updateByPrimaryKey(CustomerLossMeasure record);
}