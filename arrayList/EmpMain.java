package arrayList;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee(121, "Shivam"));
		a.add(new Employee(122, "Ravi"));
		a.add(new Employee(123, "Bhavik"));
		a.add(new Employee(124, "Shyam"));
		
		String name =sc.nextLine();
		
		boolean notFound = true;
		
		ListIterator<Employee> i = a.listIterator();
		
		while(i.hasNext() && notFound) {
			Employee temp = (Employee)(i.next());
			if(temp.getName().equals(name)) {
				notFound = false;
				System.out.println("Employee with name "+temp.getName()+" and id: "+temp.getId()+" has found!!!");
			}
		}
		if(notFound) {
			System.out.println("There is no employee with name "+name+" exist");
		}
		sc.close();
	}

}
