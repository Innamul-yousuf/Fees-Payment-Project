import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import CombinedProject1.SendEmail;

public class choicetest {
	
public static void main(String[] args) {
	
	int option = 0;
	try {
	System.out.println("Enter your Choice...");

	InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("1. Pay Fees..."
    		+ "2. Exit");
    String text=input.readLine();
    option=Integer.parseInt(text);
	}catch(Exception e) {
		System.out.println(e);
	}
	if(option==1) {
		System.out.println("Enter your email...");
		Scanner email=new Scanner(System.in);
		String emailid=email.nextLine();
		System.out.println("Your Email id..."+emailid);
		SendEmail send = new SendEmail(emailid, "I can Change subject what ever i need...Password=1234567", "Allahhu Akbar..."); //change receiver email
	}
	
	else if(option==2) {
		System.out.println("Exiting...");
	}
	else {
		System.out.println("Invalid input");
	}
	
}
}
//class GettingEmail{
//	public GettingEmail() {
//	System.out.println("Enter your email...");
//	Scanner email=new Scanner(System.in);
//	String emailid=email.nextLine();
//	System.out.println("Your Email id..."+emailid);
	
	

	

