package com.bluroe.printing;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;
import java.awt.print.PrinterJob;
import java.awt.print.PrinterException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, PrinterException
    {
        String filename = "./example.pdf";
        PDDocument document = PDDocument.load(new File(filename));
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPageable(new PDFPageable(document));
        if(job.printDialog()) {
        	job.print();	
        }
    }
}
