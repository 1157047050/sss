package com.ssm.mapper;

import com.ssm.entity.FirmTerritoryExample;
import com.ssm.entity.FirmTerritoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirmTerritoryMapper {
    long countByExample(FirmTerritoryExample example);

    int deleteByExample(FirmTerritoryExample example);

    int deleteByPrimaryKey(FirmTerritoryKey key);

    int insert(FirmTerritoryKey record);

    int insertSelective(FirmTerritoryKey record);

    List<FirmTerritoryKey> selectByExample(FirmTerritoryExample example);

    int updateByExampleSelective(@Param("record") FirmTerritoryKey record, @Param("example") FirmTerritoryExample example);

    int updateByExample(@Param("record") FirmTerritoryKey record, @Param("example") FirmTerritoryExample example);
}