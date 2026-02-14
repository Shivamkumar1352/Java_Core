package lambaExpression;
import java.util.ArrayList;
import java.util.Collections;
public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> al = new ArrayList<>();
		al.add(new Book(100,"Jungle Book"));
		al.add(new Book(2000,"Java"));
		al.add(new Book(500,"CPP"));
		al.add(new Book(300,"SQL"));
		
		for(Book b:al) {
			System.out.println(b);
		}
		System.out.println();
		
		Collections.sort(al,(Book a, Book b)-> a.price-b.price);
		
		for(Book b:al) {
			System.out.println(b);
		}
	}

}
