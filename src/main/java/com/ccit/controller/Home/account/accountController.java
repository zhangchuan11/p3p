package com.ccit.controller.Home.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class accountController {
	@RequestMapping("/account")
	public String gotUser() {	
		return "Home/account/index";
	}
}
