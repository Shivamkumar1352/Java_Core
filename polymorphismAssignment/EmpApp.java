package polymorphismAssignment;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Developer();
		emp1.calculateSalary();
		Employee emp2 = new Intern();
		emp2.calculateSalary();
		Employee emp3 = new Manager();
		emp3.calculateSalary();
	}

}
