<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>borrow</title>
    <%@include file="../Public/Head.jsp" %>
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
                <c:choose>
                    <c:when test="${user !=null}">
                        <a href="exit" class="curspan">切换账户</a>
                    </c:when>
                    <c:otherwise>
                        <a href="login" class="curspan">立即登录</a>
                    </c:otherwise>
                </c:choose>
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
                            <form id="ff" class="easyui-form" method="post"  data-options="novalidate:true" enctype="multipart/form-data">
                                <table cellpadding="5" style="border-collapse:separate; border-spacing:0px 20px;">
                                    <input type="hidden" value="${user["id"]}" name="nameId"></input>
                                    <input type="hidden" value="0" name="state"></input>
                                    <input type="hidden" value="1" name="product"></input>
                                    <tr>
                                        <td>借款金额: </td>
                                        <td><input id="money" class="easyui-numberbox"  name="money" validType="selectMax['#money']"
                                                   data-options="required:true"></input></td>
                                    </tr>
                                    <tr>
                                        <td>借款期限:</td>
                                        <td>
                                            <select id="deadTime"name="deadTime" class="easyui-combobox"   validType="selectValueRequired['#deadTime']" data-options="required:true" editable="false">
                                                <option value="">请选择</option>
                                                <option value="1个月">1个月</option>
                                                <option value="2个月">2个月</option>
                                                <option value="3个月">3个月</option>
                                                <option value="4个月">4个月</option>
                                                <option value="5个月">5个月</option>
                                                <option value="6个月">6个月</option>
                                                <option value="7个月">7个月</option>
                                                <option value="8个月">8个月</option>
                                                <option value="9个月">9个月</option>
                                                <option value="10个月">10个月</option>
                                                <option value="11个月">11个月</option>
                                                <option value="12个月">12个月</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>手机号码:</td>
                                        <td><input id="phoneNumber" class="easyui-numberbox"  name="phoneNumber" validType="length['#phoneNumber']"
                                                   data-options="required:true"></input></td>
                                    </tr>
                                    <tr>
                                    <td>房产证明:</td>
                                    <td><input class="easyui-filebox" name="file" data-options="required:true" style="width:100%" buttonText="选择图片"></td>
                                </tr>
                                    <tr>
                                        <td>总价值:</td>
                                        <td><input id="amountGuarantee" class="easyui-numberbox"  name="amountGuarantee"
                                                   data-options="required:true"></input></td>
                                    </tr>
                                    <tr>
                                        <td>借款用途:</td>
                                        <td>
                                            <select id="purpose" name="purpose" class="easyui-combobox" validType="selectValueRequired['#purpose']" data-options="required:true" editable="false" >
                                                <option value="">请选择</option>
                                                <option value="个人消费">个人消费</option>
                                                <option value="生产经营">生产经营</option>
                                                <option value="购房">购房</option>
                                                <option value="购车">购车</option>
                                                <option value="旅游">旅游</option>
                                                <option value="其他">其他</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>借款描述:</td>
                                        <td><input class="easyui-textbox" name="describ" data-options="multiline:true" id="describ"
                                                   style="height:110px;width: 300px"></input></td>
                                    </tr>
                                    <tr>
                                        <td>借款情况:</td>
                                        <td>
                                            <select  id="conditio" name="conditio" class="easyui-combobox" data-options="required:true"validType="selectValueRequired['#conditio']" editable="false">
                                                <option value="">请选择</option>
                                                <option value="普通借款">普通借款</option>
                                                <option value="紧急借款">紧急借款</option>
                                            </select>
                                        </td>
                                    </tr>
                                </table>
                            </form>
                            <div style="text-align:center;padding:5px">
                                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submit()">确认</a>
                                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清除</a>
                            </div>
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
