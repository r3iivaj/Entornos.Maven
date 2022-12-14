package es.iessoterohernanedez.endes.HelloWorldPdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, DocumentException
    {

    	Document document = new Document();

    	OutputStream outputStream = new FileOutputStream(new File("C:\\Windows\\Temp\\TestFile.pdf")); 
            PdfWriter.getInstance(document, outputStream);
            document.open();
            document.add(new Paragraph("Hola Mundo, soy Javi"));
            document.close();
            outputStream.close();
     
    }
}
