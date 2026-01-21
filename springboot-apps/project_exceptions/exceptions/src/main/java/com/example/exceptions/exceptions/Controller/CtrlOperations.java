package com.example.exceptions.exceptions.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/operations")

public class CtrlOperations {

    @GetMapping("/divide")
    public String divide() {
        float value = 10 / 0;
        return "Result: " + value;
    }
    
}
