package com.java.simpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String Greet(){
        return "HelloJi....Sab Changa Si? !!!";
    }
}
