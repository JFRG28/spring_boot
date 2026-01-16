package com.jfrg.spring.app1.springboot_apps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jfrg.spring.app1.springboot_apps.models.Employee;

@Controller
public class ExampleController {
    @GetMapping("/info_details")

    public String info(Model model) {
        Employee emp = new Employee("John", "Doe", null, "Developer", 30, 5551234, 1);
        model.addAttribute("Employee", emp);
        return "info_details";
    }

/* 
    public String info(Model model) {
        model.addAttribute("title", "Info Details Page");
        model.addAttribute("message", "This is the info details page served by Thymeleaf template.");
        model.addAttribute("footer", "Footer of Info Details Page");
        return "info_details";
    }
*/
}
