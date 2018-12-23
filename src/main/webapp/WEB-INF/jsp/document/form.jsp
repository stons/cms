<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
<head>

</head>

<body>

<form action="save" method="post">
    <input name="title" value="${document.title}">
    <input name="filename" value="${document.filename}">
    <input name="remark" value="${document.remark}">
    <input name="neirong" value="${document.neirong}">
    <input name="keshi" value="${document.keshi}">
    <input name="shoukeren" value="${document.shoukeren}">
    <button  type="submit">提交</button>
</form>
</body>
</html>