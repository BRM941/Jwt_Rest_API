package com.jwt_rest_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Home page here");
    }

    @GetMapping("/admin_home")
    public ResponseEntity<String> adminHome(){
        return ResponseEntity.ok("Admin home page here");
    }

}
