package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.service.DemoService;

@Controller
public class DemoController {
    
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/home")
    public String home(@RequestParam(value="cnt1") int cnt1, @RequestParam(value="cnt2") int cnt2) {
        demoService.registerDemo(cnt1, cnt2);
        return "home";
    }
    
    @RequestMapping(value = "/all")
    public String getAll() {
    	Integer cnt = demoService.getCnt();
        return "home";
    }
}
