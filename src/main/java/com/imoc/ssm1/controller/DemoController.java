package com.imoc.ssm1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xinran.Yue
 * @create 2019-06-16 15:37
 */
@Controller
public class DemoController {
    public static void main(String[] args) {
        System.out.println("hhhhhh");
    }
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello,body!";
    }
}
