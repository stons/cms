package com.anhong.web.controller;

import com.anhong.entity.Employee;
import com.anhong.entity.User;
import com.anhong.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("form")
    public String form(Model model, Long id){
        if(Objects.nonNull(id)){
            model.addAttribute("employee",employeeService.queryById(id));
        }
        model.addAttribute("test","123123");
        return "/employee/form";
    }@PostMapping("save")
    public String save(Employee employee){
        employeeService.save(employee);
        return  "redirect:list";
    }

    @RequestMapping("list")
    public String list(Model model){
        List<Employee> employees = employeeService.queryAll();
        Employee employee = new Employee();
        employee.setAddress("xiaomin");
        employee.setId(1L);
        employees.add(employee);
        model.addAttribute("employeeList",employees);
        return "/employee/list";
    }

    @RequestMapping("delete")
    public String delete(Model model,Long id){
        employeeService.delete(id);
        return "/user/list";
    }
}
