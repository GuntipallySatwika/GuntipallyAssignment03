package accessmodifiers;

public class classB extends ClassA{
	public void method()
    {
        System.out.println("Hello");
    }
	
public static void main(String[] args) {
	 classB b = new classB();
     b.method();
}
}
