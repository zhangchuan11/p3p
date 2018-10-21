package com.ccit.controller.Admin.ABorrow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class audit {
    @RequestMapping("Admin/audit")
    public String audit(){
        return "Admin/Borrow/audit";
    }
}
