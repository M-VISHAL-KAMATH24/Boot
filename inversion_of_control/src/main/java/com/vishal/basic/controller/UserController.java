package com.vishal.basic.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vishal.basic.repository.UserRepository;
import com.vishal.basic.service.UserService;
import com.vishal.basic.service.UserService2;


@RestController
public class UserController {

    @Autowired
    public UserService userService;
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public UserService2 userService2;

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
    @GetMapping("/getconfig")
    public String getConfiguration(){
        return userService2.get_config();
    }
    
}
