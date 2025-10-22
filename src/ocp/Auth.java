package ocp;

public class Auth {
	private IAuth authInterface;
	public Auth(IAuth authInterface) {
		this.authInterface=authInterface;
	}
	public boolean auth(String pass, String log) {
		return authInterface.signIn(log, pass);
	}
}
