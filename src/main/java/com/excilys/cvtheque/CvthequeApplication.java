package com.excilys.cvtheque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excilys.cvtheque.tools.PdfReadTools;
import com.itextpdf.text.pdf.PdfReader;

@SpringBootApplication
public class CvthequeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CvthequeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		StringBuilder filePath=new StringBuilder("static/Profile2.pdf");
		
		PdfReadTools pdf=new PdfReadTools(filePath);
		System.out.println(pdf.read());
		
	}

}
