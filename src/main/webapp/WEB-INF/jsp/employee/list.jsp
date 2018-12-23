<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>

<h2>员工表</h2>
<div style="margin: 20px 0;"></div>

<table class="easyui-datagrid" title="员工表"
       style="width: 100%; height: 250px"
       data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
    <thead>
    <tr>
        <th data-options="field:'id',width:100">序号</th>
        <th data-options="field:'name',width:100">姓名</th>
        <th data-options="field:'xb',width:100">性别</th>
        <th data-options="field:'sfz',width:100,align:'right'">身份证</th>
        <th data-options="field:'rq',width:100,align:'right'">出生日期</th>
        <th data-options="field:'gw',width:100">岗位</th>
        <th data-options="field:'jw',width:100,align:'center'">职务</th>
        <th data-options="field:'jg',width:100,align:'center'">籍贯</th>
        <th data-options="field:'zp',width:100,align:'center'">照片</th>
        <th data-options="field:'dh',width:100,align:'center'">联系电话</th>
        <th data-options="field:'cz',width:200,align:'center'">操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeList }" var="employs" varStatus="i">
        <tr>
            <td>${ i.index+1}</td>
            <td>${ employs.name}</td>
            <td>${ employs.gender}</td>
            <td>${ employs.cardid}</td>
            <td>${ employs.birthday}</td>
            <td>${ employs.postcode}</td>
            <td>${ employs.jobid}</td>
            <td>${ employs.race}</td>
            <td>${ employs.education}</td>
            <td>${ employs.phone}</td>
            <td><a href="form">添加</a>
            <a href="form?id=${employs.id}">修改</a>
            <a href="delete?id=${employs.id}">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>

</table>
</body>
</html>