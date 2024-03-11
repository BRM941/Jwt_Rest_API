package com.jwt_rest_api.configuration;

import com.jwt_rest_api.filter.JwtAuthenticationFilter;
import com.jwt_rest_api.model.User;
import com.jwt_rest_api.service.JwtService;
import com.jwt_rest_api.service.UserService;
import com.jwt_rest_api.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FilterConfig {
    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter(JwtService jwtService, UserServiceImpl userService){
        return new JwtAuthenticationFilter(jwtService,userService);
    }
    @Bean
    public UserService userService(){
        return new UserService() {
            @Override
            public String createUser(User user) {
                return null;
            }

            @Override
            public String updateUser(User user) {
                return null;
            }

            @Override
            public String deleteUser(String userId) {
                return null;
            }

            @Override
            public User getUser(String userId) {
                return null;
            }

            @Override
            public List<User> getAllUsers() {
                return null;
            }
        };
    }

}
