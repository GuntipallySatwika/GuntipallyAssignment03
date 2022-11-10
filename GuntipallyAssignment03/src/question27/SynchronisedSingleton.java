package question27;

public class SynchronisedSingleton {
	 private static SynchronisedSingleton instance = null;

	   private SynchronisedSingleton() {}

	   public static synchronized SynchronisedSingleton getInstance() {
	       if (instance == null) {
	           instance = new SynchronisedSingleton();
	       }

	       return instance;
	   }
}
