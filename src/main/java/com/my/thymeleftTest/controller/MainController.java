package com.my.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // http://localhost:8080/main
    // http://localhost:8080/
    @GetMapping({"main", "/"})
    public String mainPage() {
        return "mainPage";
    }

    @GetMapping("/link")
    public String linkPage() {
        return "/link/link_test";
    }
}
