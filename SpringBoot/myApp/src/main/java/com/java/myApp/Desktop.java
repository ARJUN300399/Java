package com.java.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public String Machine(){
        return "I am a laptop";
    }
}
