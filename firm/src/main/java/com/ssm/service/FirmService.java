package com.ssm.service;

import com.ssm.entity.Firm;
import com.ssm.helper.PageTerminal;

public interface FirmService {

	PageTerminal<Firm> pageList(PageTerminal<Firm> page);

}
