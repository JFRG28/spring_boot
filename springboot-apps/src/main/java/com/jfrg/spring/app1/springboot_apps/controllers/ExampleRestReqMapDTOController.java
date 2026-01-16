package com.jfrg.spring.app1.springboot_apps.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jfrg.spring.app1.springboot_apps.models.dto.ClassDTO;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")

public class ExampleRestReqMapDTOController {
    @GetMapping("/info_details_rest_dto")

    public ClassDTO info_details_rest() {
        ClassDTO classDTO = new ClassDTO();
        classDTO.setRole("Administrator");
        classDTO.setUserName("Paco");
        return classDTO;
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
