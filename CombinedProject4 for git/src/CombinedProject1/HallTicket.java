package CombinedProject1;

import java.io.FileOutputStream;  
import com.itextpdf.text.Document;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.PdfWriter;  
public class HallTicket  extends StudentsDetails
{  
	
private static String up_arun = "2013";  
private static String up_abdul = "8001";


public static void main(String args[])   
{  
	
//	StudentsDetails studentD=new StudentsDetails();
//	studentD.gestd();
//	studentD.gede();
//	Pdf();
//	Tes t=new Tes();
//	t.Tes();
//	UpiVer Upi=new UpiVer();
//	Upi.UpiVer();
	
	Hallpdf();
	
//	
//	SwiUpi sw=new SwiUpi();
//	sw.SwiUpi();
//System.out.println("Students Confirmation...");
//	Arun ar=new Arun();
//	ar.ArunDetails();
}

public static void Hallpdf()  {	
try  
{  
//location where PDF will be generated    
FileOutputStream fos = new FileOutputStream("D:\\Pdf Generrator\\Hallticket4.pdf");  
System.out.println("\n\t\tYOUR HALL TICKET HAS BEEN GENERATED SUCESSFULLY");  
//creates an instance of PDF document  
Document doc = new Document();  
//doc writer for the PDF  
PdfWriter writer = PdfWriter.getInstance(doc, fos);  
writer.setEncryption(up_arun.getBytes(), up_abdul.getBytes(), PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);  
//opens the PDF  
doc.open();  
//adding paragraphs to the PDF 

doc.add(new Paragraph("                      THE EVE SCHOOL MAT. HIGHER SEC. SCHOOL"));  
doc.add(new Paragraph("                                       "));
doc.add(new Paragraph("					"));
doc.add(new Paragraph("                            HALL TICKET"));  
doc.add(new Paragraph("			"));  
doc.add(new Paragraph("                            Annual Exam"));
doc.add(new Paragraph("			Register No.:                 "+rn));  
doc.add(new Paragraph("			"));  

doc.add(new Paragraph("										")); 
doc.add(new Paragraph("     Subject        Date        Code"));  
doc.add(new Paragraph("                         			"));  
doc.add(new Paragraph("     Tamil        21-02-2002   Tam01"));  
doc.add(new Paragraph("     English      22-02-2022   Eng02"));  
doc.add(new Paragraph("     Maths        24-02-2022   Mat03"));  
doc.add(new Paragraph("     Science      26-02-2022   Sci04")); 
doc.add(new Paragraph("     Java		27-02-2022    Java05"));  
doc.add(new Paragraph("                                       "));
doc.add(new Paragraph("         All the best          "));
doc.add(new Paragraph("         **Malpractise are not entertained**"));  
//closes the document  
doc.close();  
//closes the output stream  
fos.close();  
}   
//catch the exception if any   
catch (Exception e)   
{  
//prints the occurred exception   
e.printStackTrace();  
}  
} 
}  
