package com.java.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public String Machine(){
        return "I am a laptop";
    }
}
