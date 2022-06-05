package CombinedProject1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Students {
public static void main(String[] args)throws Exception{
	StudentsDetails0 student=new clastd();
	
	
	student.gestd();//standard
	student.gede();//name
	
	
	

//	Arun arund=new Arun();
//	arund.ArunDetails();

}
}
abstract class StudentsDetails0{
	Arun arun=new Arun();
    Abdul abdul=new Abdul();
	Innamul innamul=new Innamul();
	Yousuf yousuf=new Yousuf();
	Zath zath=new Zath();
	Wahid wahid=new Wahid();
	Shufi shufi=new Shufi();
	Shafi shafi=new Shafi();
	Kalam kalam=new Kalam();
	Razaq razaq=new Razaq();
	Ansari ansari=new Ansari();
	//Abu abu=new Abu();
	//Sulab sulab=new Sulab();
	
	
	
	public String SclName="The New School";
	public String SclAdd="No. 72, New Street, Padi, Chennai-50";
	public String Phono="701039531888";
	protected abstract void gestd();

    
    public void gede() {
    	try {
//    System.out.println("Enter Your Name:");
//    java.lang.String name=input.readLine();
//    System.out.print("Enter your DOB");
//    java.lang.String dob=input.readLine();
   
	
//    switch(name) {
//    case "Arun":
//    System.out.println(SclName);
//    
//    arun.ArunDetails();//printing details
//    }
    System.out.println("Enter your roll no:");
    Scanner rolno=new Scanner(System.in);
	int rn=rolno.nextInt();
    switch(rn) {
    case 8001:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	arun.ArunDetails();
    	break;
    case 8002:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	abdul.AbdulDetails();
    	break;
    case 8003:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	innamul.InnamulDetails();
    	break;
    case 8004:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	yousuf.YousufDetails();
    	break;
    case 8005:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	zath.ZathDetails();
    	break;	
    case 8006:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	wahid.WahidDetails();
    	break;
    case 8007:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	shufi.ShufiDetails();
    	break;	
    case 8008:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	shafi.ShafiDetails();
    	break;
    	
    case 8009:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	kalam.KalamDetails();
    	break;
    	
    case 8010:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	razaq.RazaqDetails();
    	break;
    	
    case 8011:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	ansari.AnsariDetails();
    	break;
    
    case 8012:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	//abu.AbuDetails();
    	break;
    	
    case 8013:
    	System.out.println(SclName);
    	System.out.println(SclAdd);
    	System.out.println(Phono);
    	//sulab.SulabDetails();
    	break;
    }
    
    	 
    	
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
    
	}


class clastd extends StudentsDetails0{
	@Override
	public void gestd() {
	//string fees;
	System.out.println("Enter the standard...");
	Scanner std=new Scanner(System.in);
	int stdd=std.nextInt();
	
	
	switch (stdd) {
	
	case 1:
		//int fees=1000;
		System.out.println("fees=1000");
		//fees="1000";
		break;
	case 2:
		
		System.out.println("fees=2000");
		//fees="2000";
		break;
	case 3:
		System.out.println("fees=3000");
		//fees="3000";
		break;
	case 4:
		System.out.println("fees=4000");
		//fees=4000;
		break;
	case 5:
		System.out.println("fees=5000");
		//fees=5000;
		break;
	case 6:
		System.out.println("fees=6000");
		//fees=6000;
		break;
	case 7:
		System.out.println("fees=7000");
		//fees=7000;
		break;
	case 8:
		System.out.println("fees=8000");
		//fees=8000;
		break;
	case 9:
		System.out.println("fees=9000");
		//fees=9000;
		break;
	case 10:
		System.out.println("fees=10000");
		//fees=10000;
		break;
	case 11:
		System.out.println("fees=11000");
		//fees=11000;
		break;
	case 12:
		System.out.println("fees=12000");
		//fees=12000;
		break;
		default:
			System.out.println("Incorrect data...");
	}

	//try {Thread.sleep(2000);}catch(Exception e) {}
	}
	//try {Thread.sleep(5000);}catch(Exception e) {}
	//InputStreamReader reader=new InputStreamReader(System.in);
	//BufferedReader in=new BufferedReader(reader);
	//String stddd=in.readLine();
	

}
class fees extends clastd{
	void printfee() {
	//clastd fe=new clastd();
	
		//System.out.println(fees);
	}
}
//Arun 8001 Details
class Arun0 extends Students{
	
	
//	public void gestd() {
//	System.out.println("standard"+std);	
//	}
	void ArunDetails() {
	String name="Arun";
	String Pname="Vrun Fater of arun...";
	String RegNo="2013181058001";
	String Class="I";
	String Batch="A";
	String Dob="23-01-2001";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}
//Abdul-8002 details
class Abdul0 extends Students{
	

	void AbdulDetails() {
	String name="abdul";
	String Pname="wahab Fater of abdul...";
	String RegNo="2013181058002";
	String Class="II";
	String Batch="B";
	String Dob="28-9-2018";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}
//Innamul 8003 details
class Innamul0 extends Students{
	

	void InnamulDetails() {
	String name="Innamul";
	String Pname="Rajab Fater of innamul...";
	String RegNo="2013181058003";
	String Class="III";
	String Batch="C";
	String Dob="03-8-2017";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}
//Yousuf 8004 details
class Yousuf0 extends Students{
	

	void YousufDetails() {
	String name="Yousuf";
	String Pname="Mohammed Fater of Yousuf...";
	String RegNo="2013181058004";
	String Class="IV";
	String Batch="C";
	String Dob="11-8-2016";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}

//zath 8005 details
class Zath0 extends Students{
	

	void ZathDetails() {
	String name="zath";
	String Pname="Basha Fater of zath...";
	String RegNo="2013181058004";
	String Class="III";
	String Batch="C";
	String Dob="03-8-2015";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}

//Wahid 8006
class Wahid0 extends Students{
	

	void WahidDetails() {
	String name="Wahid";
	String Pname="Yehiya Fater of zath...";
	String RegNo="2013181058006";
	String Class="v";
	String Batch="C";
	String Dob="26-3-2016";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}

class Shufi0 extends Students{
	

	void ShufiDetails() {
	String name="Shufi";
	String Pname="Shafi Fater of zath...";
	String RegNo="2013181058007";
	String Class="VI";
	String Batch="A";
	String Dob="11-1-2015";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}


//Shafi 8007
class Shafi0 extends Students{
	

	void ShafiDetails() {
	String name="shafi";
	String Pname="Rashid Fater of shafi...";
	String RegNo="2013181058008";
	String Class="VII";
	String Batch="B";
	String Dob="4-2-2014";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}


//kalam 8009
class Kalam0 extends Students{
	

	void KalamDetails() {
	String name="Kalam";
	String Pname="Kajha Fater of kalam...";
	String RegNo="2013181058009";
	String Class="IIX";
	String Batch="C";
	String Dob="22-7-2013";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}


//razaq 8009
class Razaq0 extends Students{
	

	void RazaqDetails() {
	String name="Razaq";
	String Pname="Moidheen Fater of Razaq...";
	String RegNo="2013181058010";
	String Class="IX";
	String Batch="C";
	String Dob="13-1-2012";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}

//ansari 8010
class Ansari0 extends Students{
	

	void AnsariDetails() {
	String name="Ansari";
	String Pname="Sheik Fater of Ansari...";
	String RegNo="2013181058010";
	String Class="X";
	String Batch="C";
	String Dob="27-4-2011";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}

//abu 8011

class Abu0 extends Students{
	

	void AbuDetails() {
	String name="Abu";
	String Pname="Riyas Fater of Abu...";
	String RegNo="2013181058011";
	String Class="XI";
	String Batch="C";
	String Dob="03-8-2010";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}

//Sulab 8012
class Sulab0 extends Students{
	

	void SulabDetails() {
	String name="Sulab";
	String Pname="Shakeer Fater of sul;ab...";
	String RegNo="2013181058012";
	String Class="XII";
	String Batch="C";
	String Dob="03-8-2009";
	System.out.println("Name:"+name);
	System.out.println("Register no"+RegNo);
	//System.out.println("Class"+stdd);
	System.out.println("Dob:"+Dob);
	System.out.println("Batch:"+Batch);
	//System.out.println("fees"+fees);
	}
	}
