package CombinedProject1;

import java.io.FileOutputStream;  
import com.itextpdf.text.Document;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.PdfWriter;  
public class TeackerEmail  extends StudentsDetails
{  
	
private static String up_arun = "8001";  
private static String up_abdul = "8002";


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
	
	TeaPdfG();
	
//	
//	SwiUpi sw=new SwiUpi();
//	sw.SwiUpi();
//System.out.println("Students Confirmation...");
//	Arun ar=new Arun();
//	ar.ArunDetails();
}

public static void TeaPdfG()  {	
try  
{  
//location where PDF will be generated    
FileOutputStream fos = new FileOutputStream("D:\\Pdf Generrator\\Teachere.pdf");  
System.out.println(" ");  
//creates an instance of PDF document  
Document doc = new Document();  
//doc writer for the PDF  
PdfWriter writer = PdfWriter.getInstance(doc, fos);  
writer.setEncryption(up_arun.getBytes(), up_abdul.getBytes(), PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);  
//opens the PDF  
doc.open();  
//adding paragraphs to the PDF 

doc.add(new Paragraph("                     THE EVE SCHOOL MATRICULATION HIGHER SEC. SCHOOL)"));  
doc.add(new Paragraph("                              FEES BILL"));
doc.add(new Paragraph("Registration Number"+StudentsDetails.rn));
doc.add(new Paragraph("               ---- ---  ---  --  --- --- ---                                   "));
doc.add(new Paragraph("Fees Paid"));
doc.add(new Paragraph("               ---  -----  -----  ----  -----  ")); 
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
