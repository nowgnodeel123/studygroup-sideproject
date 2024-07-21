package com.megazone.recruit.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/", "/main"})
    public String main(Model model) {
        System.out.println("main");
        

        return "/main/main";
    }
}
