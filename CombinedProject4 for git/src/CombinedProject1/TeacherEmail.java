package CombinedProject1;
import javax.mail.*;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.*;
import java.util.*;
public class TeacherEmail {
	
	final String senderEmail = "innamulgooogle@gmail.com"; //change email address
	final String senderPassword = "Innamul@gooogle1"; //change password
	final String emailSMTPserver = "smtp.gmail.com";
	final String emailServerPort = "465";
	String receiverEmail = null;
	static String emailSubject;
	static String emailBody;
	public TeacherEmail(String receiverEmail, String subject, String body) {
		//receiver email
		this.receiverEmail = receiverEmail;
		//subject
		this.emailSubject = subject;
		//body
		this.emailBody = body;
		
		Properties props = new Properties();
		props.put("mail.smtp.user",senderEmail);
		props.put("mail.smtp.host", emailSMTPserver);
		props.put("mail.smtp.port", emailServerPort);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.socketFactory.port", emailServerPort);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");
		SecurityManager security = System.getSecurityManager();
		
		try {
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);
			msg.setText(emailBody);
			//System.out.println(emailBody);
			msg.setSubject(emailSubject);
			msg.setFrom(new InternetAddress(senderEmail));
			
			
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
			  
		    String filename = "D:\\Pdf Generrator\\Teachere.pdf";//change accordingly  
		    DataSource source = new FileDataSource(filename);  
		    messageBodyPart2.setDataHandler(new DataHandler(source));  
		    messageBodyPart2.setFileName(filename); 
		    Multipart multipart = new MimeMultipart();
		    multipart.addBodyPart(messageBodyPart2);
		    msg.setContent(multipart ); 
		    
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmail));
			Transport.send(msg);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public class SMTPAuthenticator extends javax.mail.Authenticator {
		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(senderEmail, senderPassword);
		}
	}				
}
	





