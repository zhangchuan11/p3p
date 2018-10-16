package com.ccit.controller.Home.index;

import com.alibaba.fastjson.JSONObject;
import com.ccit.service.IndexpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    IndexpageService index;


    @RequestMapping("index")
    public ModelAndView gotUser() {
        ModelAndView mav = new    ModelAndView();
        String indexpage = index.findOne("1");
        String jsStr = JSONObject.parseObject(indexpage).getString("data");
        JSONObject IndexpageData = JSONObject.parseObject(jsStr);
        //JSONArray jsonArr = JSONArray.fromObject(indexpage);
        mav.addObject("indexpage", IndexpageData);
        mav.setViewName("Home/index/index");
        return mav;
    }
}
