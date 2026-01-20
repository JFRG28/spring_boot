package com.example.library.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceBook {
    public String findBook(String title) {
        if ("El Quijote".equalsIgnoreCase(title)) {
            return "Book found";
        }   else {
                return "Book not found";
        }
    }
}
