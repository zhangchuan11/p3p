package com.ccit.controller.Home.borrow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BorrowController {
	@RequestMapping("/Borrow")
	public String gotUser() {	
		return "Home/borrow/index";
	}
}
