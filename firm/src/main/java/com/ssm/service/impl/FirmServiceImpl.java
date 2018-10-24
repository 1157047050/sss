package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Firm;
import com.ssm.helper.PageTerminal;
import com.ssm.mapper.FirmMapper;
import com.ssm.mapper.FirmTerritoryMapper;
import com.ssm.mapper.TerritoryMapper;
import com.ssm.service.FirmService;

@Service
public class FirmServiceImpl implements FirmService{
	@Autowired
	FirmMapper firmMapper;
	@Autowired
	FirmTerritoryMapper firmTerritoryMapper;
	@Autowired
	TerritoryMapper territoryMapper;
	
	public PageTerminal<Firm> pageList(PageTerminal<Firm> page) {
		page.setList(firmMapper.list(page));
		page.setCount(firmMapper.count(page));
		return page;
	}

}
