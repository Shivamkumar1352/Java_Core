package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		//stream()
		al.stream()
			.forEach(System.out::println);
		
		List<String> names = Arrays.asList("Shivam", "Bhavik", "Rohit", "Abhi");
		
		names.stream()
			.forEach(System.out::println);
		
		//count()
		long count = names.stream()
			.count(); //long
		System.out.println(count);
		
		//filter()
		names.stream()
		.filter(s->s.length()>5)
		.forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		
		//map
		List<Integer> doubled = numbers.stream()
		.map(n->2*n)
		.collect(Collectors.toList());
		
		System.out.println(doubled);
		
		
		List<String>  namesInUpper = names.stream()
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
			System.out.println(namesInUpper);
	}
}
