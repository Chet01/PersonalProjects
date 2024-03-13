package oops;

public class A {
	
    A() {
		System.out.println("Inside a constructor A");
	}

	static {
		System.out.println("Inside a static block!");
	}
	
    {
		System.out.println("Inside a non static block!");
	}
	
	public void doLogin() {
		System.out.println("Logged in Successfully!");
	}
}
