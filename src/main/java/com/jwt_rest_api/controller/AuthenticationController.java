package com.jwt_rest_api.controller;

import com.jwt_rest_api.model.AuthenticationResponse;
import com.jwt_rest_api.model.User;
import com.jwt_rest_api.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthenticationController {
    private final AuthenticationService authService;
    public AuthenticationController(AuthenticationService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody User request){
        return ResponseEntity.ok(authService.register(request));
    }

    //ResponseEntity<AuthenticationResponse>
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody User request){
        return ResponseEntity.ok(authService.authenticate(request));
    }



}
