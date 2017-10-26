package com.situ.crm.dao;

import com.situ.crm.pojo.Datadic;
import com.situ.crm.pojo.DatadicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatadicMapper {
    int countByExample(DatadicExample example);

    int deleteByExample(DatadicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Datadic record);

    int insertSelective(Datadic record);

    List<Datadic> selectByExample(DatadicExample example);

    Datadic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Datadic record, @Param("example") DatadicExample example);

    int updateByExample(@Param("record") Datadic record, @Param("example") DatadicExample example);

    int updateByPrimaryKeySelective(Datadic record);

    int updateByPrimaryKey(Datadic record);
}