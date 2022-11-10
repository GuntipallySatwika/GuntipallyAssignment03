package generics;

public class GenericsDriver {

	public static void main(String[] args) {
		// instance of integer type
		Generics<Integer> iObj = new Generics<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Generics<String> sObj = new Generics<String>("Satwika");
        System.out.println(sObj.getObject());

	}

}
