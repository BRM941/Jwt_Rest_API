package com.jwt_rest_api.service.impl;

import com.jwt_rest_api.exception.UserNotFoundException;
import com.jwt_rest_api.model.User;
import com.jwt_rest_api.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public String createUser(User user) {
        userRepository.save(user);
        return "User created successfully";
    }


    public String updateUser(User user) {
        userRepository.save(user);
        return "User updated successfully";
    }


    public String deleteUser(Integer userId) {
        if(userRepository.findById(userId).isEmpty())
            throw new UserNotFoundException("This user does not exist");
        userRepository.deleteById(userId);
        return "User deleted successfully";
    }


    public User getUser(Integer userId) {
        if(userRepository.findById(userId).isEmpty())
            throw new UserNotFoundException("This user does not exist");
        return userRepository.findById(userId).get();
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
