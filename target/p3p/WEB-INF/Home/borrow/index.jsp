<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   	<title>borrow</title>
<link rel="stylesheet" type="text/css" href="./lib/css/style.css">
<script type="text/javascript" src="./lib/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="./lib/js/all.js"></script>
  </head>
  
  <body>
   <!-- header start -->
<div class="zxcf_top_wper">
	<div class="zxcf_top px1000 clearfix">
		 <div class="zxcf_top_l fl">
		    <img src="./lib/img/zxcf_phone.png" alt="">
		    400-027-0101(工作时间9:00-17:30)
		    <a href=" "><img src="./lib/img/zxcf_weixin.png" alt=""></a>
		    <a href=" "><img src="./lib/img/zxcf_sina.png" alt=""></a>
		    <a href=" "><img src="./lib/img/zxcf_qq.png" alt=""></a>
		 </div>
		 <div class="zxcf_top_r fr">
		 	<a href=" " class="curspan">立即登录</a>
		 	<span>|</span>
		 	<a href="http://demo1.mycodes.net/moban/P2P_wangdailicai/register.html">免费注册</a>
		 	<span>|</span>
		 	<a href="http://demo1.mycodes.net/moban/P2P_wangdailicai/problem.html">常见问题</a>
		 </div>
	</div>
</div>
<!-- end top -->
<div class="zxcf_nav_wper">
	<div class="zxcf_nav clearfix px1000">
		 <div class="zxcf_nav_l fl"><img src="./lib/img/zxcf_logo.png" alt=""></div>
		 <div class="zxcf_nav_r fr">
		 	<img src="./lib/img/zxcf_perinfo.png" alt="">
		 	<span>我的账户
		 	<img src="./lib/img/zxcf_icon01.png" alt=""></span>
		 	<ul class="zxcf_perinfo" style="display:none;">
		 		<li><a href=" ">111</a></li>
		 		<li><a href=" ">111</a></li>
		 		<li><a href=" ">111</a></li>
		 	</ul>
		 </div>
	</div>
</div>
<div class="zxcf_menu_wperinde">
    <div class="zxcf_menu px1000">
        <a href="index">首页</a>
        <a href="Investment">我要投资</a>
        <a href="Borrow">我要借款</a>
        <a href=" ">实时财务</a>
        <a href="">新手指引</a>
        <a href="account" style="margin-right:0;">关于我们</a>
    </div>
</div>
<!-- end  -->
<div class="bor_banner01">
	 
</div>
<!-- end banner -->
<div class="bor_con_wper">
	  <div class="bor_con px1000">
	  	    <div class="bor_detail">
	  	    	   <h2 class="bor_detail_tit">
	  	    	   	  <span class="bor_decurspan">房产抵押</span>
	  	    	   	  <span>车辆抵押</span>
	  	    	   	  <span>信用贷款</span>
	  	    	   	  <span>零首付车贷</span>
	  	    	   </h2>
	  	    	   <div class="bor_detail_box">
	  	    	   	    <div class="bor_det_one clearfix pt30 pb30">
	  	    	   	    	  <div class="bor_det_onel fl">
	  	    	   	    	  	       <p class="bor_p1">中兴财富平台的借款功能旨在帮助借款用户以
										低成本获得借款。用户在需要资金时，可以将
										自有房产和车产作为抵押物，小油菜线下审核
										通过后，根据抵押物的价值融资。</p>
										<p class="bor_p2">中兴财富平台的借款功能旨在帮助借款用户以
										低成本获得借款。用户在需要资金时，可以将
										自有房产和车产作为抵押物，小油菜线下审核
										通过后，根据抵押物的价值融资。</p>
										<h3 class="bor_onel_tit"><span>申请条件</span></h3>
										<ul class="bor_onel_ul">
											 <li><img src="./lib/img/bor_pic01.png" alt="">年满18周岁以上的公民
											 </li>
											 <li><img src="./lib/img/bor_pic02.png" alt="">需要北京房产或车产抵押
											 </li>
											 <li><img src="./lib/img/bor_pic03.png" alt="">个人或企业银行征信记录良好
											 </li>
											 <li><img src="./lib/img/bor_pic04.png" alt="">
											  无现有诉讼记录
											 </li>
											 
										</ul>
										<h3 class="bor_onel_tit"><span>提交资料</span></h3>
										<ul class="bor_onel_ul">
											 <li>&nbsp;<img src="./lib/img/bor_pic05.png" alt="">省份证
											 </li>
											 <li><img src="./lib/img/bor_pic06.png" alt="">申请资料
											 </li>
											 <li><img src="./lib/img/bor_pic07.png" alt="">其他
											 </li>
											
											 
										</ul>
	  	    	   	    	  </div>  
	  	    	   	    	  <!-- end l -->
	  	    	   	    	  <div class="bor_det_oner fl">
	  	    	   	    	  	     <form>
	  	    	   	    	  	     	  <fieldset>
	  	    	   	    	  	     	  	   <div>
	  	    	   	    	  	     	  	   	   <label>申请人</label>
	  	    	   	    	  	     	  	   	   <input type="">
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  	   <div class="mt15">
	  	    	   	    	  	     	  	   	   <label>*借款金额</label>
	  	    	   	    	  	     	  	   	   <input type="" class="bor_inputbg01">
	  	    	   	    	  	     	  	   </div>
                                               <div class="mt15">
	  	    	   	    	  	     	  	   	   <label>*借款期限</label>
	  	    	   	    	  	     	  	   	   <input type="" class="bor_inputbg02">
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  	   <div class="mt15">
	  	    	   	    	  	     	  	   	   <label>*手机号码</label>
	  	    	   	    	  	     	  	   	   <input type="">
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  	   <div class="mt15 guarmethod clearfix">
	  	    	   	    	  	     	  	   	   <label class="guarmethod_l fl">*担保方式</label>
	  	    	   	    	  	     	  	   	   <div class="fl">
	  	    	   	    	  	     	  	   	   	  <span>房屋数量</span>
	  	    	   	    	  	     	  	   	   	  <input type="text" class="bor_inputbg03 input2"><br><br>
	  	    	   	    	  	     	  	   	   	  <span>总价值</span>
	  	    	   	    	  	     	  	   	   	  <input type="text" class="bor_inputbg04 input2"><br>
	  	    	   	    	  	     	  	   	   </div>
	  	    	   	    	  	     	  	   	   
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  	   <div class="mt15">
	  	    	   	    	  	     	  	   	   <label>*借款用途</label>
	  	    	   	    	  	     	  	   	   <select>
	  	    	   	    	  	     	  	   	   	  <option>选择借款类别</option>
	  	    	   	    	  	     	  	   	   	  <option>1</option>
	  	    	   	    	  	     	  	   	   </select>
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  	    <div class="mt15">
	  	    	   	    	  	     	  	   	   <label>*借款描述</label> 
	  	    	   	    	  	     	  	   	   <textarea></textarea>
	  	    	   	    	  	     	  	   	 
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  	   <div class="mt15">
	  	    	   	    	  	     	  	   	   <label>*借款情况</label>
	  	    	   	    	  	     	  	   	   <input type="radio" class="input3">
	  	    	   	    	  	     	  	   	   普通借款
	  	    	   	    	  	     	  	  	   <input type="radio" class="input3">
	  	    	   	    	  	     	  	   	   紧急借款 
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  	   <div class="mt15">
	  	    	   	    	  	     	  	   	   <label>*验证码</label>
	  	    	   	    	  	     	  	   	   <input type="text" class="yanzheng">
	  	    	   	    	  	     	  	   	   
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  	   <div class="mt30">
	  	    	   	    	  	     	  	   	   <label></label>
	  	    	   	    	  	     	  	   	   <a href=" " class="bor_btn">提交材料</a>
	  	    	   	    	  	     	  	   </div>
	  	    	   	    	  	     	  </fieldset>
	  	    	   	    	  	     </form>
	  	    	   	    	  </div>
	  	    	   	    </div>
	  	    	   	    <!-- end 房产抵押 -->
	  	    	   	    <div class="bor_det_one" style="display:none;">
	  	    	   	    	  2  
	  	    	   	    </div>
	  	    	   	    <!-- end  -->
	  	    	   	    <div class="bor_det_one" style="display:none;">
	  	    	   	    	 3
	  	    	   	    </div>
	  	    	   	    <!-- end  -->
	  	    	   	    <div class="bor_det_one" style="display:none;">
	  	    	   	    	 4
	  	    	   	    </div>
	  	    	   	    <!-- end  -->
	  	    	   </div>
	  	    </div>
	  </div>
</div>

  </body>
</html>
