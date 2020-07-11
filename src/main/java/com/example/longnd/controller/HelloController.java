package com.example.longnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello";
    }

    @PostMapping(value = "getText")
    @ResponseBody
    public Map<String, String> getText() {
        return Map.of("text", "This is demo for ajax Jquery");
    }
}
