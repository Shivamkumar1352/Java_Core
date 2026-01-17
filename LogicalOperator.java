public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 21;
		boolean bothEven = a%2==0 && b%2==0;
		System.out.println(bothEven);
		boolean anyEven = a%2==0 || b%2==0;
		System.out.println(anyEven);
	}

}
