package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.Firm;
import com.ssm.helper.PageTerminal;
import com.ssm.service.FirmService;
@Controller
public class FirmController {
	@Autowired
	FirmService firmService;
	@RequestMapping("page")
	public String pageList(PageTerminal<Firm> page,Model model) {
		model.addAttribute("page", firmService.pageList(page));
		return "page";
	}
}
