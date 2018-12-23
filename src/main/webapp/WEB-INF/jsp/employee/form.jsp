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
    <input name="name" value="${employee.name}">
    <input name="gender" value="${employee.gender}">
    <input name="cardId" value="${employee.cardId}">
    <input name="birthday" value="${employee.birthday}">
    <input name="postcode" value="${employee.postcode}">
    <input name="jobid" value="${employee.jobid}">
    <input name="race" value="${employee.race}">
    <input name="education" value="${employee.education}">
    <input name="phone" value="${employee.phone}">
    <button  type="submit">提交</button>
</form>
</body>
</html>