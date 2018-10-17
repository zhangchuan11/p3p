package com.ccit.controller.Home.borrow;

import com.ccit.dml.Borrowing;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BorrowController {
	@RequestMapping("/Borrow")
	public String gotUser() {	
		return "Home/borrow/index";
	}

	@RequestMapping("/Borrow/DoSave")
    public String DoSave(Borrowing borrowing){
	    return null;
    }
}
