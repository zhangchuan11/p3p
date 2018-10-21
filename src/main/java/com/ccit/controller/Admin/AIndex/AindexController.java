package com.ccit.controller.Admin.AIndex;


import com.alibaba.fastjson.JSONObject;
import com.ccit.service.PermissionsService;
import com.common.jsonToList;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class AindexController {
    @Autowired
    private PermissionsService permissionsService;
    @RequestMapping("Admin/index")
    public ModelAndView index() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("Admin/index/index");
        return mvc;
    }

    /**
     * 欢迎界面
     * @return
     */
    @RequestMapping("Admin/info")
    public String info(){
        return "Admin/index/info";
    }

    /**
     * 初始化菜单
     */
    @ResponseBody
    @RequestMapping("Admin/permissions")
    public List<Object> permissions(HttpSession session){
        JSONObject Admin = (JSONObject)session.getAttribute("Admin");
        String role = Admin.getString("id");
       String s=  permissionsService.Selectpermissions(role);
        com.alibaba.fastjson.JSONObject jtr = com.alibaba.fastjson.JSONObject.parseObject(s);
        List<Object> List =  new jsonToList().jsonToList1(jtr.getString("data"));
        return List;
    }
}
