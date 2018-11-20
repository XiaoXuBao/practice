package com.bxx.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Hello")
public class MainController {

    @RequestMapping(value = "hello", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

}
