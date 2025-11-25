package com.vishal.basic.service;
import com.vishal.basic.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public String getProfile(){
        return "Name: "+getName()+" "+"Email: "+userRepository.getEmail()+" ";
    }
    public String getName(){

        return "M Vishal Kamath";
    }    
}
