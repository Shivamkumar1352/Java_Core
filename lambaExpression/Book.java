package lambaExpression;

public class Book {
	String name;
	int price;
	Book(){
		
	}
	Book(int price, String name){
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "price: "+this.price+", name: "+this.name;
	}
	
}
