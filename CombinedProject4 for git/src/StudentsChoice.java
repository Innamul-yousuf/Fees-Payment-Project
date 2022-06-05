import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentsChoice {
public static void main(String[] args){
	Choice choice=new Choice();
	choice.Choice();
}
}
class Choice{
	public void Choice() {
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
	    	System.out.println("Enter your email...");
	    	Scanner email=new Scanner(System.in);
	    	String emailid=email.nextLine();
	    	System.out.println("Your Email id..."+emailid);
	    	System.out.println("Fees bill and bank details sent to your email");
	    	System.out.println("Your register no is your password");
	    	break;
	    case 2:
	    	System.out.println("Fees pending...");
	    	System.out.println("thank you");
	    	break;
	    }
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}