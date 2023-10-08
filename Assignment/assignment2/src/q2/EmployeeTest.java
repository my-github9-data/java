package q2;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee e1=new Employee();
		e1.acceptData();
		e1.displayData();
		
		System.out.println("----------------------");
		Employee employee1 = new Employee();
		employee1.setMonthlysalary(10000);
		employee1.annualSalary();
		employee1.raise();
		Employee employee2 = new Employee();
		employee2.setMonthlysalary(50000);
		employee2.annualSalary();
		employee2.raise();
	}

}
