package com.my.thymeleftTest.controller;

import com.my.thymeleftTest.dto.IveMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("basic")
public class ThymeleafController {
    @GetMapping("/infoPrint")
    public String iveInfoPrint(Model model) {
        model.addAttribute("name", "장원영");
        model.addAttribute("age", 21);
        model.addAttribute("data", "Hello <b>Spring</b>");
        return "/basic/ivePrint";
    }

    @GetMapping("/variable")
    public String variable(Model model) {
        IveMember member = new IveMember();
        return "/basic/variable_object";
    }
}
