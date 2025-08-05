package com.my.thymeleftTest.controller;

import com.my.thymeleftTest.dto.IveMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String linkPage(Model model) {
        IveMember member = new
                IveMember("장원영", 21, "서울");
        model.addAttribute("jang", member);
        return "/link/link_test";
    }
}
