package com.example.intra42api.controller;

import com.example.intra42api.api.intra42.Intra42;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
@AllArgsConstructor
public class PageController {
    private final Intra42 intra42;

    @GetMapping("/")
    public String index(Model model) {
        Map<String, Object> rst = intra42.getCustomRequestGet("v2/me");
        User user = new User();
        user.setId(rst.get("login").toString());
        model.addAttribute("user", user);
        return "index";
    }
}
