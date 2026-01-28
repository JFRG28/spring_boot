package com.example.hibernate.hibernate.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.example.hibernate.hibernate.Services.SrvUser;

@Configuration
@EnableWebSecurity

public class SecConfig {

    private final SrvUser srvUser;

    public SecConfig(SrvUser srvUser) {
        this.srvUser = srvUser;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration paramAuthenticationConfiguration) throws Exception {
        return paramAuthenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity paramHttpSecurity, AuthenticationManager paramAuthMngr) throws Exception { 
        paramHttpSecurity.
            csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**").permitAll()
                .requestMatchers("/api/articles/**").hasAnyRole("ADMIN","USER")
                .anyRequest().authenticated()
            )
            .authenticationManager(paramAuthMngr)
            .userDetailsService(srvUser)
            .formLogin(form -> form.permitAll())
            .httpBasic(basic -> {});
            
        return paramHttpSecurity.build();
    }
}
