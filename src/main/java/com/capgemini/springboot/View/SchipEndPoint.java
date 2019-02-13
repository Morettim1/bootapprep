package com.capgemini.springboot.View;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchipEndPoint {
    @GetMapping("hallo")
    public String lopen(){
        System.out.println("go");
        return "jojo dit werkt";
    }
}