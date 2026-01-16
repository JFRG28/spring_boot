package com.jfrg.spring.app1.springboot_apps.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jfrg.spring.app1.springboot_apps.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")

public class ExampleRestReqMapController {
    @GetMapping("/info_details_rest")

    public Map<String, Object> info_details_rest() {
        Employee emp = new Employee("John", "Doe", "123 Main St", "Developer", 30, 5551234, 1);
        Map<String, Object> response = new HashMap<>();
        response.put("Employee", emp);
        return response;
    }
    
/*     
    @RequestMapping(path="/info_details_rest", method=RequestMethod.GET)

    public Map<String, Object> info_details_rest() {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Info Details Page");
        response.put("message", "This is the info details page served by Thymeleaf template.");
        response.put("footer", "Footer of Info Details Page");
        return response;
    }
*/
}
