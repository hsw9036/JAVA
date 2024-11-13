package ch05;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("자신맨","010-1111-1111");
		hm.put("bts","010-2222-2222");
		hm.put("아파트","010-1111-1111");
		
		Iterator<String> it = hm.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		
		}

	}

}
