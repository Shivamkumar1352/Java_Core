package OperatorsAssignment1;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long userId = 12219665;
		long password = 123456;
		long EnteredUserId = 12219665;
		long EnteredPassword = 123456;
		boolean lock = false;
		int loginAttemp = 0;
		boolean loginSuccess = userId==EnteredUserId && password == EnteredPassword && !lock ? true : false;
		System.out.println(loginSuccess?"Logged in successfully":"Login failed");
		loginAttemp += loginSuccess?0:1;
		lock = loginAttemp>5?true:false;
		System.out.println(lock?"Your device is locked":"");
	}

}
