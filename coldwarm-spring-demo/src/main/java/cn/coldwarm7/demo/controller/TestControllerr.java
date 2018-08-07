package cn.coldwarm7.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by coldwarm on 2018/8/7.
 */
@RequestMapping("/testt")
@Controller
public class TestControllerr {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello!!!");
        return "hello";
    }

}

