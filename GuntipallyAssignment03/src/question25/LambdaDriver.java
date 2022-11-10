package question25;

public class LambdaDriver {
	public static void main(String args[]) 
    { 
        //lambda expression
        LambdaSample fobj = (int x, int y)->System.out.println(x+y); 
 
        System.out.print("The result = ");
        fobj.abstract_func(5,5); 
        fobj.default_Fun();
    } 
}
