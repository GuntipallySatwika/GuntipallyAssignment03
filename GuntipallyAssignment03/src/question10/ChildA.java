package question10;

public class ChildA extends Parent{
	 void msg()throws Exception {  
		    System.out.println("child method");  
		  }    
		    
		  public static void main(String args[]) {    
		   Parent p = new ChildA();    
		     
		   try {    
		   p.msg();    
		   }  
		   catch (Exception e){}   
		  
		  }    
		}     
