package mapProgram;
import java.util.LinkedHashMap;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Object,Object> map = new LinkedHashMap<>();
		
		map.put(1, "Shivam");
		map.put(2, "Bhavik");
		map.put(3, "Rohit");
		System.out.println(map);
		
		map.putFirst(4, "Ravi");
		System.out.println(map);
		
		map.putLast(5, "abhi");
		System.out.println(map);
		
		map.pollFirstEntry();
		System.out.println(map);
		
		map.pollLastEntry();
		System.out.println(map);
	}

}
