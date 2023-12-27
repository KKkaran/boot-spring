package com.ksodhi.quick.start;

import com.ksodhi.quick.start.services.ColourPrinter;
import com.ksodhi.quick.start.services.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class QuickStartApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;
	public QuickStartApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(QuickStartApplication.class, args);
	}

	@Override
	public void run(final String... args){
//		final ColourPrinter colourPrinter = new ColourPrinterImpl();
		log.info(colourPrinter.print());
	}


}
