package com.jfrg.spring.app1.springboot_apps.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jfrg.spring.app1.springboot_apps.models.Employee;

@RestController
@RequestMapping("/api/path-variables")

public class PathVariableController {
    
    @Value("${config.usuario}")
    private String usuario;
    @Value("${config.mensaje}")
    private String mensaje;
    @Value("${config.codigo}")
    private int codigo;
    @Value("${config.valores}")
    private String[] valores;

    @GetMapping("/page1/{msg}")
    public ParamDTO getPage1(@PathVariable String msg) {
        ParamDTO param1 = new ParamDTO();
        param1.setInfo(msg);
        return param1;
    }

    @PostMapping("/create-employee")
    public Employee createEmployee(@RequestBody Employee paramEmployee) {
        return paramEmployee;
    }

    @GetMapping("/values")
    public Map<String, Object> getValues() {
        Map<String, Object>json = new HashMap<>();
        json.put("usuario", usuario);
        json.put("mensaje", mensaje);
        json.put("código", codigo);
        json.put("valores", valores);
        return json;
    }
}