package com.ksodhi.quick.start.services;

import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter{
    @Override
    public String print() {
        return "blue";
    }
}
