package com.excilys.cvtheque.tools;

import java.io.IOException;
import java.util.Optional;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

public class PdfReadTools {

	private StringBuilder filePath;
	private  PdfReader reader;
	
	public PdfReadTools(StringBuilder filePath) {
		super();
		this.filePath = filePath;
	}
	
	public StringBuilder getFilePath() {
		return filePath;
	}
	public void setFilePath(StringBuilder filePath) {
		this.filePath = filePath;
	}
	public PdfReader getReader() {
		return reader;
	}
	public void setReader(PdfReader reader) {
		this.reader = reader;
	}
	
	@SuppressWarnings("finally")
	public Optional<String> read() {
		String textFromPage = null;
		try {

            reader = new PdfReader(filePath.toString());

            textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

            System.out.println(textFromPage);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
		finally {
			return Optional.ofNullable(textFromPage);
		}
	}
	
	
	
	

}
