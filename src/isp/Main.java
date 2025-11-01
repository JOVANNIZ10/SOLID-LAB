package isp;

public class Main {
	
	  public void main(String [] args) {
		  GmailAccount ga = new GmailAccount("Jon",  "jon@gmail.com");
	      EmailSender es= new EmailSender();

	      es.sendEmail(ga, "Kaixo!");
	}

}