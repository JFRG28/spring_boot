package com.example.library.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.library.Service.ServiceBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 

@RestController
@RequestMapping("/api/library")

public class ControllerLibrary {
    private final ServiceBook serviceBook;

    public ControllerLibrary(ServiceBook serviceBook) {
        this.serviceBook = serviceBook;
    }

    @GetMapping("/{title}")
    public String getBook(@PathVariable String title) {
        return serviceBook.findBook(title);
    }
    
}
