package com.example.interceptors.interceptors.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class CtrlInterceptor {

    @GetMapping("/api/greetings")

    public String Greetings() {
        return "Testing interceptors";
    }
    
    

}
