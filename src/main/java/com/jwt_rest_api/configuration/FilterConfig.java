package com.jwt_rest_api.configuration;

import com.jwt_rest_api.filter.JwtAuthenticationFilter;
import com.jwt_rest_api.service.JwtService;
import com.jwt_rest_api.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter(JwtService jwtService, UserServiceImpl userService){
        return new JwtAuthenticationFilter(jwtService,userService);
    }


}
