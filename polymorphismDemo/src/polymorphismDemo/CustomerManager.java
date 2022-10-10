package polymorphismDemo;

public class CustomerManager {
     private Baselogger logger;
     public  CustomerManager(Baselogger logger)
     {
    	 this.logger=logger;
     }
     public void add()
     {
    	 System.out.println("müsteri eklendi");
    	 this.logger.log("log mesajı");
     }
     	
	
}
