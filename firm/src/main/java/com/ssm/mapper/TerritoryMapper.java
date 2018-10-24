package com.ssm.mapper;

import com.ssm.entity.Territory;
import com.ssm.entity.TerritoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerritoryMapper {
    long countByExample(TerritoryExample example);

    int deleteByExample(TerritoryExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Territory record);

    int insertSelective(Territory record);

    List<Territory> selectByExample(TerritoryExample example);

    Territory selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Territory record, @Param("example") TerritoryExample example);

    int updateByExample(@Param("record") Territory record, @Param("example") TerritoryExample example);

    int updateByPrimaryKeySelective(Territory record);

    int updateByPrimaryKey(Territory record);
}