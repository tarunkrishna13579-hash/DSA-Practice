package HashMap;
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		hm.put("banana",200 );
		hm.put("Apple",500 );
		hm.put("Carrot",300 );
		hm.put("Orange",250 );
		hm.put("Orange",255 );
		hm.put("beetroot", 250);
		
System.out.println(hm);
		System.out.println(hm.get("Apple"));
		System.out.println(hm.containsKey("Apple"));
		System.out.println(hm.containsValue(250));
		System.out.println(hm.size());
		
		for(String s:hm.keySet()) { //keySet is for unique value
			System.out.println(s + " "+hm.get(s));
		}
		
		for(Map.Entry<String, Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
