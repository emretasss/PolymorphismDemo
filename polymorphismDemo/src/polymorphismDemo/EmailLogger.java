package polymorphismDemo;

public class EmailLogger extends Baselogger {
	public void log(String message) {
		System.out.println("email logger:"+message);
	}
}
