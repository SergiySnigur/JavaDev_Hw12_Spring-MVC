package com.goit7.testapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class TestController {
    @GetMapping("/test")
    public ModelAndView getName() {
        ModelAndView result = new ModelAndView("test");
        result.addObject("test");
        return result;
    }
}
