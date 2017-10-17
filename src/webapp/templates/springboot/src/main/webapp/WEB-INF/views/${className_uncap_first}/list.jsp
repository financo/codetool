<#include "/macro.include"/>
<#assign className = table.className/>
<#assign classNameLower = className?uncap_first/>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib prefix="c" uri="/WEB-INF/tlds/c.tld" %> --%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>${table.description} - 列表</title>
<jsp:include page="/WEB-INF/views/base.jsp"></jsp:include>

<style type="text/css">.td-btns a{word-break: keep-all;  padding: 5px 0;display: inline-block;}</style>
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
								<li><a href="add">新增</a></li>
							</ul>
							<a class="close-link" ><i class="fa fa-times"></i> </a>
						</div>
					</div>
					<div class="ibox-content">
						<div class="dataTables_wrapper form-inline">
							<div class="row">
								<div class="col-sm-12">
									<form role="form" class="form-inline form_search" method="post" action="list">
										<!-- search -->
										<#if (table.searchFieldCount!=0) >
											<#list table.columns as column>
												<#if column.search>
										<div class="form-group">
											<label>
												<label class="">${column.description}：</label>
												<input type="text" placeholder="请输入${column.description}" class="form-control" name="${classNameLower}.${column.columnNameLower}" value="<@jspEl 'bean.${classNameLower}.${column.columnNameLower}' />">
											</label>
										</div>
												</#if>
											</#list>
											<!-- 下拉选择 -->
											<#list table.associatedTables?values as foreignKey>
												<#if foreignKey.field?? && foreignKey.field.isSearch?? && foreignKey.field.isSearch==1>
													<#if foreignKey.field.entityTypeId??>
														<#assign fkPojoClass = foreignKey.classTableName />
														<#assign fkPojoClassVar = fkPojoClass?uncap_first />
														<#assign valueColumn = foreignKey.columnName?uncap_first />
														<#assign fkFieldName = foreignKey.parentName />
										<label>
											<label>${foreignKey.description }：</label>
											<select name="${foreignKey.table.className?uncap_first}.${fkFieldName?uncap_first}.id" class="form-control">
												<option value="">请选择</option>
												<c:if test="<@el '${fkPojoClassVar}s !=null && ${fkPojoClassVar}s.size()>0' />">
													<c:forEach items="<@el '${fkPojoClassVar}s'/>" var="item" varStatus="s">
														<option value="<@el 'item.${valueColumn}'/>" <@el '(bean.${classNameLower}.${fkFieldName?uncap_first}!=null && bean.${classNameLower}.${fkFieldName?uncap_first}.${valueColumn}==item.${valueColumn})?"selected=\'selected\'":""'/> ><@el 'item.${foreignKey.showColumnName }' /></option>
													</c:forEach>
												</c:if>
											</select>
										</label>
													</#if>
												</#if>
											</#list>
										</#if>
										<a class="btn btn-white btn_delete_selected" href="javascript:;" url="asyncDeleteAll" style="float: right;">删除</a>
										<a class="btn btn-white" href="add" style="float: right;margin-right:10px;">新增</a>
										<#if (table.searchFieldCount!=0) >
											<button class="btn btn-white" type="submit" style="float: right;margin-right: 10px;">查询</button>
										</#if>
									</form>
								</div>
							</div>
							<table class="table table-bordered table-hover">
								<thead>
									<tr>
										<th style="text-align: center;"><input type="checkbox" class="ck_all"/></th>
										<th>ID</th>
										<!-- property -->
										<#list table.columns as column>
											<#if !column.pk>
												<th>${column.description }</th>
											</#if>
										</#list>
										<#list table.associatedTables?values as foreignKey>
											<#if foreignKey.relation == "ManyToOne">
												<!-- many2one -->
												<th><#if foreignKey.description??>${foreignKey.description}<#else>${foreignKey.classTableName}</#if></th>
											</#if>
											<#if foreignKey.relation == "ManyToMany" && (foreignKey.mainFk?? && foreignKey.mainFk=="1")>
												<!-- many2many -->
												<!--
										<th><#if foreignKey.description??>${foreignKey.description}<#else>${foreignKey.classTableName}</#if></th>
										 -->
											</#if>
										</#list>
										<th style="min-width: 90px;">操作</th>
									</tr>
								</thead>
								<tbody>
								<c:if test="<@el 'bean.objectList==null || bean.objectList.size()==0 ' />">
									<tr >
										<td colspan="10" align="center">暂无数据</td>
									</tr>
								</c:if>
								<c:forEach items="<@el 'bean.objectList'/>" var="item" varStatus="st">
									<tr>
										<td style="text-align: center;">
											<input type="checkbox" class="ck_item" value="<@el 'item.id' />"/>
										</td>
										<!-- property -->
										<td><@el 'item.id' /></td>
										<#list table.columns as column>
											<#if !column.pk>
										<td><@el 'item.${column.columnNameLower}' /></td>
											</#if>
										</#list>
										<#list table.associatedTables?values as foreignKey>
											<#if foreignKey.relation == "ManyToOne">
												<#assign fkPojoClass = foreignKey.classTableName />
												<#assign fkPojoClassVar = fkPojoClass?uncap_first />
												<!-- many2one -->
												<#if foreignKey.parentName??>
													<#assign fkFieldName = foreignKey.parentName>
												<#else>
													<#assign fkFieldName = fkPojoClass/>
												</#if>
										<td><@el 'item.${fkFieldName?uncap_first}.${foreignKey.showColumnName}'/></td>
											</#if>
											<#if foreignKey.relation == "ManyToMany" && (foreignKey.mainFk?? && foreignKey.mainFk=="1")>
												<!-- many2many -->
												<#if foreignKey.parentName??>
													<#assign fkFieldName = foreignKey.parentName/>
												<#else>
													<#assign fkFieldName = fkPojoClass +"s">
												</#if>
												<!-- <td>
											<c:if test="<@el 'bean.${classNameLower}.${fkFieldName?uncap_first}!=null' />">
												<c:forEach items="<@el 'bean.${classNameLower}.${fkFieldName?uncap_first}'/>" var="o">
										<@el 'o.index==0?"":"; "' />
										<@el 'o.${foreignKey.showColumnName }' />
												</c:forEach>
											 </c:if>
										</td> -->
											</#if>
										</#list>
										<td>
											<a href="edit?${classNameLower}.id=<@el 'item.id' />">修改</a>&nbsp;
											<a href="javascript:;" url="asyncDeleteAll?idList=<@el 'item.id'/> " class="btn_delete_item">删除</a>&nbsp;
										</td>
									</tr>
								</c:forEach>
								</tbody>
							</table>

<u:pageLink  linkId="123" align="right" action="list" 
totalCount="<@el 'bean.pageInfo.totalCounts' />"
pageNo="<@el 'bean.pageInfo.currentPage'/>"
pageSize="<@el 'bean.pageInfo.pageSize'/>"
ajax="false" ajaxRequestFun="doSearch"/>

						</div>
					</div>
					
				</div>
			</div>
		</div>
	</div>
</body>
</html>
