package com.my.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class UtilityController {
    @GetMapping("/date")
    public String date(Model model) {
        LocalDateTime now = LocalDateTime.now();
        model.addAttribute("now", now);
        return "/util/current";
    }
}
