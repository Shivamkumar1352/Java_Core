package numberProgram;

import java.util.Scanner;

public class Q1 {
	
	public static int numOfDigits(int n) {
		int ans = 0;
		while(n>0) {
			ans++;
			n/=10;
		}
		return ans;
	}
	
	public static int sumOfDigits(int n) {
		int ans = 0;
		while(n>0) {
			ans+=n%10;
			n/=10;
		}
		return ans;
	}
	
	public static int productOfDigits(int n) {
		int ans = 1;
		while(n>0) {
			ans*=n%10;
			n/=10;
		}
		return ans;
	}
	
	public static boolean spyNumber(int n) {
		boolean check = false;
		if(sumOfDigits(n)==productOfDigits(n)) {
			check = true;
		}
		return check;
	}
	
	public static boolean checkPrime(int n) {
		for(int i=2; i*i<=n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void factors(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void factorsOfDigits(int n) {
		while(n>0) {
			System.out.print( n%10 + " : ");
			factors(n%10);
			n/=10;
		}
	}
	
	public static int factorial(int n) {
		int ans  = 1;
		for(int i=1; i<=n; i++)
			ans*=i;
		return ans;
	}
	
	public static void factorialsOfDigits(int n) {
		while(n>0) {
			System.out.println("factorial of digit "+n%10+" is: "+factorial(n%10));
			n/=10;
		}
	}
	
	public static boolean sunny(int n) {
		int sum = 0; 
		int num = n;
		while(n>0) {
			sum+=factorial(n%10);
			n/=10;
		}
		return sum==num;
	}
	
	public static boolean neon(int n) {
		return n==sumOfDigits(n*n);
	}
	
	public static boolean armstrong(int n) {
		int len = numOfDigits(n);
		int ans = 0;
		int temp = n;
		while(temp>0) {
			int a = 1;
			for(int i=1; i<=len; i++)
				a*=temp%10;
			ans+=a;
			temp/=10;
		}
		return ans==n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("length of digits is: "+ numOfDigits(n));
		System.out.println("sum of digits is: "+ sumOfDigits(n));
		System.out.println("product of digits is: "+productOfDigits(n));
		System.out.println(spyNumber(n)?"It is a spy number":"Not a spy number");
		System.out.println(checkPrime(n)?"Is a Prime number":"Not a Prime number");
		System.out.println("factors of numbers are: ");
		factors(n);
		System.out.println("factors of digits are: ");
		factorsOfDigits(n);
		System.out.println("factorial is: "+factorial(n));
		factorialsOfDigits(n);
		System.out.println(sunny(n)?"Is a sunny number":"Not a sunny number");
		System.out.println(neon(n)?"Is a neon number":"not a neon number");
		System.out.println(armstrong(n)?"Is a armstrong number":"not a armstrong number");
		
		sc.close();
	}

}
