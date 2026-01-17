package arrayList;
import java.util.ArrayList;

public class AddingData {
	public static void main(String[] args) {
		ArrayList<Object> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(null);
		al1.add("Hello");
		System.out.println(al1);
		
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add(60);
		al2.add(70);
		
		//add collection inside a collection
		al2.add(al1);
		System.out.println(al2);
		
		//addAll 
		al2.addAll(al1);
		System.out.println(al2);
		
		//98 will at at index 4
		al1.add(4,98);
		System.out.println(al1);
		
		al2.addAll(0,al1);
		System.out.println(al2);
		
	}
}
