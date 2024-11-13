package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("배");
		set.add("키위");
		set.add("사과");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
//		set.clear();
		System.out.println();
		System.out.println(set.toString());
		
		System.out.println(set.contains("사과"));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
	}
	
}
