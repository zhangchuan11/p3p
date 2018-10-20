package com.ccit.controller.Home;

import javax.servlet.http.HttpSession;

import com.ccit.dml.User;
import com.common.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.alibaba.fastjson.JSONObject;
import com.ccit.service.UserService;

import java.util.HashMap;
import java.util.Map;


@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String gotoLogin() {
        return "/Home/login";
    }

    /**
     * 登陆验证
     *
     * @param user 用户信息
     * @return
     */
    @RequestMapping("/verify")
    public ModelAndView verify(User user, HttpSession session) {
        ModelAndView mvc = new ModelAndView();
        if ("".equals(user.getLoginName()) || user.getLoginName() == null) {
            mvc.addObject("msg", "用户名不能为空");
            mvc.setViewName("Home/login");
        } else if ("".equals(user.getPassWord()) || user.getPassWord() == null) {
            mvc.addObject("msg", "密码不能为空");
            mvc.setViewName("Home/login");
        } else {
            String result = userService.find(user);
            JSONObject jsStr = JSONObject.parseObject(result);
            if (jsStr.getString("code").equals("200")) {
                mvc.addObject("msg", "请检查用户名和密码");
                mvc.setViewName("Home/login");
            } else {
                JSONObject UserData = JSONObject.parseObject(jsStr.getString("data"));
                if (Integer.parseInt(UserData.getString("loc")) == 0) {
                    mvc.addObject("msg", "用户已被锁定");
                    mvc.setViewName("Home/login");
                } else {
                    session.setAttribute("user", UserData);
                    mvc.setViewName("redirect:index");
                }
            }
        }
        return mvc;
    }

    /**
     * 切换账户
     *
     * @param session
     * @return
     */
    @RequestMapping("exit")
    public String exit(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:login";
    }

    /**
     * 检查用户名是否存在
     */
    @ResponseBody
    @RequestMapping("/checkUser")
    public Map<String, String> checkUser(String LoginName) {
        User u = new User();
        u.setLoginName(LoginName);
        String UserData = userService.find(u);
        JSONObject jsStr = JSONObject.parseObject(UserData);
        Map<String, String> map = new HashMap<String, String>();
        if (jsStr.getString("code").equals("200")) {
            map.put("code", "false");
            map.put("msg", "用户可以注册");
        } else {
            map.put("code", "true");
            map.put("msg", "用户已存在");
        }
        return map;
    }

    /**
     * 注册用户
     *
     * @param User
     * @return
     */
    @ResponseBody
    @RequestMapping("/DoSaveUser")
    public Map<String, String> DoSaveUser(User User) {
        User.setId(new UUIDUtil().getUUID());
        String s = userService.saveNotNull(User);
        JSONObject jsStr = JSONObject.parseObject(s);
        Map<String, String> map = new HashMap<String, String>();
        if (jsStr.getString("code").equals("200")) {
            map.put("msg", "注册成功");
            map.put("errorCode","0");
        } else {
            map.put("msg", "注册失败");
            map.put("errorCode","1");
        }
        return map;
    }

}
