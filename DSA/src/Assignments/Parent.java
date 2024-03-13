package Assignments;

public class Parent {
	
	int radius = 0;
	double pi=3.14;
	
	public Parent(int rad) {
		this.radius=rad;
	}
	
	public void calculateArea() {
		double area = 2 * pi * radius;
	}
	
}
