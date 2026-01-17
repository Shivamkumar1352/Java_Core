package arrayList;
import java.util.ArrayList;

public class Search {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		//checks if object is present or not
		System.out.println(a.contains(30));
		
		//returns index of object
		System.out.println(a.indexOf(30));
	}
}
