package com.nhn.rookie8.sample.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HelloController {


    @GetMapping("/")
    @ResponseBody
    public String welcome(Model model) {
        return "hello world";
    }

    @GetMapping("/account/helloworld")
    @ResponseBody
    public String accountWelcome(Model model) {
        return "hello world";
    }


}
