<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>首页</title>
    <%@include file="Public/Head.jsp" %>
    <!-- header start -->
    <div class="zxcf_top_wper">
        <div class="zxcf_top px1000 clearfix">
            <div class="zxcf_top_l fl">
                <img src="./lib/img/zxcf_phone.png" alt="">
                400-027-0101(工作时间9:00-17:30)
                <a href="/"><img src="./lib/img/zxcf_weixin.png" alt=""></a>
                <a href=""><img src="./lib/img/zxcf_sina.png" alt=""></a>
                <a href=""><img src="./lib/img/zxcf_qq.png" alt=""></a>
            </div>
            <div class="zxcf_top_r fr">
                <span>|</span>
                <a id="btn" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="openaddrole()">免费注册</a>
                <span>|</span>
                <a href="login">常见问题</a>
            </div>
        </div>
    </div>
    <!-- end top -->
    <div class="zxcf_nav_wper">
        <div class="zxcf_nav clearfix px1000">
            <div class="zxcf_nav_l fl"><img src="./lib/img/zxcf_logo.png" alt="">
                <h3 style="margin-left: 900px"><a href="index"><span class="label label-primary">返回主页</span></a></h3>
            </div>
        </div>
    </div>
    <!-- end  -->
    <div class="login_con_wper">
        <div class="login_con px1000 ">
            <div class="lg_section clearfix">
                <div class="lg_section_l fl">
                    <img src="./lib/img/lg_bg02.png">
                </div>
                <!-- end l -->
                <div class="lg_section_r fl">
                    <h2 class="lg_sec_tit clearfix">
                        <em class="fr">没有帐号， <a class="easyui-linkbutton" onclick="openaddrole()">免费注册</a></em>
                    </h2>
                    <form action="verify" method="post" accept-charset="UTF-8">
                        <fieldset>
                            <p class="mt20">
                                <input type="text" name="LoginName" placeholder="用户名" class="lg_input01 lg_input">
                            </p>
                            <p class="mt20">
                                <input type="password" name="PassWord" placeholder="密码" class="lg_input02 lg_input">
                            </p>
                            <h2 class="lg_sec_tit clearfix">
                                <h3><span class="label label-danger">${msg}</span></h3>
                            </h2>
                            <p>
                                <button type="submit" class="lg_btn">立即登陆</button>
                            </p>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>


    <!-- footer start -->
    <div class="zscf_aboutus_wper">
        <div class="zscf_aboutus px1000 clearfix">
            <div class="zscf_aboutus_l fl">
                <ul class="zscf_aboutus_lul clearfix">
                    <li class="pt10"><a href=""><img src="./lib/img/app.png" alt=""></a>
                    </li>
                    <li>
                        <p class="pb20">服务热线</p>
                        <strong>400-027-0101</strong>
                    </li>
                    <li>
                        <p class="pb10 linkpic">
                            <a href=""><img src="./lib/img/ft_sina.png" alt=""></a>
                            <a href="""><img src="./lib/img/ft_weixin.png" alt=""></a>
                            <a href="""><img src="./lib/img/ft_erji.png" alt=""></a>
                        </p>
                        <p><a href="">kefu@zhongxincaifu.com</a></p>
                    </li>
                </ul>
            </div>
            <!-- end left -->
            <div class="zscf_aboutus_r fl clearfix">
                <a href="" class="fl ft_ewm"><img src="./lib/img/ft_erweima.png" alt=""></a>
                <ul class="fl clearfix">
                    <li><a href="">联系我们</a></li>
                    <li><a href="">我要融资</a></li>
                    <li><a href="http://demo1.mycodes.net/moban/P2P_wangdailicai/problem.html">帮助中心</a></li>
                    <li><a href="">友情链接</a></li>
                    <li><a href="">招贤纳士</a></li>
                    <li><a href="">收益计算器</a></li>
                </ul>
            </div>
            <!-- end right -->

        </div>
    </div>

    <div class="zscf_bottom_wper">
        <div class="zscf_bottom px1000 clearfix">
            <p class="fl">© 2014 zhongxincaifu &nbsp; &nbsp;&nbsp; 中兴财富金融信息服务股份有限公司 &nbsp;&nbsp;&nbsp; <a
                    href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
            <p class="fr">
                <a href=""><img src="./lib/img/360.png" alt=""></a>
                <a href=""><img src="./lib/img/kexin.png" alt=""></a>
                <a href=""><img src="./lib/img/norton.png" alt=""></a>
            </p>
        </div>
    </div>
    <!-- footer end -->
    </body>
</html>
