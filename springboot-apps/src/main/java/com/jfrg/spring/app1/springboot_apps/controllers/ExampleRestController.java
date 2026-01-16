package com.jfrg.spring.app1.springboot_apps.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {
    @GetMapping("/info_details_rest")

    public Map<String, Object> info_details_rest() {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Info Details Page");
        response.put("message", "This is the info details page served by Thymeleaf template.");
        response.put("footer", "Footer of Info Details Page");
        return response;
    }

}
