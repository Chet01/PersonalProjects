package oops;

public class Employee {

	private int employeeId;
	private String employeeName;
	
	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
		this.employeeId=i;
		this.employeeName=string;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
}
