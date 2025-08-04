package com.my.thymeleftTest.controller;

import com.my.thymeleftTest.dto.IveMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        member.setMemberName("안유진");
        member.setAge(22);
        member.setAddress("서울");
        System.out.println(member);
        model.addAttribute("member", member);

        // 리스트 보내기
        List<IveMember> memberList = new ArrayList<>();
        IveMember iveMember = new
                IveMember("이서", 23, "제주도");
        memberList.add(iveMember);
        model.addAttribute("list", memberList);

        // Map으로 보내기
        Map<String, IveMember> map = new HashMap<>();
        IveMember hong = new
                IveMember("홍길동", 30, "울릉도");
        map.put("h", hong);

        IveMember park = new
                IveMember("박보검", 35, "인천");
        map.put("p", park);
        model.addAttribute("map", map);
        return "/basic/variable_object";
    }
}


















