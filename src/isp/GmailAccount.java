package isp;

public class GmailAccount implements IEmail{
	  String name, emailAddress;
	  
	  public GmailAccount (String name, String emailAddress) {
		  this.name = name;
		  this.emailAddress = emailAddress;
	  }

	  @Override
	  public String getEmail() {
	      return emailAddress;
	  }

}