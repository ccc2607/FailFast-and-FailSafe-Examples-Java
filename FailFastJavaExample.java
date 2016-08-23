package in.ccc2607.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastJavaExample {
	public static void main(String arr[]){
		List<String>failfastlist =new ArrayList<String>();
		failfastlist.add("abc");
		failfastlist.add("klm");
		failfastlist.add("xyz");
		Iterator i =failfastlist.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			failfastlist.add("pqr");
		}
	}

}
