package q1;

class BoxClass<T extends Employee> {
	private T obj;
	public void set(T val) {
		this.obj = val;
	}
	public T get() {
		return this.obj;
	}
	
	public double getTotalSal() {
		return obj.calculateTotalSalary();
	}
	
	public static void main(String [] args) {
		Manager m= new Manager(50000, "Sarvesh", 10000);
		m.acceptManager();
		m.displayManager();
		
		BoxClass<Manager> b1=new BoxClass<>();
		b1.set(m);
		System.out.println("Manager total Salary:"+b1.getTotalSal());
		
		Salesman s= new Salesman(10000, "salesman1");
		s.acceptSalesman();
		s.displaySalesman();
		BoxClass<Employee> b2=new BoxClass<>();
		b2.set(s);
		System.out.println("Salesman/Manager total Sal: "+b2.getTotalSal());
	}
}
