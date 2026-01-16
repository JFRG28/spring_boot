package com.jfrg.spring.app1.springboot_apps.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {
    @GetMapping("/detail")
    public ParamDTO getDetail(@RequestParam(required = false, defaultValue = "Default msg") String paramInfo) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setInfo(paramInfo);
        return paramDTO;
    }
}
