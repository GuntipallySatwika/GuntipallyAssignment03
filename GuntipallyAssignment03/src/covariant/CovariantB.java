package covariant;

public class CovariantB extends CovariantA{
	@Override  
	CovariantB get(){
		return this;
		}    
	void message(){
		System.out.println("welcome to covariant return type");
		}    
	    

	public static void main(String[] args) {
		new CovariantB().get().message();    

	}

}
