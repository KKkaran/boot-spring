package com.ksodhi.quick.start.services;

import org.springframework.stereotype.Component;

@Component
public class SpanishRedPrinter implements RedPrinter{
    @Override
    public String print() {
        return "spanishRed";
    }
}
