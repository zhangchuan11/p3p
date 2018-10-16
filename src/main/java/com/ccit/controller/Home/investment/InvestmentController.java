package com.ccit.controller.Home.investment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvestmentController {
	@RequestMapping("/Investment")
	public String gotUser() {	
		return "Home/investment/index";
	}
}
