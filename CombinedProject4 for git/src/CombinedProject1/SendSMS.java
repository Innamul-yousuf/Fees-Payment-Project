package CombinedProject1;

//package lombok;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS extends ReenaMiss{ 
//	static public String TeaName="Mrs. Reena";
//	  static public String TeaCon="+917010395318";
	
	SheelaMiss rem=new SheelaMiss();
//Arun ar1=new Arun();

	// private static String username = System.getenv("AC183e3c9938c49c71dd6760145390304f");
	   // private static String password = System.getenv("474409611eed08082589e3c0f6ce111a");
    public static final String ACCOUNT_SID="AC183e3c9938c49c71dd6760145390304f";
    public static final String AUTH_TOKEN="474409611eed08082589e3c0f6ce111a";

    public static void main(String[] args) {
    	
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber(TeaCon), 
                        new PhoneNumber("+19403986635"), 
                        "Fees Paid... Give give allow to write his exam")
                .create();
        System.out.println(message.getSid());
        System.out.println("Updated with your Class Miss");;
    }
}
