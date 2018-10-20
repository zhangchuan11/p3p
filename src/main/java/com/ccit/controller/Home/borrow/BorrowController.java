package com.ccit.controller.Home.borrow;

import com.alibaba.fastjson.JSONObject;
import com.ccit.dml.Borrowing;
import com.ccit.service.BorrowingService;
import com.ccit.service.UserdataService;
import com.common.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class BorrowController {

    @Autowired
    private UserdataService UserdataServiceImpl;
    @Autowired
    private BorrowingService borrowingService;
	@RequestMapping("/Borrow")
	public ModelAndView gotUser(HttpSession session) {
	    ModelAndView mvc = new ModelAndView();
        JSONObject u =(JSONObject)session.getAttribute ("user");
        if( u == null){
            mvc.setViewName("redirect:login");
        }else{
            String Userdata = UserdataServiceImpl.findOne(u.getString("userdateId"));
            JSONObject jsonUserData = JSONObject.parseObject(Userdata);
            JSONObject JS = JSONObject.parseObject(jsonUserData.getString("data"));
            mvc.addObject("userdata",JS);
            mvc.setViewName("Home/borrow/index");
        }
		return mvc;
	}

    @ResponseBody
	@RequestMapping("/Borrow/DoSave")
    public Map<String,Object> DoSave(Borrowing borrowing, @RequestParam(value = "file", required = false) MultipartFile file , HttpServletRequest request) {
        Map<String,Object> Map = new HashMap<String, Object>();
         if(file!=null&&file.getOriginalFilename()!=null&&file.getOriginalFilename().length()>0){
            String path = request.getSession().getServletContext().getRealPath("/");
            Calendar cal = Calendar.getInstance();
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            String filePath=path+"/WEB-INF/upload/"+year+month+"/";
            File dir=new File(filePath);
            if(!dir.isDirectory())
                dir.mkdir();
            String fileOriginalName=file.getOriginalFilename();
            String newFileName=UUID.randomUUID()+fileOriginalName.substring(fileOriginalName.lastIndexOf("."));
            File file2=new File(filePath+newFileName);
             try {
                 file.transferTo(file2);
                 borrowing.setID(new UUIDUtil().getUUID());
                 borrowing.setGuarantee("/upload/"+year+month+"/"+newFileName);
                 String reulet = borrowingService.saveNotNull(borrowing);
                 JSONObject jsonObject = JSONObject.parseObject(reulet);
                 if (jsonObject.getString("code").equals("200"))
                 {
                     Map.put("code","0");
                     Map.put("msage","申请成功,请等待客服审核");
                 }else{
                     Map.put("code","1");
                     Map.put("msage","申请失败,请重新申请");
                 }
             } catch (IOException e) {
                 Map.put("code","1");
                 Map.put("msage","申请失败,请重新申请");
                 e.printStackTrace();
             }
        }
        else{
             Map.put("code","1");
             Map.put("msage","申请失败,请重新申请");
         }
	    return Map;
    }
}
