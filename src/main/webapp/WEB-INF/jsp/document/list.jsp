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

<h2>培训计划表</h2>
<div style="margin: 20px 0;"></div>

<table class="easyui-datagrid" title="培训计划表"
       style="width: 100%; height: 250px"
       data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
    <thead>
    <tr>
        <th data-options="field:'id',width:100">序号</th>
        <th data-options="field:'productid',width:100">计划</th>
        <th data-options="field:'listprice',width:100,align:'right'">专业</th>
        <th data-options="field:'unitcost',width:100,align:'right'">培训目的</th>
        <th data-options="field:'attr1',width:100">培训内容</th>
        <th data-options="field:'status',width:100,align:'center'">课时</th>
        <th data-options="field:'status',width:100,align:'center'">授课人</th>
        <th data-options="field:'cz',width:200,align:'center'">操作</th>
    </tr></thead>
    <tbody>
    <c:forEach items="${documentList }" var="documents" varStatus="i">
        <tr>
            <td>${ i.index+1}</td>
            <td>${ documents.title}</td>
            <td>${ documents.filename}</td>
            <td>${ documents.remark}</td>
            <td>${ documents.neirong}</td>
            <td>${ documents.keshi}</td>
            <td>${ documents.shoukeren}</td>
            <td><a href="form">添加</a>
            <a href="form?id=${documents.id}">修改</a>
            <a href="delete?id=${documents.id}">删除</a></td>        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>