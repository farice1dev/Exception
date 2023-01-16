package HashMap;

import java.util.HashMap;

public class Lms0 {
	public static void main(String[]args) {
		HashMap<Integer, String>lms=new HashMap<>();
		lms.put(123,"Dooban");
		lms.put(847,"Kiruba");
		lms.put(596,"Venus");
		lms.put(485,"Sabo");
		
	/*	lms.forEach((x,y)->System.out.println(x+" "+y));
		lms.keySet().forEach(x->System.out.println (x));
		lms.values().forEach(y->System.out.println(y)); */
		
		for(Integer id:lms.keySet()) {
			if(id%2==0) {
				System.out.println(id+" is even");
			}
			else {
				System.out.println(id+" is odd");
			}
			
		}
		
	/*	for(Integer id:lms.keySet()) {
			System.out.println(id+" "+lms.get(id));
		}
		System.out.println("\n");
		for(Integer id:lms.keySet()) {
			if(lms.get(id).contains("a")||lms.get(id).contains("e")||lms.get(id).contains("i")||lms.get(id).contains("o")||lms.get(id).contains("u")) {
				System.out.println(lms.get(id)+" contains Vowels");
			}
		}*/
	/*	int max=0;
		for(Integer id:lms.keySet()) {
			if(id>=max) {
				max=id;
			}
		}
			System.out.println(max);
		*/
		
	}

}
