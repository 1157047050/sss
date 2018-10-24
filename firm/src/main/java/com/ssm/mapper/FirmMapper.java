package com.ssm.mapper;

import com.ssm.entity.Firm;
import com.ssm.entity.FirmExample;
import com.ssm.helper.PageTerminal;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirmMapper {
    long countByExample(FirmExample example);

    int deleteByExample(FirmExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Firm record);

    int insertSelective(Firm record);

    List<Firm> selectByExample(FirmExample example);

    Firm selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Firm record, @Param("example") FirmExample example);

    int updateByExample(@Param("record") Firm record, @Param("example") FirmExample example);

    int updateByPrimaryKeySelective(Firm record);

    int updateByPrimaryKey(Firm record);

	List<Firm> list(PageTerminal<Firm> page);
	
	int count(PageTerminal<Firm> page);
}