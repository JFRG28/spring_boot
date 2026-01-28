package com.example.hibernate.hibernate;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("admin123"));
    }

}
