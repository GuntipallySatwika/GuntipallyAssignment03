package question4;

public class ClassPrivateB extends ClassA{

	void display() // trying to override display() {
    System.out.println("Sub class");
 }
 public static void main(String[] args) {
    ClassA obj = new ClassPrivateB();
    obj.display();
 }

}
