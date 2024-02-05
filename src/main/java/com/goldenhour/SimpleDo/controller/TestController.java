package com.goldenhour.SimpleDo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("test")
    public String test(Model model) {

        return "test"; // "/test" 대신 "test"만 반환
    }
}
