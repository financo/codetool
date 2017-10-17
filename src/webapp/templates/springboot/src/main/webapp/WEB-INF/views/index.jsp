<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%String path=request.getContextPath(); %>
<!DOCTYPE HTML>
<html>
<head>
<title>首页</title>
<jsp:include page="base.jsp"></jsp:include>
</head>
<body class="fixed-sidebar full-height-layout gray-bg"
	style="overflow: hidden">
	<div id="wrapper">
		<!--左侧导航开始-->
		<nav class="navbar-default navbar-static-side" role="navigation">
			<jsp:include page="left.jsp"></jsp:include>
		</nav>
		<!--左侧导航结束-->
		<!--右侧部分开始-->
		<div id="page-wrapper" class="gray-bg dashbard-1">
			<jsp:include page="right.jsp"></jsp:include>
		</div>
	</div>
	<script src="<%=path%>/js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script src="<%=path%>/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<script src="<%=path%>/js/plugins/layer/layer.min.js"></script>
	<script src="<%=path%>/js/boncfront.min.js?v=4.0.0"></script>
	<script src="<%=path%>/js/contabs.min.js"></script>
	<script src="<%=path%>/js/plugins/pace/pace.min.js"></script>
</body>
</html>
