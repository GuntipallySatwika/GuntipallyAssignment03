package question26;

public class SingletonLazyInitialization {
	  private static SingletonLazyInitialization sSoleInstance;

	    private SingletonLazyInitialization(){}  //private constructor.

	    public static SingletonLazyInitialization getInstance(){
	        if (sSoleInstance == null){ //if there is no instance available... create new one
	            sSoleInstance = new SingletonLazyInitialization();
	        }

	        return sSoleInstance;
	    }
}
