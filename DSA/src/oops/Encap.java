package oops;

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setEmployeeId(1);
		emp1.setEmployeeName("Virat Kohli");
		
		System.out.println(emp1.getEmployeeId());
		System.out.println(emp1.getEmployeeName());
		
		Employee emp2 = new Employee(2,"Chethan kumar N");
		System.out.println(emp2.getEmployeeId());
		System.out.println(emp2.getEmployeeName());

	}

}
