package com.ksodhi.quick.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld { //clean compile test package verify

    @GetMapping(path="/hello")
    public String helloWorld(){
        return "Hello world bro";
    }
}
