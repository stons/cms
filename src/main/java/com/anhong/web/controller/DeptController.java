package com.anhong.web.controller;

import com.anhong.entity.Dept;
import com.anhong.entity.User;
import com.anhong.service.DeptService;
import com.anhong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping("form")
    public String form(Model model, Long id){
        if(Objects.nonNull(id)){
            model.addAttribute("dept",deptService.queryById(id));
        }
        return "/dept/form";
    }

    @PostMapping("save")
    public String save(Dept dept){
        deptService.save(dept);
        return  "redirect:list";
    }

    @RequestMapping("list")
    public String list(Model model){
        List<Dept> depts = deptService.queryAll();
        Dept dept = new Dept();
        dept.setName("xiaomin");
        dept.setId(1L);
        depts.add(dept);
        model.addAttribute("deptList",depts);
        return "/dept/list";
    }
    @RequestMapping("delete")
    public String delete(Model model,Long id){
        deptService.delete(id);
        return "/dept/list";
    }
}
