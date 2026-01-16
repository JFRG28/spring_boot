package com.jfrg.spring.app1.springboot_apps.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
    @ModelAttribute("employees")
    public List<Employee> getEmployees() {
        return List.of(
            new Employee("John", "Doe", "Evergreen terrace 123", "Developer", 30, 5551234, 1),
            new Employee("Jane", "Smith", "Oak street 456", "Manager", 40, 5555678, 2),
            new Employee("Alice", "Johnson", null, "Designer", 28, 5558765, 3)
        );
    }
}
