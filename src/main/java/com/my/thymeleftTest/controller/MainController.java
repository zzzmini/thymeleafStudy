package com.my.thymeleftTest.controller;

import com.my.thymeleftTest.dto.IveMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @GetMapping("/each")
    public String eachTest(Model model) {
        List<IveMember> iveMembers = new ArrayList<>(
                Arrays.asList(
                        new IveMember("장원영",21, "서울" ),
                        new IveMember("안유진",22, "대구" ),
                        new IveMember("이서",19, "대전" ),
                        new IveMember("가을",21, "부산" )
                )
        );
        model.addAttribute("ive", iveMembers);
        return "/user/for_each";
    }
}
