package com.jwt_rest_api.model;

public class AuthenticationResponse {

    private String token;

    public AuthenticationResponse(String token){
        this.token = token;
    }
    public String getToken() {
        return token;
    }
}
