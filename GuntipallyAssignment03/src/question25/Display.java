package question25;

public interface Display {
	default void display(){  
        System.out.println("Hello Jai");  
    }  
    //Abstract method  
    void displayMore(String msg);
}
