package CombinedProject1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentsTry {
	public static void main(String[] args) {
		StudentsDetails studentD=new StudentsDetails();
		studentD.gestd();
		studentD.gede();
	}
	
//public static void main(String[] args){
//	StudentsDetails student=new StudentsDetails();
//	
//	
//	student.gestd();//standard
//	student.gede();//name
//	
//}
}
class StudentsDetails{
	
	
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
	//Sulaiman sulai=new Sulaiman();
	//Sulab sulab1=new Sulab();
	
	
	
	public String SclName="\t\tThe Eve School";
	public String SclAdd="\t\tNo. 72, New Street, Padi, Chennai-50";
	public String Phono="\t\t701039531888";
	static public int stdd;
	static public String rn;
	static public int fees;
	
		public static void gestd() {
			System.out.println("\n\t\tTHE EVE SCHOOL MAT. HIGHER SEC.  SCHOOL");
			System.out.println("\n\t\tStudents Online Fees Payment");
			//string fees;
			System.out.println("\nEnter Your Standard:");
			Scanner std=new Scanner(System.in);
			stdd=std.nextInt();
			
			
			switch (stdd) {
			
			case 1:
				fees=1000;
				System.out.println("Term Fees Amount=\t"+fees);
				
				break;
			case 2:
				fees=2000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 3:
				fees=3000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 4:
				fees=4000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 5:
				fees=5000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 6:
				fees=6000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 7:
				fees=7000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 8:
				fees=8000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 9:
				fees=9000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 10:
				fees=10000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 11:
				fees=11000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			case 12:
				fees=12000;
				System.out.println("Term Fees Amount=\t"+fees);
				break;
			default:
				System.out.println("Incorrect Student data...");
				System.exit(0);
				break;
			}
			}
		
		public void gede() {
	    	try {
	    System.out.println("Enter Your Register Number: ");
	    Scanner rolno=new Scanner(System.in);
		rn=rolno.nextLine();
	    switch(rn) {
	    case "2013181058001":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	arun.ArunDetails();
	    	break;
	    case "2013181058002":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	abdul.AbdulDetails();
	    	break;
	    case "2013181058003":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	innamul.InnamulDetails();
	    	break;
	    case "2013181058004":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	yousuf.YousufDetails();
	    	break;
	    case "2013181058005":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	zath.ZathDetails();
	    	break;	
	    case "2013181058006":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	wahid.WahidDetails();
	    	break;
	    case "2013181058007":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	shufi.ShufiDetails();
	    	break;	
	    case "2013181058008":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	shafi.ShafiDetails();
	    	break;
	    	
	    case "2013181058009":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	kalam.KalamDetails();
	    	break;
	    	
	    case "2013181058010":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	razaq.RazaqDetails();
	    	break;
	    	
	    case "2013181058011":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	ansari.AnsariDetails();
	    	break;
	    
	    case "2013181058012":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	//abu.AbuDetails();
	    	break;
	    	
	    case "2013181058013":
	    	System.out.println(SclName);
	    	System.out.println(SclAdd);
	    	System.out.println("Phone No:"+Phono);
	    	//sulab.SulabDetails();
	    	break;
	    default:
	    	System.out.println("Incorect Student Data");
	    	System.exit(0);
	    }
	    
	    	 
	    	
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    }
	    
		}

class Arun extends ReenaMiss{
	ReenaMiss rm=new ReenaMiss();
	
	
	
	static public String TeaName="Mrs. Reena";
	  static public String TeaCon="+917010395318";
	void ArunDetails() {
	String name="Arun Kumar.P";
	String Pname="Praveen Kumar";
	
	//String RegNo="2013181058001";
	//String Class="I";
	String Batch="A";
	String Dob="23-01-2001";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class  "+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	System.out.println("Teacher Name:"+rm.TeaName);
	System.out.println("Teacher Name:"+rm.TeaCon);
	//System.out.println("fees"+fees);
	}
	}		
class Abdul extends Students{
	
	

	void AbdulDetails() {
	String name="Abdul Rahman";
	String Pname="Wahab";
	String RegNo="2013181058002";
	String ClassMiss="+917010395318";
	String Class="II";
	String Batch="B";
	String Dob="28-9-2002";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	
	}
	}
//Innamul 8003 details
class Innamul extends Students{
	

	void InnamulDetails() {
	String name="Innamul";
	String Pname="Rajab Mohammed";
//	String RegNo="2013181058003";
//	String Class="III";
	String Batch="C";
	String Dob="03-8-2004";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class  :"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}
//Yousuf 8004 details
class Yousuf extends Students{
	

	void YousufDetails() {
	String name="Yousuf";
	String Pname="Mohammed";
//	String RegNo="2013181058004";
//	String Class="IV";
	String Batch="C";
	String Dob="11-8-2004";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register no\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}

//zath 8005 details
class Zath extends Students{
	

	void ZathDetails() {
	String name="Zath";
	String Pname="Basha";
//	String RegNo="2013181058004";
//	String Class="III";
	String Batch="C";
	String Dob="03-8-2004";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register no\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}

//Wahid 8006
class Wahid extends Students{
	

	void WahidDetails() {
	String name="Wahid";
	String Pname="Yehiya";
//	String RegNo="2013181058006";
//	String Class="v";
	String Batch="C";
	String Dob="26-3-2007";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}

class Shufi extends Students{
	

	void ShufiDetails() {
	String name="Shufi";
	String Pname="Shafi Ibrahim";
//	String RegNo="2013181058007";
//	String Class="VI";
	String Batch="A";
	String Dob="11-1-2006";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}


//Shafi 8007
class Shafi extends Students{
	

	void ShafiDetails() {
	String name="Shafi";
	String Pname="Rashid Khan";
//	String RegNo="2013181058008";
//	String Class="VII";
	String Batch="B";
	String Dob="4-2-2007";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}


//kalam 8009
class Kalam extends Students{
	

	void KalamDetails() {
	String name="Kalam";
	String Pname="Kajha Mohideen";
//	String RegNo="2013181058009";
//	String Class="IIX";
	String Batch="C";
	String Dob="22-7-2009";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}


//razaq 8009
class Razaq extends Students{
	

	void RazaqDetails() {
	String name="Razaq";
	String Pname="Moidheen Fahad";
//	String RegNo="2013181058010";
//	String Class="IX";
	String Batch="C";
	String Dob="13-1-2009";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}

//ansari 8010
class Ansari extends Students{
	

	void AnsariDetails() {
	String name="Ansari";
	String Pname="Sheik ";
//	String RegNo="2013181058010";
//	String Class="X";
	String Batch="C";
	String Dob="27-4-2012";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}

//abu 8011

class Sulaiman extends Students{
	

	void AbuDetails() {
	String name="Abu";
	String Pname="Riyas Mohammed";
//	String RegNo="2013181058011";
//	String Class="XI";
	String Batch="C";
	String Dob="03-8-2004";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}

//Sulab 8012
class Sulab extends Students{
	

	void SulabDetails() {
	String name="Sulab";
	String Pname="Shakeer Hussain";
	//String RegNo="2013181058012";
	//String Class="XII";
	String Batch="C";
	String Dob="03-8-2004";
	System.out.println("\nName:\t"+name);
	System.out.println("Parents Name:\t"+Pname);
	System.out.println("Register number:\t"+StudentsDetails.rn);
	System.out.println("Class"+StudentsDetails.stdd);
	System.out.println("Dob:\t"+Dob);
	System.out.println("Batch:\t"+Batch);
	}
	}

//class UpiVer{
//public void UpiVer(){
//	
//	System.out.println("Enter Your Transaction id...");
//	Scanner Upii=new Scanner(System.in);
//	String Upiii=Upii.nextLine();
//	if(Upiii=="arun@paytm.8001") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="abdul@paytm.8002") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="innamul@paytm.8003") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058004") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058005") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058006") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058007") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058008") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058009") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058010") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058011") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else if(Upiii=="iob.2013181058012") {
//		System.out.println("Fees Paid");
//		System.out.println("Thank you");
//	}
//	else {
//		System.out.println("Transaction Id Not Matching...");
//		System.out.println("Please try again later");
//	}
//}
}

class SwiUpi{
	void SwiUpi() {
		System.out.println("Enter the transaction id:");
		Scanner Upo=new Scanner(System.in);
		String upoi=Upo.nextLine();
		switch(upoi) {
		case "arun@paytm.8001":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps=new HallTicket();
			hps.Hallpdf();
			TeackerEmail tem=new TeackerEmail();
			tem.TeaPdfG();
			TeacherEmail send = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email

//			SendSMS smre1=new SendSMS();
//			smre1.main(args);

			
			
			break;
		case "abdul@paytm.8002":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps1=new HallTicket();
			hps1.Hallpdf();
			TeackerEmail tem1=new TeackerEmail();
			tem1.TeaPdfG();
			TeacherEmail send1 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		case "innamul@paytm.8003":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps2=new HallTicket();
			hps2.Hallpdf();
			TeackerEmail tem2=new TeackerEmail();
			tem2.TeaPdfG();
			TeacherEmail send2 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		case "hdfc.2013181058004":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps3=new HallTicket();
			hps3.Hallpdf();
			
			TeackerEmail tem3=new TeackerEmail();
			tem3.TeaPdfG();
			TeacherEmail send3= new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		case "hdfc.2013181058005":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps4=new HallTicket();
			hps4.Hallpdf();
			TeackerEmail tem4=new TeackerEmail();
			tem4.TeaPdfG();
			TeacherEmail send4 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		case "hdfc.2013181058006":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps5=new HallTicket();
			hps5.Hallpdf();
			TeackerEmail tem5=new TeackerEmail();
			tem5.TeaPdfG();
			TeacherEmail send5 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		case "hdfc.2013181058008":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps6=new HallTicket();
			hps6.Hallpdf();
			TeackerEmail tem6=new TeackerEmail();
			tem6.TeaPdfG();
			TeacherEmail send6 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		case "hdfc.2013181058009":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps7=new HallTicket();
			hps7.Hallpdf();
			TeackerEmail tem7=new TeackerEmail();
			tem7.TeaPdfG();
			TeacherEmail send7 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		case "hdfc.2013181058010":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps8=new HallTicket();
			TeackerEmail tem8=new TeackerEmail();
			tem8.TeaPdfG();
			TeacherEmail send8 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			hps8.Hallpdf();
			break;
		case "hdfc.2013181058011":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps9=new HallTicket();
			TeackerEmail tem9=new TeackerEmail();
			tem9.TeaPdfG();
			TeacherEmail send9 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			hps9.Hallpdf();
			break;
		case "hdfc.2013181058012":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps10=new HallTicket();
			hps10.Hallpdf();
			TeackerEmail tem10=new TeackerEmail();
			tem10.TeaPdfG();
			TeacherEmail send10 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		case "hdfc.2013181058013":
			System.out.println("Transaction id matching successfully");
			System.out.println("Fees Paid");
			System.out.println("Thank you");
			HallTicket hps11=new HallTicket();
			hps11.Hallpdf();
			TeackerEmail tem11=new TeackerEmail();
			tem11.TeaPdfG();
			TeacherEmail send11 = new TeacherEmail("innamultechsites@gmail.com", "Student Fees Paid Update","Register Number:Paid His fees");//receiver email
			
			break;
		default:
		
			System.out.println("\n\tTransaction not matching");
			System.out.println("\tTry again later");
			System.exit(0);
			break;
		}
	}
}