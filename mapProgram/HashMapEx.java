package mapProgram;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Object,Object> map = new HashMap<>();
		map.put(1, "Shivam");
		map.put(1, "Bhavik");
		map.put(1, "Vivek");
		System.out.println(map);
		
		map.put(2, "Shivam");
		map.put(3, "Vivek");
		map.put(5, "Kavya");
		map.put(4, "Harshit");
		System.out.println(map);
		
		map.putIfAbsent(4, "Ravi");
		System.out.println(map);
		
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for(Object o: map.entrySet()) {
				System.out.print(o+", ");
		}
		System.out.println();
		
		for(Object o: map.keySet()) {
			System.out.println(o+" : "+map.get(o));
		}
		
		Iterator<Map.Entry<Object, Object>> i =  map.entrySet().iterator();
		
		while(i.hasNext()) {
			Map.Entry<Object, Object> e = i.next();
			System.out.println("Key: "+e.getKey()+" ,Value: "+e.getValue());
		}
		
		
		
		
	}
}
