package com.ksodhi.quick.start.services;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter{
    @Override
    public String print() {
        return "green";
    }
}
