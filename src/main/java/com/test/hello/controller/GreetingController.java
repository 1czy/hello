package com.test.hello.controller;

import com.test.hello.dto.R;
import com.test.hello.entity.Greeting;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
    //返回页面
/*
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }

 */
    //返回页面的json @ResponseBody 会把数据返回成json格式
    @PostMapping("/greeting")
    public R greetingSubmit(@ModelAttribute Greeting greeting, Model model, HttpServletResponse response) {
        List list = new ArrayList();
        list.add(greeting);
        list.add(greeting);
        return R.success(list);
    }



}
