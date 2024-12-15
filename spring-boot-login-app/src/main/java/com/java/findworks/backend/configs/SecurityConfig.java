package com.java.findworks.backend.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.java.findworks.backend.services.CustomUserDetailsService;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    private final CustomUserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfig(CustomUserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests
                        -> authorizeRequests
                        .requestMatchers("/candidate/**").hasAnyRole("USER", "ADMIN", "COMPANY")
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .anyRequest().permitAll()
                )
                .formLogin(formLogin
                        -> formLogin
                        .loginPage("/login")
                        .defaultSuccessUrl("/candidate/", true)
                        .permitAll()
                )
                .logout(logout
                        -> logout
                        .permitAll()
                );

        return http.build();
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }
}