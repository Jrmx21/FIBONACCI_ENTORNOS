package es.iessoterohernandez.daw.endes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

//HOLA MUNDO

public class HelloWorldPdf 
{
    public static void main( String[] args ) throws FileNotFoundException, DocumentException
    {
    	Document documento = new Document();
		
    	FileOutputStream documentoPdf = new FileOutputStream("HelloWorldPdf.pdf");
		
    	PdfWriter.getInstance(documento,documentoPdf).setInitialLeading(30);
		
    	documento.open();
		
    	documento.add(new Paragraph("Hola Mundo"));
		
    	System.out.println("Creado correctamente");
		
    	documento.close();
    }
}
