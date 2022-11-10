package question25;

public class DefaultMethod implements Display{
	   public void displayMore(String msg){           
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	        DefaultMethod dm = new DefaultMethod(); 
	        //calling default method 
	        dm.display();    
	        //calling abstract method
	        dm.displayMore("Hello w3spoint");    
	    }  
}
