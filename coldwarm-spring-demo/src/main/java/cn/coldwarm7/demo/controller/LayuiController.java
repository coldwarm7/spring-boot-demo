package cn.coldwarm7.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by coldwarm on 2018/8/7.
 */
@Controller
@RequestMapping("/demo")
public class LayuiController {

    @RequestMapping("/layui")
    public String layuiDemo(){
        return "demo";
    }
}
