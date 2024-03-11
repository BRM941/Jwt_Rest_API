package com.jwt_rest_api.service;

import com.jwt_rest_api.model.User;

import java.util.List;

public interface UserService {
    public String createUser(User user);
    public String updateUser(User user);
    public String deleteUser(String userId);
    public User getUser(String userId);
    public List<User> getAllUsers();

}
