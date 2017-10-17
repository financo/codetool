<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<!--左侧导航开始-->
<nav class="navbar-default navbar-static-side" role="navigation">
	<div class="nav-close">
		<i class="fa fa-times-circle"></i>
	</div>
	<div class="sidebar-collapse">
		<ul class="nav" id="side-menu">
			<li class="nav-header">
				<div class="dropdown profile-element">
					GENERATOR TOOL
				</div>
				<div class="logo-element">
					TOOL
				</div>
			</li>
			<li>
				<a href="javascript:;"><i class="fa fa-home"></i> <span
					class="nav-label">主页</span> <span class="fa arrow"></span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class="fa fa-desktop"></i>
					<span class="nav-label">服务器</span>
					<span class="fa arrow"></span>
				</a>
				<ul class="nav nav-second-level">
					<li><a class="J_menuItem" href="generatorDbserver!list.action">数据库服务器管理</a></li>
					<li><a class="J_menuItem" href="generatorWebserver!list.action">WEB服务器管理</a></li>
				</ul>
			</li>
			<li>
				<a href="#">
					<i class="fa fa-table"></i>
					<span class="nav-label">基础信息</span>
					<span class="fa arrow"></span>
				</a>
				<ul class="nav nav-second-level">
					<li><a class="J_menuItem" href="generatorDataType!list.action">数据类型管理</a></li>
					<li><a class="J_menuItem" href="generatorUi!list.action">UI组件</a></li>
				</ul>
			</li>
			<li>
				<a href="#">
					<i class="fa fa-edit"></i>
					<span class="nav-label">工程信息 </span>
					<span class="fa arrow"></span>
				</a>
				<ul class="nav nav-second-level">
					<li><a class="J_menuItem" href="generatorProject!list.action">工程管理</a></li>
					<li><a class="J_menuItem" href="generatorEntity!list.action">实体管理</a></li>
					<li><a class="J_menuItem" href="generatorField!list.action">字段管理</a></li>
					<li><a class="J_menuItem" href="generatorService!list.action">服务管理</a></li>
					<li><a class="J_menuItem" href="generatorServiceMethod!list.action">服务方法管理</a></li>
					<li><a class="J_menuItem" href="generatorMethodParam!list.action">方法参数管理</a></li>
				</ul>
			</li>

		</ul>
	</div>
</nav>
<!--左侧导航结束-->