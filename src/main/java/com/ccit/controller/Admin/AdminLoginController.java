package com.ccit.controller.Admin;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dml.User;
import com.ccit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminLoginController {

    @Autowired
    private UserService userService;
    /**
     * 登陆
     * @return
     */
    @RequestMapping("Admin/login")
    public String action(){
        return "Admin/login";
    }

    /**
     * 登陆验证
     * @param user
     * @return
     */
    @RequestMapping("Admin/verify")
    public ModelAndView verify(User user,HttpSession session){
        ModelAndView mvc = new ModelAndView();
        if ("".equals(user.getLoginName()) || user.getLoginName() == null) {
            mvc.addObject("msg", "用户名不能为空");
            mvc.setViewName("Admin/login");
        } else if ("".equals(user.getPassWord()) || user.getPassWord() == null) {
            mvc.addObject("msg", "密码不能为空");
            mvc.setViewName("Admin/login");
        } else {
            String result = userService.find(user);
            JSONObject jsStr = JSONObject.parseObject(result);
            if (jsStr.getString("code").equals("200")) {
                mvc.addObject("msg", "请检查用户名和密码");
                mvc.setViewName("Admin/login");
            } else {
                JSONObject UserData = JSONObject.parseObject(jsStr.getString("data"));
                if (Integer.parseInt(UserData.getString("loc")) == 0) {
                    mvc.addObject("msg", "用户已被锁定");
                    mvc.setViewName("Admin/login");
                } else {
                    session.setAttribute("Admin", UserData);
                    mvc.setViewName("redirect:index");
                }
            }
        }
        return mvc;
    }
}
