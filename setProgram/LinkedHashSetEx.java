package setProgram;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(22);
		set.add("Hello");
		set.add(null);
		set.add(10);
		System.out.println(set);
	}
}
