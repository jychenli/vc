<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static" />
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>电子看板</title>

<link href="${ctxStatic}/bootstrap-3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${ctxStatic}/font-awesome/css/font-awesome.css"
	rel="stylesheet">



<link href="${ctxStatic}/common/css/animate.css" rel="stylesheet">
<link href="${ctxStatic}/common/css/style.css" rel="stylesheet">

</head>

<body class="fixed-sidebar full-height-layout gray-bg">
	<div id="wrapper">
		<nav class="navbar-default navbar-static-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav metismenu" id="side-menu">
					<li class="nav-header">
						<div class="dropdown profile-element">
							<span> <img id="header" alt="image" class="img-circle"
								src="${ctxStatic}/images/header.jpg" style="height:64px;width:64px;"/>
							</span> <a data-toggle="dropdown" class="dropdown-toggle" href="#">
								<span class="clear"> <span class="block m-t-xs"> <strong
										class="font-bold">admin</strong>
								</span>
							</span>
							</a>

						</div>
						<div class="logo-element">IN+</div>
					</li>
					<li class="active"><a href="index.html"><i
							class="fa fa-th-large"></i> <span class="nav-label">Dashboards</span></a>
					</li>
					<li><a href="layouts.html"><i class="fa fa-diamond"></i> <span
							class="nav-label">Layouts</span></a></li>
					<li><a href="#"><i class="fa fa-bar-chart-o"></i> <span
							class="nav-label">Graphs</span></a></li>
					<li><a href="mailbox.html"><i class="fa fa-envelope"></i><span
							class="nav-label">Mailbox </span></a></li>
				</ul>

			</div>
		</nav>

		<div id="page-wrapper" class="gray-bg dashbard-1">
			<div class="row ">
				<nav class="navbar navbar-static-top" role="navigation"
					style="margin-bottom: 0">
					<div class="navbar-header">
						<a class="navbar-minimalize minimalize-styl-2 btn btn-primary "
							href="#"><i class="fa fa-bars"></i> </a>
					</div>
					<ul class="nav navbar-top-links navbar-right">

						<li><a href="login.html"> <i class="fa fa-sign-out"></i>
								Log out
						</a></li>
					</ul>
				</nav>
			</div>
		
		 <div class="row content-tabs">
                <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs J_menuTabs">
                    <div class="page-tabs-content">
                        <a href="javascript:;" class="active J_menuTab" data-id="${ctx}/home">首页</a>
                    </div>
                </nav>
                <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
                </button>
                <div class="btn-group roll-nav roll-right">
                    <button class="dropdown J_tabClose"  data-toggle="dropdown">关闭操作<span class="caret"></span>

                    </button>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">
                        <li class="J_tabShowActive"><a>定位当前选项卡</a>
                        </li>
                        <li class="divider"></li>
                        <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                        </li>
                        <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                        </li>
                    </ul>
                </div>
                <a href="${ctx}/logout" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
            </div>
            <div class="row J_mainContent" id="content-main">
                <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="${ctx}/home" frameborder="0" data-id="${ctx}/home" seamless></iframe>
            </div>
            <div class="footer">
                <div class="pull-left"><a href="http://www.jeeplus.org">http://www.jeeplus.org</a> &copy; 2015-2025</div>
            </div>
        </div>
        <!--右侧部分结束-->
		
        </div>
	</div>

	<!-- Mainly scripts -->
	<script src="${ctxStatic}/jquery/jquery-3.2.1.js"></script>
	<script src="${ctxStatic}/bootstrap-3.3.7/js/bootstrap.js"></script>
	<script src="${ctxStatic}/common/contabs.js"></script> 


	<script>
			
					$(document).ready(
					
					);
	</script>
</body>
</html>
