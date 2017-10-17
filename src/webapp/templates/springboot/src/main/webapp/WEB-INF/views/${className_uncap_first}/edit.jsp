<#include "/macro.include"/>
<#assign className = table.className/>
<#assign classNameLower = className?uncap_first/>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib prefix="c" uri="/WEB-INF/tlds/c.tld" %> --%>
<!DOCTYPE HTML>
<html>
<head>
<title>${table.description}</title>
<jsp:include page="/WEB-INF/views/base.jsp"></jsp:include>
</head>
<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>${table.description}</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i></a>
							<a class="dropdown-toggle" data-toggle="dropdown" href="javascript:;"><i class="fa fa-wrench"></i></a>
							<ul class="dropdown-menu dropdown-user">
								<!-- <li><a href="javascript:;">选项1</a></li> -->
							</ul>
							<a class="close-link"><i class="fa fa-times"></i> </a>
						</div>
					</div>
					<div class="ibox-content">
						<form role="form" class="form-horizontal" method="post" action="save">
							<div class="row">
							<div class="col-sm-6">
							<#assign index = 1>
							<#assign fkCount = 0>
							<#list table.associatedTables?values as foreignKey>
								<#if foreignKey.relation == "ManyToOne"||(foreignKey.relation == "ManyToMany" && (foreignKey.mainFk?? && foreignKey.mainFk=="1"))>
									<#assign fkCount = (fkCount+1)>
								</#if>
							</#list>
							<!-- id -->		
							<#if table.singleId>
					        	<#list table.columns as column>
					        		<#if column.pk>
					        <input type="hidden" name="${classNameLower}.${column.columnNameLower}" value='<@el 'bean.${classNameLower}.${column.columnNameLower}' />' class="field_${column.columnNameLower}"/>
						       		</#if>
								</#list>
							</#if>
							<!-- property -->
							<#list table.columns as column>
								<#if !column.pk>
								<#assign index = (index+1)>
							<!-- ${column.description} -->
									<#if column.field.ui?? && column.field.ui.implementType??>
										<#assign ui = column.field.ui>
										<#if ui.implementType==1>
							<!-- 自动生成 -->
											<#if ui.type?? && ui.type=="hidden">
							<input type="hidden" name="${classNameLower}.${column.columnNameLower}" value='<@el 'bean.${classNameLower}.${column.columnNameLower}'/>' class="field_${column.columnNameLower}"/>
											<#else>
											
							<div class="form-group">
								<label class="col-sm-2 control-label">${column.description}:</label>
								<div class="col-sm-10">
												<#if ui.code='input'>
									<input type="${ui.type }" name="${classNameLower}.${column.columnNameLower}" value='<@el 'bean.${classNameLower}.${column.columnNameLower}'/>' class="form-control field_${column.columnNameLower}"
									<#if column.field.validPattern??> required="required" pattern="${column.field.validPattern}" <#if column.field.validMsg??> title="${column.field.validMsg}"</#if> </#if>
									/>
												</#if>
									<span class="help-block m-b-none">
										
									</span>
								</div>
							</div>
							<!-- <div class="hr-line-dashed"></div> -->
											
											</#if>
										<#else>
							<!-- 手动开发 -->
							<#include "/include/${ui.script}"/>
							
										</#if>
									<#else>
							<!-- 默认生成 -->
							<#include "/include/default_input.include"/>
							
									</#if>
								</#if>
								<#if (index > (table.columns?size+fkCount)/2.0)>
									</div>
									<div class="col-sm-6">
									<#assign index = -1000000>
								</#if>
							</#list>
							
							<#list table.associatedTables?values as foreignKey>
								<#assign index = (index+1)>
								<#assign fkPojoClass = foreignKey.classTableName>
								<#assign fkPojoClassVar = fkPojoClass?uncap_first>
								<#assign valueColumn = foreignKey.columnName?uncap_first>
								<#if foreignKey.relation == "ManyToOne">
							<!-- many2one -->
									<#if foreignKey.field.ui?? && foreignKey.field.ui.implementType??>
										<#assign ui = foreignKey.field.ui>
										<#if ui.implementType==2>
										<!-- 手动开发 -->
										<#include "/include/${ui.script}"/>
								
										</#if>
									<#else>
										<!-- 默认生成 -->
										<#include "/include/default_many2one_select.include"/>
										
									</#if>
								</#if>
								<#if foreignKey.relation == "ManyToMany" && (foreignKey.mainFk?? && foreignKey.mainFk=="1")>
						<!-- many2many -->
									<#if foreignKey.field.ui?? && foreignKey.field.ui.implementType??>
										<#assign ui = foreignKey.field.ui>
										<#if ui.implementType==2>
										<!-- 手动开发 -->
										<#include "/include/${ui.script}"/>
										
										</#if>
									<#else>
									<!-- 默认生成 -->
									<#include "/include/default_many2many_select.include"/>
									
									</#if>
								</#if>
							<#if (index > (table.columns?size+fkCount)/2)>
								</div>
								<div class="col-sm-6">
								<#assign index = -1000000>
							</#if>
							</#list>
							
							</div>
							</div>
							<div class="row">
								<div class="form-group">
									<div class="col-sm-4 col-sm-offset-2">
										<button class="btn btn-primary" type="submit">保存</button>
										<button class="btn btn-white" type="button" onclick="window.history.back()">取消</button>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>

		</div>
	</div>

</body>
</html>
