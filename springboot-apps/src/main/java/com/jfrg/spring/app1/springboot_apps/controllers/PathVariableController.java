package com.jfrg.spring.app1.springboot_apps.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/path-variables")

public class PathVariableController {
    @GetMapping("/page1/{msg}")
    public ParamDTO getPage1(@PathVariable String msg) {
        ParamDTO param1 = new ParamDTO();
        param1.setInfo(msg);
        return param1;
    }

}
