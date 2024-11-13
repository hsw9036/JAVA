package ch05;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest1 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> Im = new LinkedHashMap<String, Integer>();
		Im.put("국어", 98);
		Im.put("영어", 100);
		Im.put("수학", 86);
		Im.put("사회", 99);
		Im.put("과학", 89);
		System.out.println("당신의 성적 : " + Im + total_avg(Im));
		

	}

	public static String total_avg(Map m) {
		int total = 0;
		int count = m.size();
		Collection<Integer> c = m.values();
		Iterator<Integer> iterator = c.iterator();
		while(iterator.hasNext()) {
			total = total + iterator.next();
		}
		return " 총점=" + total + " 평균 =" + (double)total/count;
	}
}
