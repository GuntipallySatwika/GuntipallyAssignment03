package question12;

public class FinalizeSample {
	 public void finalize() throws Throwable{
	      System.out.println("Object garbage collected.");
	   }
	   public static void main(String[] args) {

		   FinalizeSample t = new FinalizeSample();
	      t = null;
	      System.gc();
	   }
}
