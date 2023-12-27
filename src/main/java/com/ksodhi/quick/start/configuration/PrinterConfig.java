//package com.ksodhi.quick.start.configuration;
//
//import com.ksodhi.quick.start.services.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class PrinterConfig {
//
//    @Bean
//     public BluePrinter bluePrinter(){
//        return new SpanishBluePrinter();
//    }
//
//    @Bean
//    public RedPrinter redPrinter(){
//        return new SpanishRedPrinter();
//    }
//
//    @Bean
//    public GreenPrinter greenPrinter(){
//        return new SpanishGreenPrinter();
//    }
//
//    @Bean
//    public ColourPrinter c(RedPrinter r, BluePrinter b, GreenPrinter g){
//        return new ColourPrinterImpl(r, b, g);
//    }
//
//}
