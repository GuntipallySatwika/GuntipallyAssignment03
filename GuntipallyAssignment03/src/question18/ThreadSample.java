package question18;

public class ThreadSample extends Thread{
	public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
			 ThreadSample t1=new ThreadSample();  
		  t1.start();  
		  t1.start();  
		 }  
}
