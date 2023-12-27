package com.ksodhi.quick.start.services;

import org.springframework.stereotype.Component;

public class EnglishRedPrinter implements RedPrinter{
    @Override
    public String print() {
        return "red";
    }
}
