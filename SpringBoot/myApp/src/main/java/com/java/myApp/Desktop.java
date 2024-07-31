package com.java.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public String Machine(){
        return "I am a Desktop";
    }
}
