package com.cx.mylogserver.controller;

import com.cx.mylogserver.mysqlHelper.model.User;
import com.cx.mylogserver.mysqlHelper.serverimpl.UserServerimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServerimpl userServerimpl;

    @RequestMapping("/getuserlist")
    public List<User> getUserList(){
        return userServerimpl.getUserList();
    }

    @GetMapping("/addUser")
    public String addUser(User user){
        return userServerimpl.AddUser(user);
    }
}
