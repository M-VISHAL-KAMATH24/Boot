package com.vishal.basic.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vishal.basic.repository.UserRepository;
import com.vishal.basic.service.UserService;;


@RestController
public class UserController {

    @Autowired
    public UserService userService;
    @Autowired
    public UserRepository userRepository;

    @GetMapping("/profile")
    public String getProfile(){
        return userService.getProfile();
    }
    @GetMapping("/name")
    public String getName(){
        return userService.getName();
    }
    @GetMapping("/email")
    public String getEmail(){
        return userRepository.getEmail();
    }
    
}
