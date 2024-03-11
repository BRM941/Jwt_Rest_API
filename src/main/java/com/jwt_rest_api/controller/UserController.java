package com.jwt_rest_api.controller;

import com.jwt_rest_api.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    User user;
    @GetMapping("{userId}")
    public User getUserDetails(String userId){
        return user;
    }

    @PostMapping
    public String createUserDetails(@RequestBody User user){
        this.user = user;
        return "User Created Successfully";
    }

    @PutMapping
    public String updateUserDetails(@RequestBody User user){
        this.user = user;
        return "User Updated Successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUserDetails(String userId){
        this.user = null;
        return "User Deleted Successfully";
    }

}
