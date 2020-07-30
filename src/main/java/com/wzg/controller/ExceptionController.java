package com.wzg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
    @RequestMapping("/e")
    public String test(){
        //System.out.println("111111111111111");
        int i = 1/0;
        return "error";
    }
}
