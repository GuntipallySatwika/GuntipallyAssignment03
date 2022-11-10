package question14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronisationSample {
	 public static void main (String[] args) {
	      List<String> list = new ArrayList<String>();
	      list.add("Hello");
	      list.add("Hi");
	      list.add("World");
	      list = Collections.synchronizedList(list);
	      synchronized(list) {
	         Iterator itr = list.iterator();
	         while (itr.hasNext())
	         System.out.print(itr.next()+" ");
	      }
	   }
}