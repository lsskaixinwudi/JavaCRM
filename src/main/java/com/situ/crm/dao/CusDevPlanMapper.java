package com.situ.crm.dao;

import com.situ.crm.pojo.CusDevPlan;
import com.situ.crm.pojo.CusDevPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusDevPlanMapper {
    int countByExample(CusDevPlanExample example);

    int deleteByExample(CusDevPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CusDevPlan record);

    int insertSelective(CusDevPlan record);

    List<CusDevPlan> selectByExample(CusDevPlanExample example);

    CusDevPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CusDevPlan record, @Param("example") CusDevPlanExample example);

    int updateByExample(@Param("record") CusDevPlan record, @Param("example") CusDevPlanExample example);

    int updateByPrimaryKeySelective(CusDevPlan record);

    int updateByPrimaryKey(CusDevPlan record);
}