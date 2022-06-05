package CombinedProject1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



//public class Tester {
//	public static String emailid;
//	public static void main(String[] args) {
//		System.out.println("Enter your Choice...");
//		try {
//			InputStreamReader reader=new InputStreamReader(System.in);
//		    BufferedReader input=new BufferedReader(reader);
//		    System.out.println("1. Pay Fees..."
//		    		+ "2. Exit");
//		    String text=input.readLine();
//		    int option=Integer.parseInt(text);
//
//		    switch(option) {
//		    case 1:
//		    	System.out.println("Enter your email...");
//		    	Scanner email=new Scanner(System.in);
//		    	emailid=email.nextLine();
//		    	//emailid=email.nextLine();
//		    	System.out.println("Your Email id..."+emailid);
//		    	System.out.println("Fees bill and bank details sent to your email");
//		    	System.out.println("Your register no is your password");
//		    	
//		    	break;
//		    case 2:
//		    	System.out.println("Fees pending...");
//		    	System.out.println("thank you");
//		    	break;
//		    }
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//		SendEmail send = new SendEmail(emailid, "I can Change subject what ever i need...Password=1234567", "Allahhu Akbar..."); //change receiver email
//		
//		}
//	}



public class Tester {
	public static void main(String[] args) {
	Tes t=new Tes();
	t.Tes();
		
		
		
}
}

class Tes{
	public static String emailid;
	public  void Tes() {
	
	
		System.out.println("Enter your Choice...");
		try {
			InputStreamReader reader=new InputStreamReader(System.in);
		    BufferedReader input=new BufferedReader(reader);
		    System.out.println("1. Pay Fees..."
		    		+ "2. Exit");
		    String text=input.readLine();
		    int option=Integer.parseInt(text);

		    switch(option) {
		    case 1:
		    	System.out.println("\nEnter your email:");
		    	Scanner email=new Scanner(System.in);
		    	emailid=email.nextLine();
		    	//emailid=email.nextLine();
		    	System.out.println("\nFees bill and hall Ticket will sent to this email id:\t"+emailid);
		    	System.out.println("\nFees bill and bank details sent to your email Successfully");
		    	System.out.println("\nNOTE: First four numbers of your register number is your password");
		    	System.out.println("Pay your fees through online!");
		    	break;
		    case 2:
		    	System.out.println("Fees pending...");
		    	System.out.println("thank you");
		    	break;
		    }
			}catch(Exception e) {
				System.out.println(e);
			}
		
		SendEmail send = new SendEmail(emailid, "Fees Bill-The Eve School", "Fees Bill Recieved. First four digit of your register number is the pdf password. Note: This PDF contains sensible details of the School."); //change receiver email
		
	 }
}
	