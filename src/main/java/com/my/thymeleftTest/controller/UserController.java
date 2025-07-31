package com.my.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
// localhost:8080/user
public class UserController {
    @GetMapping("/login")
    // localhost:8080/user/login
    public String userLogin() {
        return "/user/userLogin";
    }

    @GetMapping("/info")
    // localhost:8080/user/login
    public String userInfo() {
        return "/user/userInfo";
    }

    @GetMapping("/login/success")
    // localhost:8080/user/login
    public String userLoginSuccess() {
        return "/user/userLoginSuccess";
    }

    @GetMapping("saveInfo")
    public String userInfoSave() {
        System.out.println("사용자 정보를 저장했어요");
        return "redirect:/main";
    }
}
