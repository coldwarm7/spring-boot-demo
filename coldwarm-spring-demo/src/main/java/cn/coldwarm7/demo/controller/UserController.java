package cn.coldwarm7.demo.controller;

import cn.coldwarm7.demo.domain.Student;
import cn.coldwarm7.demo.domain.Users;
import cn.coldwarm7.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<Users> findAll(){
        return userService.findAll();
    }
}
