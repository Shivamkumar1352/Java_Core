package twoDimesionalArray;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{10,20,30},{21,22,23},{33,44,55}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
