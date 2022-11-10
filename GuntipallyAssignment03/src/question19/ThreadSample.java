package question19;

public class ThreadSample extends Thread{
	public void run()
	 {
	  System.out.println("Thread started running..");
	 }
	 public static void main( String args[] )
	 {
		 ThreadSample mt = new  ThreadSample();
	  	mt.start();
	 }

}
