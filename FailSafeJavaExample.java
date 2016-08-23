package in.ccc2607.examples;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeJavaExample {
	public static void main(String arr[]){
		Map<Integer,String>failsafelist =new ConcurrentHashMap<Integer,String>();
		failsafelist.put(1, "abc");
		failsafelist.put(2, "xyz");
		System.out.println(failsafelist.keySet());
		for (int i : failsafelist.keySet()) {
	        if (i == 2) {
	        	failsafelist.remove(i);
	        }
	    }

		System.out.println(failsafelist);
	}

}
