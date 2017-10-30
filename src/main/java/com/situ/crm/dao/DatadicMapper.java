package com.situ.crm.dao;

import com.situ.crm.pojo.DataDic;
import com.situ.crm.pojo.DataDicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDicMapper {
    int countByExample(DataDicExample example);

    int deleteByExample(DataDicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataDic record);

    int insertSelective(DataDic record);

    List<DataDic> selectByExample(DataDicExample example);

    DataDic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataDic record, @Param("example") DataDicExample example);

    int updateByExample(@Param("record") DataDic record, @Param("example") DataDicExample example);

    int updateByPrimaryKeySelective(DataDic record);

    int updateByPrimaryKey(DataDic record);
}