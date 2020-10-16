package com.zfc.controller;

import com.zfc.pojo.User;
import com.zfc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Author: zfc
 * Date: 2020/10/16
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String list(Model model){
        List<User> list = userService.list();
        model.addAttribute("userList", list);
        return "index";
    }
}
