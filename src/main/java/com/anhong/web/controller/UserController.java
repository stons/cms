package com.anhong.web.controller;

import com.anhong.entity.User;
import com.anhong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("form")
    public String form(Model model,Long id){
        if(Objects.nonNull(id)){
            model.addAttribute("user",userService.queryById(id));
        }
        return "/user/form";
    }

    @PostMapping("save")
    public String save(User user){
        userService.save(user);
        return  "redirect:list";
    }

    @RequestMapping("list")
    public String list(Model model){
        List<User> users = userService.queryAll();
        User user = new User();
        user.setUserName("xiaomin");
        user.setId(1L);
        users.add(user);
        model.addAttribute("userList",users);
        return "/user/list";
    }
    @RequestMapping("delete")
    public String delete(Model model,Long id){
        userService.delete(id);
        return "/user/list";
    }

}
