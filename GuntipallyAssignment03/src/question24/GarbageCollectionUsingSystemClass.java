package question24;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionUsingSystemClass {
	   public static void main(String args[]) {
	        Runtime runtimeObj = Runtime.getRuntime();
	        for (int i=0; i<= 100000; i++) {
	            List<Integer> list = new ArrayList<>();
	            list.add(1);
	            list.add(2);
	            list.add(3);
	        }
	        System.out.println("Memory before invoking the Garbage Collector : " + runtimeObj.freeMemory());
	        System.gc();
	        System.out.println("Memory after invoking the Garbage Collector  : " + runtimeObj.freeMemory());
	    }
}
