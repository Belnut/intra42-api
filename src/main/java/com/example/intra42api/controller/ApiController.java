package com.example.intra42api.controller;

import com.example.intra42api.api.intra42.Intra42;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ApiController {

    private Intra42 intra42;

    @GetMapping("/me")
    public Object getMe() {
        return intra42.getCustomRequestGet("v2/me");
    }
}
