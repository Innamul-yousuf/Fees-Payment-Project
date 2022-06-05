package CombinedProject1;

import java.io.FileOutputStream;
  
import com.itextpdf.text.Document;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.PdfWriter;  
public class GenerateProtectedPdf  extends StudentsDetails 
{  
	
private static String up_arun = "2013";  
private static String up_abdul = "8001";


public static void main(String args[])   
{  
	
	StudentsDetails studentD=new StudentsDetails();
	studentD.gestd();
	studentD.gede();
	Pdf();
	Tes t=new Tes();
	t.Tes();
//	UpiVer Upi=new UpiVer();
//	Upi.UpiVer();
	
	
	
	
	SwiUpi sw=new SwiUpi();
	sw.SwiUpi();
	
//	HallTicket hps=new HallTicket();
//	hps.Hallpdf();
	
	htemailsend htes=new htemailsend();
	htes.htemailsend();
//	
SendSMS smre=new SendSMS();
smre.main(args);
	
//System.out.println("Students Confirmation...");
//	Arun ar=new Arun();
//	ar.ArunDetails();
}
public static void Pdf() {	
try  
{  
//location where PDF will be generated    
FileOutputStream fos = new FileOutputStream("D:\\Pdf Generrator\\pass4.pdf");  
System.out.println("\nFee Bill and Bank Details PDF File generated successfully\n");  
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
doc.add(new Paragraph("Term Fees="+StudentsDetails.fees));
doc.add(new Paragraph("               ---- ---  ---  --  --- --- ---                                   "));
doc.add(new Paragraph("Total Amount to pay:"+StudentsDetails.fees));
doc.add(new Paragraph("               ---  -----  -----  ----  -----  "));
doc.add(new Paragraph("                             Shool Bank Details                               "));
doc.add(new Paragraph("                        IOB Bank(Peters Road)"));  
doc.add(new Paragraph("                                       "));  
doc.add(new Paragraph("Account Holder Name:The Eve School"));  
doc.add(new Paragraph("Account Number: 123-xxx-xxx-234"));  
doc.add(new Paragraph("Branch: Eve School Branch"));  
doc.add(new Paragraph("Branch Code: 10203"));  
doc.add(new Paragraph("Mobile Number: +91 7010*****18"));  
doc.add(new Paragraph("Address: No.21/18, Innamul Street, T.M.P Nagar, Padi, Chennai"));  
  
doc.add(new Paragraph("e-mail: theeveschool@gmial.com"));  

doc.add(new Paragraph("Toll Free Number: 044-9882-xxx"));
doc.add(new Paragraph("                                        "));
doc.add(new Paragraph("IOB Net Banking id: iob@theeveschool"));
doc.add(new Paragraph("HDFC Net Banking id: hdfc@theeveschool"));
doc.add(new Paragraph("UPI ID: theeveschool@paytm"));

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
class htemailsend extends Tes{
	void htemailsend() {
		TeackerEmail te=new TeackerEmail();
		SendEmailhalltic2 send1 = new SendEmailhalltic2(emailid, "hallticket", "HallTicket Recieved.  First four digit of your register number is the password"); //change receiver email
		
	}
}