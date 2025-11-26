package com.vishal.basic.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService2 {
    @Value("${app.name}")
    private String appName;

    @Value("${user.name}")
    private String user_name;
    
    @Value("${user.email}")
    private String user_email;

    @Value("${user.age}")
    private int user_age;

    public String get_config(){

        return String.format("the overall configuration is"+" "+"app name:"+appName+" user name "+user_name+" "+"  user email "+user_email+" age of the user"+" "+user_age);
    }
}
