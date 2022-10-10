package PolymorphismDemo;

public class main {
public static void main(String[] args) 
{
//	Baselogger[] logger=new Baselogger[] {new EmailLogger(),new DatabaseLogger(),new FileLogger()};
//	for (Baselogger baselogger : logger) {
//		baselogger.log("log mesajı");
//	}
	CustomerManager customerManager=new CustomerManager(new EmailLogger());
	customerManager.add();
	
	
}
}
