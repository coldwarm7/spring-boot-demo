package cn.coldwarm7.demo.controller;

import cn.coldwarm7.demo.model.User;
import cn.coldwarm7.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Create by coldwarm on 2018/8/7.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/layui")
    public ModelAndView layui(){
        ModelAndView mv = new ModelAndView("demo");
        return mv;
    }
}
