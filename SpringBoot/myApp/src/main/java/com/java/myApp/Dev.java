package com.java.myApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Dev {
    @Autowired
    @Qualifier("desktop")
    private Computer comp;
    public  void build(){
        System.out.println("Learning Spring boot");
        System.out.println(comp.Machine());
    }
}
