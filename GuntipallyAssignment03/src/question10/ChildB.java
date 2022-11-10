package question10;

public class ChildB extends Parent{
	void msg()throws ArithmeticException {  
	    System.out.println("child method");  
	  }    
	    
	  public static void main(String args[]){    
	   Parent p = new ChildB();    
	     
	   try {    
	   p.msg();    
	   }  
	   catch(Exception e) {}    
	  }    
}
