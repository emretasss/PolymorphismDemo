package polymorphismDemo;

public class FileLogger extends Baselogger{
	public void log(String message) {
		System.out.println("file logger:"+message);
	}

}
